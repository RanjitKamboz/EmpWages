package com.bridgelabz;

import java.util.Random;

public class UC5MonthlyWages {
    //Calculate Daily
    //Employee Wage
    //WAGE_PER_HOUR = 20;
    //  FULL_DAY_HOUR = 8;
    //PART_TIME_HOUR = 4;
    //WORKING_DAYS_PER_MONTH = 20;

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int WORKING_DAYS_PER_MONTH = 20;


    public static void main(String[] args) {
        int workingDays = 1;
        int totalWage = 0;
        while (workingDays < WORKING_DAYS_PER_MONTH) {
            Random random = new Random();
            int empPresent = random.nextInt(3);
            int empWage = 0;

            switch (empPresent) {
                case IS_PART_TIME:
                    empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Emp Wage: " + empWage);
                    break;

                case IS_FULL_TIME:
                    empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("Emp Wage: " + empWage);
                    break;

                default:
                    empWage = 0;
                    System.out.println("Emp Wage: " +empWage);

            }
            totalWage = totalWage + empWage;
            workingDays++;
        }
        System.out.println(workingDays);
        System.out.println(totalWage);

            }
        }
