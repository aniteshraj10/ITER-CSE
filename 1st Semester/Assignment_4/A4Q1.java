import java.util.*;

public class A4Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String msg;
		
		System.out.print("Enter a message : ");
		msg = input.next();
		
		int i = 1;
		
		while(i<=10)
		{
			if(i==1)
				System.out.println(i + "st " + msg);
			else if(i==2)
				System.out.println(i + "nd " + msg);
			else if(i==3)
				System.out.println(i + "rd " + msg);
			else
				System.out.println(i+ "th " + msg);
			
			i+=1;
		}
		
		/*for(int i = 1;i<=10;i++)
		{
			if(i==1)
				System.out.println(i + "st " + msg);
			else if(i==2)
				System.out.println(i + "nd " + msg);
			else if(i==3)
				System.out.println(i + "rd " + msg);
			else
				System.out.println(i+ "th " + msg);
		}*/
		
		input.close();		

	}

}
