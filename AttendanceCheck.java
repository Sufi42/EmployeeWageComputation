package com.bl.empwage;

import java.util.Random;

public class AttendanceCheck {
    public static void main(String[] args) {
        int isPresent=1;
        Random r = new Random();
        int attendance = r.nextInt(3);
        if(attendance == isPresent){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}
