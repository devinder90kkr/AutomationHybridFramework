package cuesz.utils;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

public class DateUtilspast2days {

    public static void clickOnDayBeforeYesterday(AppiumDriver driver) {
        String currentDay = getCurrentDay();
        Map<String, String> dayToAccessibilityIdMap = getDayToAccessibilityIdMap();
        String dayBeforeYesterday = getDayBeforeYesterday(currentDay);
        String dayBeforeYesterdayAccessibilityId = dayToAccessibilityIdMap.get(dayBeforeYesterday);
        driver.findElement(By.id(dayBeforeYesterdayAccessibilityId)).click();
    }

    private static String getCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return dayToDayString(dayOfWeek);
    }

    private static String getDayBeforeYesterday(String currentDay) {
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(currentDay)) {
                // Calculate the day before yesterday, considering wrap-around
                int indexTwoDaysBefore = i - 2;
                if (indexTwoDaysBefore < 0) {
                    indexTwoDaysBefore += 7; // Wrap around to the end of the array
                }
                return days[indexTwoDaysBefore];
            }
        }
        return null;
    }

    private static String dayToDayString(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                return "Sun";
            case Calendar.MONDAY:
                return "Mon";
            case Calendar.TUESDAY:
                return "Tue";
            case Calendar.WEDNESDAY:
                return "Wed";
            case Calendar.THURSDAY:
                return "Thu";
            case Calendar.FRIDAY:
                return "Fri";
            case Calendar.SATURDAY:
                return "Sat";
            default:
                return null;
        }
    }

    private static Map<String, String> getDayToAccessibilityIdMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Sun", "SunClicked");
        map.put("Mon", "MonClicked");
        // ... other days
        return map;
    }
}
