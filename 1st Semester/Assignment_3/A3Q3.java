import java.util.*;

public class A3Q3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		int num = input.nextInt();
		
		if (num%2 == 0){
			System.out.println(num + " is an even number");}
		else{
			System.out.println(num + " is an odd number");}
		
		input.close();

	}

	
}
