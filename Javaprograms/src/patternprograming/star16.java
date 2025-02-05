package patternprograming;

public class star16 {

	public static void main(String args[]) {
    int star=1,space=3;
		for(int row=1;row<=4;row++)
		{
			for(int col=1;col<=space;col++)
			{
			 System.out.print(" ");
			}
			for (int j=1;j<=star;j++)
			{
		        System.out.print("*");
		    }
			    System.out.println();
			    star=star+2;
			    space=space-1;
		}

	}

}
