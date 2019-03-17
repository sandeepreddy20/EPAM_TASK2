package interest;

/**
 * In this class we calculate simple and compound interest 
 *
 */
public class InterestCalc {
	/**
	 *   Here p indicates Principle amount
	 *   	  t indicates Time period
	 *   	  r indicates Interest rate
	 */
	double p,t,r;
	InterestCalc(int pr,int time,int rate)
	{
		p=pr;
		t=time;
		r=rate;
	}
	
	public double simpleInterest()
	{
		double in=(p*t*r)/100;
		return in;
	}
	
	public double compoundInterest()
	{
		double in=p*(Math.pow((1+r/100), t)-1);
		return in;
	}

}
