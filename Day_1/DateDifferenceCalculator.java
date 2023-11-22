public class DateDifferenceCalculator {
    // Days in each month for non-leap year
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Calculate the total number of days since year 0
    private static int calculateTotalDays(int date, int month, int year) {
        int days = 0;

        for (int y = 0; y < year; y++) {
            days += isLeapYear(y) ? 366 : 365;
        }

        for (int m = 0; m < month - 1; m++) {
            days += DAYS_IN_MONTH[m];
            if (m == 1 && isLeapYear(year)) {
                days++; // Leap year has an extra day in February
            }
        }

        days += date;
        return days;
    }

    // Calculate the difference in days between two dates
    public static int calculateDaysDifference(int date1, int month1, int year1, int date2, int month2, int year2) {
        int days1 = calculateTotalDays(date1, month1, year1);
        int days2 = calculateTotalDays(date2, month2, year2);

        // Calculate the difference in days
        int difference = days2 - days1;
        return difference;
    }

    public static void main(String[] args) {
        // Sample usage:
        int date1 = 10;
        int month1 = 6;
        int year1 = 2023;

        int date2 = 17;  
        int month2 = 7;
        int year2 = 2023;

        int difference = calculateDaysDifference(date1, month1, year1, date2, month2, year2);
        System.out.println("Difference in days: " + difference);
    }
}
