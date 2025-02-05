package patternprograming;
/*
public class alpha1 {


public static void main(String args[])
	
		{
			int alphabet = 65;
			int rows = 4;
			System.out.println("## Printing the pattern ##");
			for (int row = 1; row <= rows; row++) 
	         { 
	        for (int col = rows; col > row; col--)
				{
					System.out.print((char) (alphabet) + " ");
				}
				for (int k = 1; k <= row; k++)
				{
					System.out.print((char) (alphabet + row - 1) + " ");
				}
				System.out.println();
			}
		}
	}
*/
	 public class alpha1
	 {
	 public static void main(String args[])
	 {
	 for(char row='A';row<='D';row++)
	 {
		 for(char col='A';col<='C';col++)
	 System.out.print(row+" ");
		 System.out.println(" ");
	 }
	 System.out.println();
}
}
