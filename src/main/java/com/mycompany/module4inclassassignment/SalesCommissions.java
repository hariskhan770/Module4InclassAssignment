/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module4inclassassignment;

/**
 *
 * @author haris
 */
import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] salaryCounters = new int[9];

        System.out.println("Enter the number of salespeople: ");
        int numSalespeople = input.nextInt();

        for (int i = 0; i < numSalespeople; i++) {
            System.out.println("Enter sales for salesperson " + (i+1) + ": ");
            double sales = input.nextDouble();

            double salary = 200 + 0.09 * sales;
            int salaryRange = (int) (salary / 100) - 1;

            if (salaryRange >= 0 && salaryRange <= 8) {
                salaryCounters[salaryRange]++;
            }
            else {
                salaryCounters[8]++;
            }
        }

        System.out.println("\nSalary Range\tNumber of Salespeople");
        System.out.println("$200-$299\t\t" + salaryCounters[0]);
        System.out.println("$300-$399\t\t" + salaryCounters[1]);
        System.out.println("$400-$499\t\t" + salaryCounters[2]);
        System.out.println("$500-$599\t\t" + salaryCounters[3]);
        System.out.println("$600-$699\t\t" + salaryCounters[4]);
        System.out.println("$700-$799\t\t" + salaryCounters[5]);
        System.out.println("$800-$899\t\t" + salaryCounters[6]);
        System.out.println("$900-$999\t\t" + salaryCounters[7]);
        System.out.println("$1,000 and over\t\t" + salaryCounters[8]);
    }
}
