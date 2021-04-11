import java.util.*;

public class A5Q21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two integers : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x!=y)
		{
			if(x>y)
				x = x - y;
			else
				y = y - x;
		}
		
		System.out.println("GCD = " + x);
		
		sc.close();

	}

}
