import java.util.*;

public class A3Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any character :");
		char ch = input.next().charAt(0);
		
		if (ch>=67 && ch<=90){
			System.out.println(ch + " is a capital letter.");}
		else if (ch>=97 && ch<=122){
			System.out.println(ch + " is a small letter.");}
		else if (ch>=48 && ch<=57){
			System.out.println(ch + " is a digit.");}
		else if ((ch>=0 && ch<=47) || (ch>=58 && ch<=64) || (ch>=123 && ch<=127)){
			System.out.println(ch + " is a special symbol.");}
			
		input.close();

	}

}
