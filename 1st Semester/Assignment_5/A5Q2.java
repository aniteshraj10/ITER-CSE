import java.util.*;

public class A5Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of students : ");
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter mark of a student : ");
			int mark = sc.nextInt();
			if (mark>=40)
			{
				count+=1;
			}
		}
		
		System.out.println("Number of students passed in exam = " + count);
		
		sc.close();

	}

}
