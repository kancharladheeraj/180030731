import java.util.*;
class p_3_3
{
	public static void main(String args[])
	{	
		int sum=0,i,j=0;
		int a[]=new int[]{5,8,9,3,12};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
			j=1;
			break;
			}					
		}
	if(j==1)
	System.out.println((i+1));
	else
	System.out.println(-1);
	
	}	
}