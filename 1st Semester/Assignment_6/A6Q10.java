
public class A6Q10 {
	
	public static void printChars(char ch1, char ch2, int numberPerLine)
	{
		int count = 0;
		for (char ch = ch1; ch<=ch2; ch++)
		{
			System.out.print(ch + " ");
			count++;
			if (count%numberPerLine==0)
				System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int numberPerLine = 5;
		char ch1 = 'A';
		char ch2 = 'Z';
		
		printChars(ch1, ch2, numberPerLine);
		
	}

}
