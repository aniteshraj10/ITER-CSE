import java.util.*;

public class A3Q16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter marks : ");
		int marks = input.nextInt();
		
		marks/=10;
		
		switch(marks){
		case 10:
		case 9:
			System.out.println("O grade");
			break;
		case 8:
			System.out.println("A grade");
			break;
		case 7:
			System.out.println("B grade");
			break;
		case 6:
			System.out.println("C grade");
			break;
		case 5:
			System.out.println("D grade");
			break;
		case 4:
			System.out.println("E grade");
			break;
		case 3:
		case 2:
		case 1:
			System.out.println("F grade");
			break;}
		
		input.close();

	}

}
