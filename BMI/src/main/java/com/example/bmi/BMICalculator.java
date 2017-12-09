package com.example.bmi;

public class BMICalculator {

    public static void main(String[] args) {
        double BMI = calculateBMI(179,64);
        System.out.println("Your BMI is " + BMI);

        if(BMI > 24){
            System.out.println("Overweight.");
        }else if (BMI > 18){
            System.out.println("Normal.");
        }else{
            System.out.println("Underweight.");
        }
    }

    public static double calculateBMI(double height,double weight){
        return Math.round(weight/Math.pow(height/100,2)*100)*0.01;
    }

}
