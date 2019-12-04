import java.util.*;
class p_2_6
{
	public static void main(String args[])
	{
		String g=args[0];	
		int a=Integer.parseInt(args[1]);
		if(Objects.equals("Male",g))
		{
			if(a>=1 && a<=60)
			System.out.println("Interest == 9.2% ");
			else
			System.out.println("Interest == 8.3% ");
		}
		else if(Objects.equals("Female",g))
		{
			if(a>=1 && a<=58)
			System.out.println("Interest == 8.2% ");
			else
			System.out.println("Interest == 7.6% ");
		}
	}


}