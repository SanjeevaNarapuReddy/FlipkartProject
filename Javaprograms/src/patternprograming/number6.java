package patternprograming;

public class number6
{
	 public static void main(String[] args)
	    {
	       System.out.println("## Printing the pattern ##");
	       int temp=1;
	        for (int row = 1; row <= 4; row++)
	        {
	            for (int col = 1; col <= 4; col++)
	            {
	            	if(row>=col)
	            	{	 
	                System.out.print(temp+" ");
	                temp++;
	            }
	            	else
	            	System.out.print(" ");
	            	}
	            	
	            System.out.println();
	        }
	    }
	    }