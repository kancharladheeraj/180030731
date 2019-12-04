class p_2_17
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int temp=0,N=0,sum=0,i;
		i=10;
		while(n!=0)
		{
			
			temp=n%10;
			n=n/10;
			sum=(sum+temp)*10;
			
		}
	System.out.println(sum/10);
	}
	

}