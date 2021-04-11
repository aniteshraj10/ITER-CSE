import java.util.*;

public class A3Q17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		int num = input.nextInt();
		
		boolean x = num%5==0 & num%6==0;
		boolean y = num%5==0 | num%6==0;
		boolean z = num%5==0 ^ num%6==0;
		
		System.out.println("Is " + num + " divisible by 5 and 6? " + x);
		System.out.println("Is " + num + " divisible by 5 or 6? " + y);
		System.out.println("Is " + num + " divisible by 5 and 6, but not both? " + z);
		
		/*if (num%5==0 && num%6==0) {
			System.out.println("Is " + num + " divisible by 5 and 6?" + " True");}
		else {
			System.out.println("Is " + num + " divisible by 5 and 6?" + " False");}
		if ((num%5==0 && num%6==0) || (num%5==0 || num%6==0)) {
			System.out.println("Is " + num + " divisible by 5 or 6?" + " True");}
		else {
			System.out.println("Is " + num + " divisible by 5 or 6?" + " False");}
		if (num%5==0 || num%6==0) {
			System.out.println("Is " + num + " divisible by 5 and 6, but not both?" + " True");}
		else {
			System.out.println("Is " + num + " divisible by 5 and 6, but not both?" + " False");}*/
		
		input.close();
		
	}

}
