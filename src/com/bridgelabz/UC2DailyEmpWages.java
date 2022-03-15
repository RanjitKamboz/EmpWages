package com.bridgelabz;

import java.util.Random;

public class UC2DailyEmpWages {
    //Calculate Daily
    //Employee Wage
   //WAGE_PER_HOUR = 20;
  //  FULL_DAY_HOUR = 8;

    static int WAGE_PER_HOUR = 20;
        static int FULL_DAY_HOUR = 8;


        public static void main(String[] args) {
            Random random = new Random();
            int empPresent = random.nextInt(2);
            int empWage = 0;
            if (empPresent == 0) {
                System.out.println("Employee is absent");
            } else {
                empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;


                System.out.println("Emp is present");
                System.out.println("Emp Wage: " + empWage);

            }
        }
    }