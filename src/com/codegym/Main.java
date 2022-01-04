package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Input your weight");
    float weight = sc.nextFloat();
        System.out.println("Input your height");
        float height = sc.nextFloat();
        double bmi = weight / Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%.2f%40s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%.2f%20s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
