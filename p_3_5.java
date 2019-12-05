class p_3_5
{
	public static void main(String args[])
	{	
		int sum=0,i,j,max,max1,min,min1;
		int a[]=new int[]{10,11,85,25,36,2};
		if(a[0]>a[1])
		{
			max=a[0];	
			max1=a[1];
		}
		else
		{
			max1=a[0];	
			max=a[1];
		}
		for(i=2;i<a.length;i++)
		{
			if(max<a[i] && max1<a[i])
			max1=max;
			max=a[i];
			
							
		}
		if(a[0]<a[1])
		{
			min=a[0];	
			min1=a[1];
		}
		else
		{
			min1=a[0];	
			min=a[1];
		}
		for(i=2;i<a.length;i++)
		{
			if(min>a[i] && min1>a[i])
			min1=min;
			min=a[i];
			
							
		}
	System.out.println(max+"   "+max1+"   "+min+" "+min1);
	
	}	
}