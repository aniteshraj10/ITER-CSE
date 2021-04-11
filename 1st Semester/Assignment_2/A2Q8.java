/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a and b :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("a\t b\t pow(a,b)");
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		
		sc.close();
		
		
		
		
		/*int i, a, b;
		
		Scanner input = new Scanner(System.in);
		
		i = 0;
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		while (i <5) {
			System.out.print("Enter value of a : ");
			a = input.nextInt();
			list1.add(a);
			System.out.print("Enter value of b : ");
			b = input.nextInt();
			list2.add(b);
			
			i++;
		}
		
		System.out.println("a  b  pow(a,b)");
		System.out.println(list1.get(0) + " " + list2.get(0) + "       " + (int)(Math.pow(list1.get(0), list2.get(0))));
		System.out.println(list1.get(1) + " " + list2.get(1) + "      " + (int)(Math.pow(list1.get(1), list2.get(1))));
		System.out.println(list1.get(2) + " " + list2.get(2) + "      " + (int)(Math.pow(list1.get(2), list2.get(2))));
		System.out.println(list1.get(3) + " " + list2.get(3) + "      " + (int)(Math.pow(list1.get(3), list2.get(3))));
		System.out.println(list1.get(4) + " " + list2.get(4) + "      " + (int)(Math.pow(list1.get(4), list2.get(4))));
			
		input.close();*/

	}

}
