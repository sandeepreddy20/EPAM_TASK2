package construction;

/**
 * This class is used to calculate the cost of the house according to requirements
 *
 */

public class ConstructionCost {
	String standard,auto;
	double area;
	public ConstructionCost(String standard2, String auto2, double area2) {
		standard=standard2;
		auto=auto2;
		area=area2;
	}


	public double cost()
	{
		double amt=0;
		if(auto.equals("non automated"))
		{
			if(standard.equals("standard"))
				amt=area*1200;
			if(standard.equals("above standard"))
				amt=area*1500;
			if(standard.equals("high standard"))
				amt=area*1800;
		}
		else
			amt=area*2500;
	return amt;
	}

}
