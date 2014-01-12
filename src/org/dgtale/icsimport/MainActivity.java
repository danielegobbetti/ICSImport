/*
 * Copyright (C) 2013- Daniele Gobbetti
 * 
 * This file is part of icsimport.
 * 
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. 
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details. 
 * 
 * You should have received a copy of the GNU General Public License along with 
 * this program. If not, see <http://www.gnu.org/licenses/>
 */
package org.dgtale.icsimport;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.component.VEvent;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

	Uri data = intent.getData();

	try {
		//use ical4j to parse the event
		CalendarBuilder cb = new CalendarBuilder();
		Calendar calendar = null;
		calendar = cb.build(getStreamFromOtherSource(data));

		if (calendar != null) {

			Iterator i = calendar.getComponents(Component.VEVENT).iterator();
			//parse only the first event
			if (i.hasNext()) {
				VEvent event = (VEvent) i.next();

				Intent insertIntent = new Intent(Intent.ACTION_INSERT)
					.setType("vnd.android.cursor.item/event");

				if (event.getStartDate() != null)
					insertIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, event.getStartDate().getDate().getTime());

				if (event.getEndDate() != null)
					insertIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, event.getEndDate().getDate().getTime());

				if (event.getSummary() != null)
					insertIntent.putExtra(CalendarContract.Events.TITLE, event.getSummary().getValue());

				if (event.getDescription() != null)
					insertIntent.putExtra(CalendarContract.Events.DESCRIPTION, event.getDescription().getValue());

				if (event.getLocation() != null) 
					insertIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, event.getLocation().getValue());

				insertIntent.putExtra(CalendarContract.Events.ACCESS_LEVEL, CalendarContract.Events.ACCESS_PRIVATE);
				startActivity(insertIntent);

			}
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

    }

    protected InputStream getStreamFromOtherSource(Uri contentUri) throws FileNotFoundException {
	//this helps in dealing with content:// URIs
	    ContentResolver res = getApplicationContext().getContentResolver();
	    Uri uri = Uri.parse(contentUri.toString());
	    InputStream is;
	    try {
		    is = res.openInputStream(uri);
	    } catch (FileNotFoundException e) {
		    is = new ByteArrayInputStream(new byte[0]);
	    }
	    return is;
    }

}
