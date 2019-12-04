class p_2_16
{
	public static void main(String args[])
	{	
		int i=1,j=1;
		int n=Integer.parseInt(args[0]);
		if(args.length==0)
			System.out.println("Please enter an integer number");
		else
		{
			while(i<=n)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.print("\n");
				i++;		
			}
		}
		
	}

}