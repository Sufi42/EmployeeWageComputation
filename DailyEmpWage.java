package com.bl.empwage;

import java.util.Random;

public class DailyEmpWage {
    public static void main(String[] args) {
        int isPresent=1;
        final int WAGE_PER_HOUR = 20;
        final int WORKING_HRS_PER_DAY=8;

        Random r = new Random();
        int attendance = r.nextInt(3);
        if(attendance == isPresent){
            int dailywage= WAGE_PER_HOUR *  WORKING_HRS_PER_DAY;
            System.out.println(dailywage);
        }
        else{
            System.out.println("Employee is absent");
        }

    }
}
