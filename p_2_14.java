import java.util.*;
class p_2_14
{
	public static void main(String args[])
	{
		if(args.length==0)
			System.out.println("Please enter an integer number");
		int n=Integer.parseInt(args[0]);
		int i,m=0,c=0;       
		m=n/2;      
  		if(n==0||n==1)
		{  
  		 System.out.println(n+" is neither prime nor composite");      
 		}
		else
		{  
   			for(i=2;i<=m;i++)
			{      
   	        		if(n%i==0)	
				{      
    	        		System.out.println(n+" is not prime number");      
   	        		c=1;      
   	       		 	break;      
    				}      
  		 	}      
   			if(c==0)
        		{ System.out.println(n+" is prime number"); }  
  		}
		
	}

}	