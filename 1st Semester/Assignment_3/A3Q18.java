import java.util.*;

public class A3Q18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your gender (M or F) : ");
		String gender = input.next();
		
		System.out.print("First name : ");
		String F_name = input.next();
		
		System.out.print("Last name : ");
		String L_name = input.next();
		
		System.out.print("Age : ");
		int age = input.nextInt();
		
		if (gender.equalsIgnoreCase("F")) {
			if (age>=20) {
				System.out.print("Are you married, " + F_name + " (y or n)? : ");
				String marriage = input.next();
				if (marriage.equalsIgnoreCase("y")) {
					System.out.println("Then I shall call you Mrs. " + F_name);}
				else if (marriage.equalsIgnoreCase("n")) {
					System.out.println("Then I shall call you Ms. " + F_name + " " + L_name);}
				else {
					System.out.println("Wrong choice....");}}
			else {
				System.out.println("Then I shall call you " + F_name + " " + L_name);}}
		
		else if (gender.equalsIgnoreCase("M")) {
			if(age>=20) {
				System.out.println("Then I shall call you Mr. " + F_name + " " + L_name);}
			else {
				System.out.println("Then I shall call you " + F_name + " " + L_name);}}
				
		input.close();
	}

}
