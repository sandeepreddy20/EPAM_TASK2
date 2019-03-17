package calc;

/**
 *  this class contains all the methods that are to be implemented
 */

public class Calculator {
	int operation;		//Operation has three values 1:Addition 2:Multiplication 3:Division
	int a[];			//Array of elements(operands) on which operation is to be performed
	
	Calculator(int op,int A[])	//constructor
	{	
		operation=op;
		a=A;
	}
	
	/**
	 * 	This method is to return result of the particular operation
	 */
	
	public int result()
	{
		int result;
		if(operation==1)
			result=add();
		else
			if(operation==2)
				result=multiply();
			else
				result=divide();
		return result;
	}
	
	/**
	 * 	This method is used to perform addition operation on given array of elements
	 */
	public int add()
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum;
	}
	
	/**
	 * 	This method is used to perform multiplication operation on given array of elements
	 */
	public int multiply()
	{
		int product=1;
		for(int i=0;i<a.length;i++)
			product*=a[i];
		return product;
	}
	
	/**
	 * 	This method is used to perform division operation on given array of elements
	 */
	public int divide()
	{
		int ans=a[0]/a[1];
		return ans;
	}
}
