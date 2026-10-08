import java.util.GregorianCalendar;

public class Exercise09_05 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Current year, month, and day:");
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (calendar.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));

      
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("\nYear, month, and day after setting time in milliseconds:");
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (calendar.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
