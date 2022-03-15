package com.bridgelabz;

import java.util.Random;

public class UC4SwitchCaseEmpWages {
    //Calculate Daily
    //Employee Wage
    //WAGE_PER_HOUR = 20;
    //  FULL_DAY_HOUR = 8;
    //PART_TIME_HOUR = 4;

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;



    public static void main(String[] args) {
        Random random = new Random();
        int empPresent = random.nextInt(3);
        int empWage= 0;
        switch (empPresent){
            case IS_PART_TIME:
                empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Daily Emp Wage: " + empWage);
                break;

            case IS_FULL_TIME:
                empWage = WAGE_PER_HOUR *FULL_DAY_HOUR;
                System.out.println("Daily Emp Wage: " + empWage);
                break;

            default:
                empWage =0;
                System.out.println( "Emp is Absent");
        }}}




