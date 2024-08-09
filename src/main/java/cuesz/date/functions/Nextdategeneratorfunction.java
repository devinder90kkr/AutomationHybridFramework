package cuesz.date.functions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nextdategeneratorfunction {
    public static String generateTomorrowDate() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get tomorrow's date by adding one day to the current date
        LocalDate tomorrowDate = currentDate.plusDays(5);

        // Format the date as "dd-MM-yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return tomorrowDate.format(formatter);
    }

    public static void main(String[] args) {
        String date = generateTomorrowDate();
        System.out.println(date); // Output: Tomorrow's date in the "dd-MM-yyyy" format
    }
}
