package com.learning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {

        Date currentDate = new Date();
        SimpleDateFormat mySimpleDateFormat = new SimpleDateFormat("dd MMMM YYYY");
        
        try {
            System.out.println(mySimpleDateFormat.parse("13 diciembre 2030"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        String myFormattedDate = mySimpleDateFormat.format(currentDate);
        System.out.println(myFormattedDate);  

        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(2030, Calendar.AUGUST , 13,14,20);
        myCalendar.set(Calendar.MONTH, Calendar.DECEMBER);

        //Calculate elapsed time since x date
        myCalendar.set(2015, Calendar.AUGUST, 15);
        long millisecond = currentDate.getTime() - myCalendar.getTimeInMillis();
        System.out.println("Since " + mySimpleDateFormat.format(myCalendar.getTime()) + ", " + millisecond + " ms have passed.");
    }
}
