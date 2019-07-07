/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author LENOVO
 */
public class BMI {
// All variables are intiallized here....

    private String name;
    private int age;
    private double weight;
    private double height;
    private double BMIFormula;
    final double KG_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;
    String status;
// Creating two contructors.

    public BMI() {

    }

    public BMI(String n, int a, double w, double h) {
        name = n;
        age = a;
        weight = w;
        height = h;
    }
// Creating the obj for constructor type....

    public BMI(BMI obj) {
        this.name = obj.name;
        this.age = obj.age;
        this.weight = obj.weight;
        this.height = obj.height;
    }
// Creating getter methods...

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public double getweight() {
        return weight;
    }

    public double getheight() {
        return height;
    }
// Creating setter methods....

    public void setname(String n) {
        n = name;
    }

    public void setage(int a) {
        a = age;
    }

    public void setweight(double w) {
        w = weight;
    }

    public void setheight(double h) {
        h = height;
    }
// Creating a method to calculate BMI.

    public double getBMI() {
        BMIFormula = weight * KG_PER_POUND / (height * METERS_PER_INCH * height * METERS_PER_INCH);
        return BMIFormula;
    }
// Creating a method to check the status of a particular person.

    public String getStatus() {
        if (BMIFormula > 0 && BMIFormula < 18.5) {
            status = "You are underweight.\n";
        } else if (BMIFormula >= 18.5 && BMIFormula <= 24.9) {
            status = "You are normal.\n";
        } else if (BMIFormula >= 25 && BMIFormula <= 29.9) {
            status = "You are overweight.\n";
        } else if (BMIFormula < 0) {
            status = "Not Possible.\n";
        } else {
            status = "You are obese.\n";
        }
        return status;
    }
}
