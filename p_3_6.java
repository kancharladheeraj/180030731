class p_3_6
{
	public static void main(String args[])
	{
		int i,j,k;
		int a[]=new int[]{36,25,12,14,2,1};
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];	
					a[j]=temp;	
	
				}		
				
			}
		
		}
		for(k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}