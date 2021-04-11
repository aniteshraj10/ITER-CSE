import java.util.Scanner;

public class A6Q12 {
	
	public static int count(String str)
	{
		int count = 0;
		int n = str.length();
		
		for (int i = 0; i<n; i++)
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
					str.charAt(i) == 'o' || str.charAt(i) == 'u')
				count++;
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String msg = input.next();

		int no_vowels = count(msg.toLowerCase());
		
		System.out.println("Number of vowels present in " + msg + " = " + no_vowels);

		input.close();

	}

}
