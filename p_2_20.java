import java.util.*;
class p_2_20
{
	public static void main(String args[])
	{
		char c;
		do{
		System.out.println("1)add\n2)substraction\nchoose ur option");
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		System.out.println("enter the two numbers");	
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(n)
		{
			case 1:System.out.println("the sum of two numbers is "+(a+b));
				break;
			case 2:if(a>b)
				System.out.println("the difference of two numbers is "+(a-b));
			       else
				System.out.println("the difference of two numbers is "+(a-b));
				break;
		}
		System.out.println("Do u want to continue\nY\nN");
		c=sc.next().charAt(0);
		}while(c=='y' || c=='Y');
	}


}