package construction;
/**
 *  this class displays the cost of the house
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String standard,auto;
		double area;
		@SuppressWarnings("resource")
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your material standard type for yout home \n1:Standard \n2:above standard"
				+ "\n3:high standard");
		standard=sc.next();
		System.out.println("Enter you want automated home or non automated home");
		auto=sc.next();
		System.out.println("Enter your home size");
		area=sc.nextDouble();
		ConstructionCost c=new ConstructionCost(standard,auto,area);
		System.out.println("Your cost for the home is= "+c.cost());
	}

}
