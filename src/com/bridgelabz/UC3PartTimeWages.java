package com.bridgelabz;

import java.util.Random;

public class UC3PartTimeWages {

        //Calculate Daily
        //Employee Wage
        //WAGE_PER_HOUR = 20;
        //  FULL_DAY_HOUR = 8;
        //PART_TIME_HOUR = 4;

        static int WAGE_PER_HOUR = 20;
        static int FULL_DAY_HOUR = 8;
        static int PART_TIME_HOUR = 4;


        public static void main(String[] args) {
            Random random = new Random();
            int empPresent = random.nextInt(3);
            int empWage = 0;
            if (empPresent == 0) {
                System.out.println("Employee is absent");
            }

            else if (empPresent == 1) {
                System.out.println("Emp is present");
                empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Emp Wage: " + empWage);

            }

              else
            {

                System.out.println("Emp is present");
                empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("Emp Wage: " + empWage);

            }
        }
    }

