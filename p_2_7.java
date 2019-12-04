import java.util.*;
import java.lang.*;
class p_2_7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c>=97 && c<=122)
		System.out.println(c+"->"+Character.toUpperCase(c));
		else if(c>=65 && c<=90)
		System.out.println(c+"->"+Character.toLowerCase(c));
	}
}