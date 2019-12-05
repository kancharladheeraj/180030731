import java.util.*;
class p_3_8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		int a[]=new int[6];
		int b[]=new int[6];
		for(i=0;i<6;i++)
		{
			a[i]=sc.nextInt();	
		}
		for(j=0;j<6;j++)
		{
		int c=0;
			for(k=0;k<6;k++)
			{	
				if(a[j]==a[k])
				c++;
		
			}
			b[j]=c;
		}
		int max=b[0],r=0;
		for(i=1;i<6;i++)
		{
			if(max<b[i]){
			max=b[i];
			r=i;}
							
		}
	System.out.println(a[r]);	
	}

}