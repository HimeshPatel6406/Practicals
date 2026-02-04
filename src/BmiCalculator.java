/*Develop a Java application that calculates a person's Body Mass Index (BMI). The program
should ask the user for their weight in pounds and height in inches. Convert these values to
kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and
then calculate BMI (weight in kg / (height in meters)^2). Display the calculated BMI*/

import java.util.*;
public class BmiCalculator {
    public static void main(String[] args){
        double w,h,BMI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Weight In Pounds:");
        w = sc.nextDouble();
        System.out.println("Enter Your Height In Inches:");
        h = sc.nextDouble();

        BMI = (w*0.45359237)/((h*0.0254)*(h*0.0254));
        System.out.println("Your BMI:"+BMI);
    }
}
