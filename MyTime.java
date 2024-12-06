import java.time.LocalDateTime;
//import java.time.LocalTime;
public class MyTime {
    private int hour;
    private int minute;
    private int second;

    // Default constructor
    public MyTime() {
        this(0, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        hour = now.getHour();
        minute = now.getMinute();
        second = now.getSecond();
    }

    // Constructor with hour, minute, and second
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Set the time with hour, minute, and second
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // Getters and setters for hour, minute, and second
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
    }

    // Get the next second
    public MyTime nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    // Get the next minute
    public MyTime nextMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    // Get the next hour
    public MyTime nextHour() {
        hour = (hour + 1) % 24;
        return this;
    }

    // Get the previous second
    public MyTime previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    // Get the previous minute
    public MyTime previousMinute() {
        minute--;
        if (minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    // Get the previous hour
    public MyTime previousHour() {
        hour = (hour - 1 + 24) % 24;
        return this;
    }

    // String representation of the time in HH:MM:SS format
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //main class

    public static void main(String[] args) {

        //test for constructor arguments
        MyTime time1 = new MyTime();
        //System.out.println("Current time: " + time1);

        MyTime currentTime = new MyTime();
        System.out.println("Current time: " + currentTime);

        time1.nextHour();
        System.out.println("Next hour: " + time1);

        time1.previousMinute();
        System.out.println("Previous minute: " + time1);

        time1.setTime(23, 59, 59);
        System.out.println("Set time to 23:59:59: [" + time1 + "]");

        time1.nextSecond();
        System.out.println("Next second: " + time1);
    }
}
