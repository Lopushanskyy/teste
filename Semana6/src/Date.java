public class Date {

    private final int day;
    private final int month;
    private final int year;
    private static final int[] DAYSINMONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int day, int month, int year){
        if(day<1 || day> DAYSINMONTH[month] || month <1 || month > 12 || year < 1)
            throw new IllegalArgumentException();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(String date){
        String [] result = date.split("-");
        int d = Integer.parseInt(result[0]);
        int m = Integer.parseInt(result[1]);
        int y = Integer.parseInt(result[2]);
        if(result.length > 3 || d<1 || d> DAYSINMONTH[m] || m <1 || m > 12 || y < 1){
            throw new IllegalArgumentException();
        }
        this.day = d;
        this.month = m;
        this.year = y;
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

    public Date nextDay(){

        int nextday = day + 1;
        int nextmonth = month;
        int nextyear = year;

        if(day == DAYSINMONTH[month]) {
            nextday = 1;
            nextmonth ++;
            if (month == 12) {
                nextmonth = 1;
                nextyear ++;
            }
        }

        return new Date(nextday, nextmonth, nextyear);
    }

    @Override
    public String toString() {
        return String.format("%02d", day) + "-" + String.format("%02d", month) + "-" + String.format("%04d", year);
    }

    public static void main(String[] args) {
        Date a = new Date(31,12,2023);
        System.out.println(a.nextDay());

        System.out.println();

        Date b = new Date("31-12-2023");
        System.out.println(b);
        System.out.println(b.nextDay());

        System.out.println();

        Date c = new Date("28-2-2023");
        System.out.println(c.nextDay());

        System.out.println();

        Date d = new Date("25-6-2023");
        System.out.println(d.nextDay());
    }
    
}
