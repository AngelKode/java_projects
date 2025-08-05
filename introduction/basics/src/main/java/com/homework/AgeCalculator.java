package com.homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        System.out.println("Enter your birthday dd/MM/yyyy.");
        Scanner scannerDate = new Scanner(System.in);
        String inputDate = scannerDate.nextLine().trim();

        if(inputDate.isBlank()){
            System.out.println("Invalid Date");
            return;
        }

        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date birthdayDate = dateFormat.parse(inputDate);
            Date currentDate = new Date();

            //Remove characters to only remain with the year
            dateFormat = new SimpleDateFormat("yyyy");

            //Get base years
            int birthdayYearValue = Integer.parseInt(dateFormat.format(birthdayDate));
            int currentDateYearValue = Integer.parseInt(dateFormat.format(currentDate));

            int currentYearsCount = currentDateYearValue - birthdayYearValue;

            //Calculate if we subtract 1 year or not depending on the actual month and day are lower than the current date
            dateFormat = new SimpleDateFormat("MM");

            int birthdayMonthValue = Integer.parseInt(dateFormat.format(birthdayDate));
            int currentDateMonthValue = Integer.parseInt(dateFormat.format(currentDate));

            dateFormat = new SimpleDateFormat("dd");

            int birthdayDayValue = Integer.parseInt(dateFormat.format(birthdayDate));
            int currentDateDayValue = Integer.parseInt(dateFormat.format(currentDate));

            if(currentDateMonthValue <= birthdayMonthValue && currentDateDayValue < birthdayDayValue){
                currentYearsCount--;
            }

            System.out.println("You are " + currentYearsCount + " years old.");

        }catch (Exception e){
            System.out.println("Error while parsing date");
        }

    }
}
