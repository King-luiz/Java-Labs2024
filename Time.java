public class Time {
    //attributes

    int hr;
    int  min;
    int sec;

    //default constructor
    public Time(){
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }

    //parametric constructors
    public Time (int hr,int min,int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    //setTime
    public void setTime(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    //getters
    public int getHours() {
        return hr;
    }
    public int getMinutes() {
        return min;
    }
    public int getSecond(){
        return sec;
    }

    //setters

    public void setHour(int hr){
        this.hr = hr;
    }
    public void setMinute(int min){
        this.min = min;
    }
    public void setSecond(int sec){
        this.sec = sec;
    }
    //toString
    public String toString(){
        return "Time ["+hr+ ":"+min+ ":"+sec+ "]";
    }
    //main class
    public static void main(String[] args) {
        //test

        Time t1 = new Time(2,20,45);
        System.out.println(t1);
    }
}


