package calc;

import java.util.Scanner;

/**
 * @author Sandeep Reddy
 *	This class displays the required result for the given input
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.print("Enter any of the one choice \n1:Addition \n2:Multiplication \n3:Division");
		choice=sc.nextInt();
		System.out.println("Enter the no. of values u want to perform operation on,for divison only two inputs are allowed");
		int n=sc.nextInt();
		System.out.println("enter values");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
	Calculator cal=new Calculator(choice,a);
	System.out.println("The result is="+cal.result());
		
	}

}
