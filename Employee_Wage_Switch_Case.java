package com.bl.empwage;

import java.util.Random;

public class Employee_Wage_Switch_Case {
    public final static int isFullTime=1;
    public final static int isPartTime=2;
    static final int FULL_DAY=8;
    final int PART_TIME=4;
    static final int WAGE_PER_HOUR = 20;
    final static int MAX_WORKING_DAYS=20;
    final static int MAX_HRS_MONTH=100;


    public static void main(String[] args) {

        int emphrs = 0;
        int total_wage = 0;
        int totaldays=0;




            Random r = new Random();
        int attendance = r.nextInt(3);
        int wage = 0;
        for(int totalworkinghrs =0; totalworkinghrs < MAX_HRS_MONTH && totaldays < MAX_WORKING_DAYS; totaldays++){

            switch (attendance) {
                case isFullTime:
                    emphrs = 8;
                    break;

                case isPartTime:
                    emphrs = 4;
                    break;

            }
            wage = emphrs * WAGE_PER_HOUR;


        }
        System.out.println("Employee Wage : " + wage);
        total_wage = wage * MAX_WORKING_DAYS;
        System.out.println("Total Employee Wage : "+total_wage);
        System.out.println("Total Working Days : "+totaldays);




    }

}


