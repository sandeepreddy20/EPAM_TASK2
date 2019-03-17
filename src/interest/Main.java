package interest;

import java.util.Scanner;

/**
 * @author Sandeep Reddy
 *	This class displays simple and compound interest for given set of values
 */
public class Main {
	/**
	 * principle:Principle amount for which interest needs to be calculated
	 * time:time period for the interest
	 * rate:interest rate percentage
	 * @param args
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount,time period and interest rate percent");
		int principle=sc.nextInt();
		int time=sc.nextInt();
		int rate=sc.nextInt();
		InterestCalc a=new InterestCalc(principle,time,rate);
		System.out.println("Simple interest amount is="+a.simpleInterest());
		System.out.println("Compound interest amount is="+a.compoundInterest());
	}

}
