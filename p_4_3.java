import java.util.*;
class Patient
{
	private String n;
	private double w,h;
	Patient(double w,double h)
	{	
	this.w=w;
	this.h=h;
	}
	double BMI()
	{
	double b;
	b=(0.001*this.w)/((12*this.h)*(12*this.h));
	return b*703;
	}
}
class p_4_3
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	Patient p=new Patient(55,5.8);	
	double r=p.BMI();
	System.out.printf("THE BMI of "+s+" is : "+r);
	
	}

}