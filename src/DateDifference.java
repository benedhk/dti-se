import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    public static void main(String[] args) {
        // Given dates
        LocalDate date1 = LocalDate.parse("2024-03-19");
        LocalDate date2 = LocalDate.parse("2024-03-21");

        // Calculate the difference in days
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        // Print the result
        System.out.println("Days between " + date1 + " and " + date2 + ": " + daysBetween);
    }
}