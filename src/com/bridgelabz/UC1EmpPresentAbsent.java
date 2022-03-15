package com.bridgelabz;

import java.util.Random;

public class UC1EmpPresentAbsent {
    public static void main(String[] args) {
        Random random = new Random();
        int empPresent = random.nextInt(2);
        if (empPresent == 0) {
            System.out.println("Employee is absent");
        }
        else
            System.out.println("Emp is present");

    }}

