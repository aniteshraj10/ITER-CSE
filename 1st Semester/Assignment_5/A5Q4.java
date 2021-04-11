import java.util.*;

public class A5Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sum = 0, avg = 0;
		int pos = 0, neg = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0 : ");
		int n = sc.nextInt();
		
		if(n == 0)
			System.out.println("No numbers are entered except 0");
		else
		{
			while(n != 0)
			{
				sum+=n;
				if(n>0)
					pos++;
				else
					neg++;
				System.out.print("Enter an integer, the input ends if it is 0 : ");
				n = sc.nextInt();
			}
			System.out.println("Number of +ve integers = " + pos);
			System.out.println("Number of -ve integers = " + neg);
			avg=sum/(pos+neg);
			System.out.println("Average = " + avg);
		}

		sc.close();

	}

}
