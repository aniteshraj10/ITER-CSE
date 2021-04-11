import java.util.*;

public class A4Q10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for which you want to find the multiplication tale : ");
		int n = input.nextInt();
		
		for (int i = 1; i<=10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
		
		input.close();

	}

}
