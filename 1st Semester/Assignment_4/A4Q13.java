import java.util.*;

public class A4Q13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = input.nextInt();
		
		//int length = String.valueOf(num).length();
		
		int sum=0;
		
		while (num>0){
			int r=num%10;
			sum=sum+r;
			num/=10;
		}
		
		/*for (int i = 1; i<=length; i++) {
			int n=num%10;
			sum+=n;
			num/=10;
		}*/
		
		if (sum%9==0) {
			System.out.println("Given number is divisible by 9");
		}
		else {
			System.out.println("Given number is not divisible by 9");
		}
		
		input.close();

	}

}
