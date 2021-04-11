import java.util.*;

public class A3Q14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter O for scissors, 1 for rock, and 2 for paper : ");
		int choice  = input.nextInt();
		
		int min = 0, max = 2;
		
		int comp_choice = min + (int)(Math.random()*(max-min+1));
		
		if (choice == 0) //scissor
		{
			System.out.println("Your choice is scissor");
			switch(comp_choice) {
			case 0:
				System.out.println("Computer chocie is also scissor, Its a draw..");
				break;
			case 1:
				System.out.println("Computer choice is rock, You lose..");
				break;
			case 2:
				System.out.println("Computer choice is paper, You won..");
				break;
			}}
		
		else if (choice == 1)//rock
		{
			System.out.println("Your choice is rock");
			switch(comp_choice) {
			case 0:
				System.out.println("Computer chocie is scissor, You won..");
				break;
			case 1:
				System.out.println("Computer choice is also rock, Its a draw..");
				break;
			case 2:
				System.out.println("Computer choice is paper, You lose..");
				break;
			}}
		
		else if (choice == 2) //paper
		{
			System.out.println("Your choice is paper");
			switch(comp_choice) {
			case 0:
				System.out.println("Computer chocie is scissor, You lose..");
				break;
			case 1:
				System.out.println("Computer choice is rock, You won..");
				break;
			case 2:
				System.out.println("Computer choice is also paper, Its a draw..");
				break;
			}}
		else{
			System.out.println("Wrong Choice!!!");}
		
		input.close();
	}

}
