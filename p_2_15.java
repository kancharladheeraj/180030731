import java.util.*;
class p_2_15
{
	public static void main(String args[])
	{
		int N=0,sum=0,temp=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			temp=n;
			temp=n%10;
			n=n/10;
			sum=sum+temp;
		
		}	
		System.out.println(sum);
	}


}
