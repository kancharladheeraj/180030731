import java.util.*;
class p_3_11
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String st = sc.nextLine();
        String[] st1 = st.split(" ");
	if(st1.length!=9)
	System.out.println("Please enter 4 integer numbers");
	else if(st1.length==9)
	{
	int a[][]=new int[3][3];
	int i,j,k=0;
	System.out.println("The given array is :");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=Integer.parseInt(st1[k]);	
			k++;
			System.out.print(a[i][j]+"\t");
		}	
	System.out.println();
	}
	
	System.out.println("The greatest element of the array is :");
	int max=a[0][0];
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			if(max<a[i][j])
			max=a[i][j];	
		}	
	
	}
System.out.println(max);
	
	}

	}

}