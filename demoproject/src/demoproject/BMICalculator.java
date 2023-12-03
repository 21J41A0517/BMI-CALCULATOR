package demoproject;
import  java.text.DecimalFormat;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in kilograms:");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in meters:");
		double height = input.nextDouble();
		
	
		double bmi = calculateBMI(weight, height);
		
		String interpretation = interpretBMI(bmi);
		
		System.out.println("Your BMI is: " + bmi);
		System.out.println("Interpretation: " + interpretation);
		
		input.close();
		

	}
	
	private static double calculateBMI(double weight, double height) {
		return weight / (height * height);
	}
	
	private static  String interpretBMI(double bmi) {
		if (bmi < 18.5) {
			return "Underweight";
		} 
		else if (bmi < 25) {
			return "Normal weight";
		}
		else if (bmi < 30) {
			return "Over weight";
		}
		else{
			return "Obese";
		}
	}
}

