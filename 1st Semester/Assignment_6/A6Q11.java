import java.util.Scanner;

public class A6Q11 {
	
	public static int count(String str, char a)
	{
		int count = 0;
		int n = str.length();
		
		for (int i = 0; i < n; i++)
		{
			if (a == str.charAt(i))
				count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str = input.next();
		
		System.out.print("Enter a specific character : ");
		char a = input.next().charAt(0);
		
		int result = count(str.toLowerCase(), a);
		
		System.out.println("NUmber of times the specified character present = "+ result);
		
		input.close();

	}

}
