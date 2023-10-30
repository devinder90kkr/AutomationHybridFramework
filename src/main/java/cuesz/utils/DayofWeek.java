package cuesz.utils;
import java.util.Calendar;

public class DayofWeek {

    public static String getDayName(int dayOfWeek) {
        String dayName;
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                dayName = "Monday";
                break;
            case Calendar.TUESDAY:
                dayName = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                dayName = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayName = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayName = "Friday";
                break;
            case Calendar.SATURDAY:
                dayName = "Saturday";
                break;
            case Calendar.SUNDAY:
                dayName = "Sunday";
                break;
            default:
                dayName = "Unknown";
                break;
        }
        return dayName;
    }
}