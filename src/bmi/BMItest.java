/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BMItest {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
// Printing the print statements.
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("Enter your weight in pounds: ");
        double weight = in.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = in.nextDouble();
// Inculcating the new values..
        BMI obj = new BMI(name, age, weight, height);
// Calling the functions.
        System.out.print("Your BMI is ");
        System.out.print(obj.getBMI());
        System.out.print("\n");
        System.out.print(obj.getStatus());
    }
}
