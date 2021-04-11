import java.util.*;

public class A3Q11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight (in kg): ");
		double wg = input.nextDouble();
		
		System.out.print("Enter height (in m): ");
		double hg = input.nextDouble();
		
		double bmi = wg/Math.pow(hg,2);
		
		if (bmi < 18.5){
			System.out.println("Underweight");}
		
		else if (bmi >= 18.5 && bmi <= 24.9){
			System.out.println("Normal weight");}
		
		else if (bmi >= 25 && bmi <= 29.9){
			System.out.println("Overweight");}
		
		else if (bmi > 30){
			System.out.println("Obese");}
		
		input.close();
	}

}
