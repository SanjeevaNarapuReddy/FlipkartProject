package patternprograming;

public class number3 
{
	public static void main(String[] args) 
	 {
	  int i, j;
	  int k = 65;
	  for(i=65; i<=69; i++)
	  {
	   for(j=69; j>=i; j--)
	    System.out.format("%2c", k++);
	   System.out.println();
	  }
	 }
	}



	


