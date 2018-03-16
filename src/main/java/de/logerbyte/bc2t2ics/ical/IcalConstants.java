package de.logerbyte.bc2t2ics.ical;

public class IcalConstants {

    // KEYS
    public static final String BEGIN_KEY = "BEGIN:";
    public static final String END_KEY = "END:";
    public static final String EVENT_SUMMARY = "SUMMARY:";
    public static final String EVENT_DESCRIPTION = "DESCRIPTION:";


    // VALUES
    public static final String CAL_VALUE = "VCALENDAR";
    public static final String EVENT_VALUE = "VEVENT";


    public static String createVcalHeader() {
        return "BEGIN:VCALENDAR\n" +
                "VERSION:2.0\n" +
                "PRODID:http://www.example.com/calendarapplication/\n" +
                "METHOD:PUBLISH";
    }

    public static String createEnd() {
        return "END:VCALENDAR";
    }

public static String createEvent(long startTime, long endTime, String summary, String description){
    return "BEGIN:VEVENT\n" +
            "UID:461092315540@example.com\n" +
            "ORGANIZER;CN=\"Alice Balder, Example Inc.\":MAILTO:alice@example.com\n" +
            "LOCATION:Somewhere\n" +
            "SUMMARY:"+summary+"\n" +
            "DESCRIPTION:"+description+"\n" +
            "CLASS:PUBLIC\n" +
            "DTSTART:"+startTime+"\n" +
            "DTEND:"+endTime+"\n" +
            "DTSTAMP:20060812T125900Z\n" +
            "END:VEVENT";
}


}
