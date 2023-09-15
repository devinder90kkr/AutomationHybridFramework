package cuesz.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Currentdategenerator {
    public static String generateCurrentDate() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date as "dd-MM-yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return currentDate.format(formatter);
    }

    public static void main(String[] args) {
        String date = generateCurrentDate();
        System.out.println(date); // Output: Current date in the "dd-MM-yyyy" format
    }
}
