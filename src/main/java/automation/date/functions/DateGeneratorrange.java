package automation.date.functions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DateGeneratorrange {
    
    public static String generateFixedDate() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Set the day to 12 and keep the current month and year
        LocalDate fixedDate = LocalDate.of(currentDate.getYear(), currentDate.getMonth(), 12);

        // Check if the fixed date is in the past
        if (fixedDate.isBefore(currentDate)) {
            // Add 1 day to the current date
            fixedDate = currentDate.plusDays(1);
        }

        // Format the date as "dd-MM-yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fixedDate.format(formatter);
    }
    
    public static List<String> generateDateRange(LocalDate startDate, LocalDate endDate) {
        List<String> dateRange = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        while (!startDate.isAfter(endDate)) {
            dateRange.add(startDate.format(formatter));
            startDate = startDate.plusDays(1);
        }
        
        return dateRange;
    }

    public static void main(String[] args) {
        String fixedDate = generateFixedDate();
        System.out.println("Fixed Date: " + fixedDate);

        // Generate a date range from 01-08-2024 to 03-08-2024
        LocalDate startDate = LocalDate.of(2024, 8, 1);
        LocalDate endDate = LocalDate.of(2024, 8, 3);
        List<String> dateRange = generateDateRange(startDate, endDate);
        
        System.out.println("Date Range:");
        for (String date : dateRange) {
            System.out.println(date);
        }
    }
}
