import java.util.Scanner;

public class A3Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter height in feet : ");
		double height = input.nextDouble();
		
		if (height >= 6)
		{
			System.out.println("The person is tall");
		}
		
		input.close();
	}

}
