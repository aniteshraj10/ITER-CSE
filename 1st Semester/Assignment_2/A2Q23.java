/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q23 {

	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);//10
		int b=Integer.parseInt(args[1]);//20
		int c=Integer.parseInt(args[2]);//5
		
		int min=Math.min(a, Math.min(b, c));
		int max=Math.max(a, Math.max(b, c));
		//int min=(x<y)?x:y;
		//int max=(x>y)?x:y;
		int mid=(a+b+c)-(min+max);
		
		System.out.println("Ascending order : " + min + "," + mid + "," + max);

	}

}
