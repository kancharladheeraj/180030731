class Box
{
	private double l,b,h;
	Box(double l,double b,double h)
	{
	this.l=l;
	this.b=b;
	this.h=h;	
	} 
	double vol()
	{
	return this.l*this.b*this.h;	
	}		
}
class p_4_1
{
	public static void main(String args[])
	{
	Box b=new Box(10,20,30);
	double v=b.vol();
	System.out.println(v);	


	}
}
