import java.util.*;

public class A3Q5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a, b, c, dis, r1, r2;
		
		System.out.println("Enter value of a, b & c :");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		dis = Math.pow(b,2) - (4*a*c);
		
		if (dis>0){
			r1 = (-b + Math.pow(dis,0.5))/2*a;
			r2 = (-b - Math.pow(dis,0.5))/2*a;
			
			System.out.println("The equation has two roots " + r1 + " and " + r2);}
		
		else if (dis==0){
			r1 = (-b + Math.pow(dis,0.5))/2*a;
						
			System.out.println("The equation has one root " + r1);}
		
		else {
			System.out.println("The equation has no real root");}
		
		input.close();

	}

}
