import java.util.*;
import java.lang.*;
class p_2_9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c = sc.nextInt();
		if(c>12 || c==0)
		System.out.println("Invalid month");
		else{
		switch(c)
		{
			case 1:System.out.println("January");
				 break;
			case 2:System.out.println("Febravary");
				 break;
			case 3:System.out.println("March");
				 break;
			case 4:System.out.println("April");
				 break;
			case 5:System.out.println("May");
				 break;
			case 6:System.out.println("June");
				 break;
			case 7:System.out.println("july");
				 break;
			case 8:System.out.println("August");
				 break;
			case 9:System.out.println("September");
				 break;
			case 10:System.out.println("Octomber");
				 break;
			case 11:System.out.println("November");
				 break;
			case 12:System.out.println("December");
				 break;			

		}
}
	}

}
 