package com.learning;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {

        Date myDate = new Date();
        SimpleDateFormat mySimpleDateFormat = new SimpleDateFormat("EEEE dd MMMM YYYY, H:mm a");
        
        String myFormattedDate = mySimpleDateFormat.format(myDate);
        System.out.println(myFormattedDate);  
        System.out.println(mySimpleDateFormat.toPattern());
        
        for(int i=0; i < 1000000;i++){}

        long timeToDo = (new Date().getTime()) - myDate.getTime();
        System.out.println("Time to do calculations: " + timeToDo + " ms.");

        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(2030, Calendar.AUGUST , 13,14,20);
        myCalendar.set(Calendar.MONTH, Calendar.DECEMBER);

        Date myCDate = myCalendar.getTime();
        myFormattedDate = mySimpleDateFormat.format(myCDate);

        System.out.println(myFormattedDate);
    }
}
