import java.util.*;

public class A3Q8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter age of Rahul : ");
		int age_rahul = input.nextInt();
		
		System.out.print("Enter age of Ayush : ");
		int age_ayush = input.nextInt();
		
		System.out.print("Enter age of Ajay : ");
		int age_ajay = input.nextInt();
		
		/*if (age_rahul > age_ayush) {
			if (age_rahul > age_ajay){
				System.out.println("Rahul is elder among them.");}
			else{
				System.out.println("Ajay is elder among them.");}}
		
		else if (age_ayush > age_ajay){
			if (age_ayush > age_rahul){
				System.out.println("Ayush is elder among them.");}
			else{
				System.out.println("Rahul is elder among them.");}}
		
		else{
			System.out.println("Ajay is elder among them.");}*/
		
		if (age_rahul>age_ayush && age_rahul>age_ajay){
			System.out.println("Rahul is elder among them");}
		
		else if (age_ayush>age_ajay){
			System.out.println("Ayush is elder among them");}
		
		else{
			System.out.println("Ajay is elder among them");}
		
		input.close();

	}

}
