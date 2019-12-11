class Employee extends Person
{
	private double as;
	private int stw;
	private String ni;
	Employee(){}
	 Employee(double as,int stw,String ni)
	{
		
		this.as=as;
		this.stw=stw;
		this.ni=ni;
	}
	double getannualsalary()
	{
		return this.as;	
	}
	int getstarttowork()
	{
		return this.stw;	
	}
	String getnationalinsurance()
	{
		return this.ni;	
	}

}