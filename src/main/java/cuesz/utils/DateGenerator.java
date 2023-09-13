package cuesz.utils;

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class DateGenerator {
//    public static String generateFixedDate() {
//        // Get the current date
//        LocalDate currentDate = LocalDate.now();
//
//        // Set the day to 26 and keep the current month and year
//        LocalDate fixedDate = LocalDate.of(currentDate.getYear(), currentDate.getMonth(), 27);
//
//        // Format the date as "dd-MM-yyyy"
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        return fixedDate.format(formatter);
//    }
//
//    public static void main(String[] args) {
//        String date = generateFixedDate();
//        System.out.println(date); // Output: 26-09-2023 (for September 2023)
//    }
//}


/*************************************************************************************************************************************************/

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class DateGenerator {
//    public static String generateDateSevenDaysAhead() {
//        // Get the current date
//        LocalDate currentDate = LocalDate.now();
//
//        // Add 7 days to the current date
//        LocalDate sevenDaysAhead = currentDate.plusDays(7);
//
//        // Format the date as "dd-MM-yyyy"
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        return sevenDaysAhead.format(formatter);
//    }
//
//    public static void main(String[] args) {
//        String date = generateDateSevenDaysAhead();
//        System.out.println(date); // Output: The date 7 days from now in "dd-MM-yyyy" format
//    }
//}

/*************************************************************************************************************************************************/

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class DateGenerator {
//    public static String generateDateSevenDaysAhead() {
//        // Get the current date
//        LocalDate currentDate = LocalDate.now();
//
//        // Add 7 days to the current date
//        LocalDate sevenDaysAhead = currentDate.plusDays(7);
//
//        // Check if the resulting date is in the same month as the current date
//        if (sevenDaysAhead.getMonth() == currentDate.getMonth()) {
//            // Same month, no need to click "Next Month"
//            return sevenDaysAhead.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//        } else {
//            // Different month, you need to click "Next Month"
//            return "07-" + sevenDaysAhead.getMonthValue() + "-" + sevenDaysAhead.getYear();
//        }
//    }
//
//    public static void main(String[] args) {
//        String date = generateDateSevenDaysAhead();
//        System.out.println(date); // Output: The date 7 days from now in "dd-MM-yyyy" format
//    }
//}

/***********************************************/



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