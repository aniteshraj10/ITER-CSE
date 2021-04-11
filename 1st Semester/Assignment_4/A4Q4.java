import java.util.*;

public class A4Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Count from : ");
		int n1 = input.nextInt();
		
		System.out.print("Count to : ");
		int n2 = input.nextInt();
		
		System.out.print("Count by : ");
		int n3 = input.nextInt();
		
		for (int i=n1; i<=n2; i=i+n3 ) {
			System.out.print(i + " ");
		}
		
		input.close();

	}

}
