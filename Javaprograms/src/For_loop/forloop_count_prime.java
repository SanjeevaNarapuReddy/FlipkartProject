package For_loop;

public class forloop_count_prime 
{

	public static void main(String[] args) 
	{
		 int temp=0;
      for(int num=22;num<=90;num++)
     {
	    int count=0;
	   
	    for(int i=1;i<=num;i++)
	    {
		  if(num%i==0)
		  
	      {
	       count++;
	     
          }
	    }
	     if(count==2)
	     { 
	     temp++;
	    System.out.print(num+" ");
	     }
     }
	    System.out.println( "\n  total number of prime numbrs is "+temp);
	    	
	}
}
	   
	      
		