import java.util.*;

public class A4Q14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter N : ");
		int num = input.nextInt();
		
		int p=1;
		int temp = 0;
		
		while (p<=num){
			temp=p;
			p=p*2;
		}
		
		System.out.println("Largest power of two less than or equal to " + num + " is " + temp);
		

		input.close();

	}

}
