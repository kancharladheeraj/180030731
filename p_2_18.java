class p_2_18
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int N=n;
		int temp=0,sum=0,i;
		i=10;
		while(n!=0)
		{
			
			temp=n%10;
			n=n/10;
			sum=(sum+temp)*10;
			
		}
		if(N==(sum/10))
			System.out.println(N+" is a palindrome");

		else System.out.println(N+" is a not palindrome");
	}
	

}