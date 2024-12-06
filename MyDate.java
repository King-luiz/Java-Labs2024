//import java.time.LocalDate;

public class MyDate {

    private int year;
    private int month;
    private int day;


    private static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    public int getDayOfWeek(int year, int month, int day) {
        // Implement a day-of-week calculation algorithm (e.g., Zeller's congruence)
        // ...
        return 0; // Placeholder, replace with actual calculation
    }

    public int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return DAYS_IN_MONTHS[month - 1];
        }
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }
        this.month = month;
        // Adjust day if necessary for February in leap years
        if (month == 2 && day > 28 && !isLeapYear(year)) {
            day = 28;
        }
    }

    public void setDay(int day) {
        if (day < 1 || day > getDaysInMonth(month, year)) {
            throw new IllegalArgumentException("Invalid day");
        }
        this.day = day;
    }

    public MyDate nextDay() {
        day++;
        if (day > getDaysInMonth(month, year)) {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            nextYear();
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            day = getDaysInMonth(month - 1, year);
            previousMonth();
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month < 1) {
            month = 12;
            previousYear();
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        return this;
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    //main class
            public static void main(String[] args) {
            MyDate today = new MyDate(2023, 11, 3);
            System.out.println("Today's date: " + today);
    
            today.nextDay();
            System.out.println("Tomorrow's date: " + today);
    
            today.previousMonth();
            System.out.println("Previous month: " + today);
    
            today.setYear(2025);
            System.out.println("Set year to 2025: " + today);
        }
    
}