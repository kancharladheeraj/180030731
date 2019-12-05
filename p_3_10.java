import java.util.*;
class p_3_10
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String st = sc.nextLine();
        String[] st1 = st.split(" ");
	if(st1.length!=4)
	System.out.println("Please enter 4 integer numbers");
	else if(st1.length==4)
	{
	int a[][]=new int[2][2];
	int i,j,k=0;
	System.out.println("The given array is :");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			a[i][j]=Integer.parseInt(st1[k]);	
			k++;
			System.out.print(a[i][j]+"\t");
		}	
	System.out.println();
	}
	System.out.println("The reverse of the array is :");
	for(i=1;i>=0;i--)
	{
		for(j=1;j>=0;j--)
		{
			System.out.print(a[i][j]+"\t");
		}	
	System.out.println();
	}
	
	}
	}

}