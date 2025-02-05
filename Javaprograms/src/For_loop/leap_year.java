package For_loop;

public class leap_year 
{

	public static void main(String[] args)
	{
		int count=0;
      for(int yer=1;yer<=2022;yer++)
      {
    	  if(yer%4==0)
    	  {
    		 count++;
    	  
    	  System.out.print(yer+" ");
    	  }
      }
      System.out.println("\n total number of leap year are: "+count);
      } 
	}   
       



