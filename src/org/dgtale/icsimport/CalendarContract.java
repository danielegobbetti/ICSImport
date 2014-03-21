package org.dgtale.icsimport;

// disassembled from android 4.0 from public final class android.provider.CalendarContract {
// included into source so that android 2.1 can use it too. works for my android 2.2
public final class CalendarContract {
  public static final java.lang.String ACTION_EVENT_REMINDER = "android.intent.action.EVENT_REMINDER";
  public static final java.lang.String EXTRA_EVENT_BEGIN_TIME = "beginTime";
  public static final java.lang.String EXTRA_EVENT_END_TIME = "endTime";
  public static final java.lang.String EXTRA_EVENT_ALL_DAY = "allDay";
  public static final java.lang.String AUTHORITY = "com.android.calendar";
  public static final java.lang.String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
  public static final java.lang.String ACCOUNT_TYPE_LOCAL = "LOCAL";
  
  public final class Events {
	  public static final java.lang.String CALENDAR_ID = "calendar_id";
	  public static final java.lang.String TITLE = "title";
	  public static final java.lang.String DESCRIPTION = "description";
	  public static final java.lang.String EVENT_LOCATION = "eventLocation";
	  public static final java.lang.String EVENT_COLOR = "eventColor";
	  public static final java.lang.String STATUS = "eventStatus";
	  public static final int STATUS_TENTATIVE = 0;
	  public static final int STATUS_CONFIRMED = 1;
	  public static final int STATUS_CANCELED = 2;
	  public static final java.lang.String SELF_ATTENDEE_STATUS = "selfAttendeeStatus";
	  public static final java.lang.String SYNC_DATA1 = "sync_data1";
	  public static final java.lang.String SYNC_DATA2 = "sync_data2";
	  public static final java.lang.String SYNC_DATA3 = "sync_data3";
	  public static final java.lang.String SYNC_DATA4 = "sync_data4";
	  public static final java.lang.String SYNC_DATA5 = "sync_data5";
	  public static final java.lang.String SYNC_DATA6 = "sync_data6";
	  public static final java.lang.String SYNC_DATA7 = "sync_data7";
	  public static final java.lang.String SYNC_DATA8 = "sync_data8";
	  public static final java.lang.String SYNC_DATA9 = "sync_data9";
	  public static final java.lang.String SYNC_DATA10 = "sync_data10";
	  public static final java.lang.String LAST_SYNCED = "lastSynced";
	  public static final java.lang.String DTSTART = "dtstart";
	  public static final java.lang.String DTEND = "dtend";
	  public static final java.lang.String DURATION = "duration";
	  public static final java.lang.String EVENT_TIMEZONE = "eventTimezone";
	  public static final java.lang.String EVENT_END_TIMEZONE = "eventEndTimezone";
	  public static final java.lang.String ALL_DAY = "allDay";
	  public static final java.lang.String ACCESS_LEVEL = "accessLevel";
	  public static final int ACCESS_DEFAULT = 0;
	  public static final int ACCESS_CONFIDENTIAL = 1;
	  public static final int ACCESS_PRIVATE = 2;
	  public static final int ACCESS_PUBLIC = 3;
	  public static final java.lang.String AVAILABILITY = "availability";
	  public static final int AVAILABILITY_BUSY = 0;
	  public static final int AVAILABILITY_FREE = 1;
	  public static final java.lang.String HAS_ALARM = "hasAlarm";
	  public static final java.lang.String HAS_EXTENDED_PROPERTIES = "hasExtendedProperties";
	  public static final java.lang.String RRULE = "rrule";
	  public static final java.lang.String RDATE = "rdate";
	  public static final java.lang.String EXRULE = "exrule";
	  public static final java.lang.String EXDATE = "exdate";
	  public static final java.lang.String ORIGINAL_ID = "original_id";
	  public static final java.lang.String ORIGINAL_SYNC_ID = "original_sync_id";
	  public static final java.lang.String ORIGINAL_INSTANCE_TIME = "originalInstanceTime";
	  public static final java.lang.String ORIGINAL_ALL_DAY = "originalAllDay";
	  public static final java.lang.String LAST_DATE = "lastDate";
	  public static final java.lang.String HAS_ATTENDEE_DATA = "hasAttendeeData";
	  public static final java.lang.String GUESTS_CAN_MODIFY = "guestsCanModify";
	  public static final java.lang.String GUESTS_CAN_INVITE_OTHERS = "guestsCanInviteOthers";
	  public static final java.lang.String GUESTS_CAN_SEE_GUESTS = "guestsCanSeeGuests";
	  public static final java.lang.String ORGANIZER = "organizer";
	  public static final java.lang.String CAN_INVITE_OTHERS = "canInviteOthers";
	  }
	}

