class p_3_7
{
	public static void main(String args[])
	{
		int i,j,k=0;
		int a[]=new int[]{1,2,3,1,2,3};
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;	
				}		
				
			}
		if( a[i]!=0)
		System.out.print(a[i]+" ");
		
		}
	}

}