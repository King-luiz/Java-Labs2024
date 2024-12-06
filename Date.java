
public class Date{
    //attributes
    int day;
    int month;
    int year;

    // contractors
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

        //getters
        public int getDay(){
            return day;
        }
        public int getMonth(){
            return month;
        }
        public int getYear(){
            return year;
        }
        //setter
        public void setDay(int day){
            this.day = day;

        }
        public void setMonth(int month){
            this.month = month;
        }
        public void setYear(int year){
            this.year = year;
        }

        public void setDate(int dd, int mm, int yyyy){
        this.day = dd;
        this.month = mm;
        this.year = yyyy;
        }
        //toString

        public String toString(){
            return "Date ["+day+ "/"+month+ "/"+year+ "]";
        }

        //main class

        public static void main(String[] args) {
            //test1
            System.out.println("=======TIME 1========");
            System.out.println("                                ");
            Date d1 = new Date(2,10,2024);
            System.out.println(d1);

            System.out.println("                                  ");
           System.out.println("==========TIME 2========");
           System.out.println("                                  ");
            Date d2 = new Date(5,21,2020);
            System.out.println(d2);

        }




    }