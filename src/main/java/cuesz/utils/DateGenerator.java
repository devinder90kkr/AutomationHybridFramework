package cuesz.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateGenerator {
    public static String generateFixedDate() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

     // Set the day to 12 and keep the current month and year
        LocalDate fixedDate = LocalDate.of(currentDate.getYear(), currentDate.getMonth(), 10);

        // Check if the fixed date is in the past
        if (fixedDate.isBefore(currentDate)) {
            // Add 1 day to the current date
            fixedDate = currentDate.plusDays(1);
        }

        // Format the date as "dd-MM-yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fixedDate.format(formatter);
    }

    public static void main(String[] args) {
        String date = generateFixedDate();
        System.out.println(date); // Output: 12-09-2023 (for September 2023) or later dates
    }
}



//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class DateGenerator {
//    public static String generateFixedDate() {
//        // Get the current date
//        LocalDate currentDate = LocalDate.now();
//
//        // Check if the "Next Month" button is present
//        boolean isNextMonthButtonPresent = checkNextMonthButton();
//
//        // Set the day to 12 and adjust the month and year accordingly
//        LocalDate fixedDate;
//        if (isNextMonthButtonPresent) {
//            fixedDate = LocalDate.of(currentDate.getYear(), currentDate.getMonth().plus(1), 10);
//        } else {
//            fixedDate = LocalDate.of(currentDate.getYear(), currentDate.getMonth(), 10);
//        }
//
//        // Check if the fixed date is in the past
//        if (fixedDate.isBefore(currentDate)) {
//            // Add 1 day to the current date
//            fixedDate = currentDate.plusDays(1);
//        }
//
//        // Format the date as "dd-MM-yyyy"
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        return fixedDate.format(formatter);
//    }
//
//    private static boolean checkNextMonthButton() {
//     
//        return true; 
//    }
//
//    public static void main(String[] args) {
//        String date = generateFixedDate();
//        System.out.println(date);
//    }
//}
