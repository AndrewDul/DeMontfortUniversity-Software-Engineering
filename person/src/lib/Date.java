package lib;


import java.text.DecimalFormat;

/**
 * A simple date record with day, month, year number values.
 * There is no validation in this class.
 * @author lz, la
 */
public class Date {
    private int day;    //1..31
    private int month;  //1..12
    private int year;
    
    /** Creates a new instance of Date with date 01/01/2001 */
    public Date() {
        day = 1;
        month = 1;
        year = 2001;
        //this(1,1,2001);
    }
    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    /** Returns a fomatted date string.
     * @return A date in the format dd/mm/yyyy
     */
    public String getDateString() {
        DecimalFormat f = new DecimalFormat("00");
        return f.format(day) + "/" + f.format(month) + "/" + year;
    }
        
    public String toString() {
        return "Date: " + day + "-" + month + "-" + year;
    }
}
