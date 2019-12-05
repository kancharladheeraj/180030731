import java.lang.*;
class Calculator
{
	static Double powerInt(double num1,double num2)
	{
		double r=Math.pow(num1,num2);
		return r;
	}
	static Double powerDouble(double num1,int num2)
	{
		double r=Math.pow(num1,num2);
		return r;
	}

}
class p_4_2
{
	public static void main(String args[])
	{
	double r1=Calculator.powerInt(12,10);
	double r2=Calculator.powerDouble(12,10);
	System.out.println(r1+" "+r2);	
	}
	

}