import java.util.*;

public class A3Q2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter marks of student : ");
		int mark = input.nextInt();
		
		if (mark >= 40){
			System.out.println("Congratulation! You have passed the exam.");}
		else{
			System.out.println("Sorry! You have failed the exam.");}
		
		input.close();

	}

}
