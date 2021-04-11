import java.util.*;

public class A3Q10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int day, future_day;
		
		System.out.print("Enter today's day : ");
		day = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today : ");
		future_day = input.nextInt();
		future_day=(future_day+day)%7;
		
		switch(day){
		case 0:
			System.out.println("Today is Sunday");
			break;
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;	
		}
		
		switch(future_day){
		case 0:
			System.out.println("The future day is Sunday");
			break;
		case 1:
			System.out.println("The future day is Monday");
			break;
		case 2:
			System.out.println("The future day is Tuesday");
			break;
		case 3:
			System.out.println("The future day is Wednesday");
			break;
		case 4:
			System.out.println("The future day is Thursday");
			break;
		case 5:
			System.out.println("The future day is Friday");
			break;
		case 6:
			System.out.println("The future day is Saturday");
			break;	
		}
		
		
		
		input.close();

	}

}
