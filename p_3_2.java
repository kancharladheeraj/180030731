class p_3_2
{
	public static void main(String args[])
	{	
		int sum=0,i,j;
		int a[]=new int[]{5,8,9,3,12};
		int max=a[0],min=a[0];
		for(i=1;i<a.length;i++)
		{
			if(max<a[i])
			max=a[i];
							
		}
		for(i=1;i<a.length;i++)
		{
			if(min>a[i])
			min=a[i];
							
		}
	System.out.println(max+"   "+min);
	
	}	
}