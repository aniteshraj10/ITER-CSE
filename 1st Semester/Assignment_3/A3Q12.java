import java.util.*;

public class A3Q12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Enter three number : ");
		n1 = input.nextInt();  
		n2 = input.nextInt();
		n3 = input.nextInt();
		
		if (n1<n2 && n2<n3) {
			System.out.println(n1+" "+n2+" "+n3);}
		
		else if (n1<n3 && n3<n2) {
				System.out.println(n1+" "+n3+" "+n2);}
		
		else if (n2<n1 && n1<n3) {
			System.out.println(n2+" "+n1+" "+n3);}
		
		else if (n2<n3 && n3<n1) {
			System.out.println(n2+" "+n3+" "+n1);}
		
		else if (n3<n1 && n1<n2) {
			System.out.println(n1+" "+n3+" "+n2);}
		
		else {
			System.out.println(n3+" "+n2+" "+n1);}
		
		input.close();
	}

}
