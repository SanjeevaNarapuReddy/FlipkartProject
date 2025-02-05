package patternprograming;

public class number4 {
	
	    public static void main(String[] args)
	    {
		
	        System.out.println("## Printing the pattern ##");
	        for (int row = 1; row <= 4; row++)
	        {
	            for (int col = 1; col <= row; col++)
	            {
	                System.out.print(row+" ");
	            }
	            System.out.println();
	        }
	    }
	}