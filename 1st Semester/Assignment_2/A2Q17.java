/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */
public class A2Q17 {

	public static void main(String[] args) {
		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);
		
		boolean a=z>x+y;
		boolean b=y>x+z;
		boolean c=x>y+z;
		
		boolean result=(a||b||c);
		
		System.out.println(result);

	}

}
