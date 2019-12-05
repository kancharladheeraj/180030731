import java.util.*;
class p_3_9
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String st = sc.nextLine();
        String[] st1 = st.split(" ");
	int a[]=new int[st1.length];
	int temp=0,temp1=0,i,j,k,sum=0;

	for(i=0;i<a.length;i++)
	{
		a[i]=Integer.parseInt(st1[i]);
		if(a[i]==6)
		temp=i;
		else if(a[i]==7)
		temp1=i;
	}

	if(temp<temp1){   
	for(j=temp;j<=temp1;j++)
		a[j]=0;
	for(k=0;k<a.length;k++)
	{
		sum=sum+a[k];
	}
	System.out.println(sum);
		
	 }
	else{
	for(j=0;j<a.length;j++)
	{
		sum=sum+a[j];
	}
	System.out.println(sum);
	}
	}
}