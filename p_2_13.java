import java.util.*;
class p_2_13
{
	public static void main(String args[])
	{
		int i,c=0,j;                
		for(j=10;j<=99;j++)
		{  
   			for(i=2;i<=j/2;i++)
			{      
   	        		if(j%i==0)	
				{      
    	       	 		System.out.println(j+" is not prime number");      
   	        		c=1;      
   	        		break;      
    				}      
  	 		}      
   			if(c==0)
        		{ System.out.println(j+" is prime number"); }  
 		 }
		
	}

}	