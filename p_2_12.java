import java.util.*;
class p_2_12
{
	public static void main(String args[])
	{
		int i,m=0,c=0;      
 	        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();    
		m=n/2;      
  		if(n==0||n==1){  
  		 System.out.println(n+" is not prime number");      
 		 }
		else{  
   		for(i=2;i<=m;i++){      
   	        if(n%i==0){      
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