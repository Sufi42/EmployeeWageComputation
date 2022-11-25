package com.bl.empwage;

import java.util.Random;

public class DailyWageOfFullTimePartTime {
    public static void main(String[] args) {
        int isFullTime=1;
        int isPartTime=2;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY=8;
        final int PART_TIME=4;

        Random r = new Random();
        int attendance = r.nextInt(3);
        if(attendance == isFullTime){
            int dailywage= WAGE_PER_HOUR *  FULL_DAY;
            System.out.println(dailywage);
        }
        else if(attendance == isPartTime){
            int wageparttime= PART_TIME * WAGE_PER_HOUR;
            System.out.println(wageparttime);
        }
        else{
            System.out.println("Employee is Absent");
        }

    }
}
