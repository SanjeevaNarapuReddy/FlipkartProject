package patternprograming;

public class star22 {

	public static void main(String[] args) {
		int star=7,space=0;
		for(int row=1;row<=7;row++)
		{
			for(int i=1;i<=space;i++)
			{
			 System.out.print(" ");
			}
			for (int j=1;j<=star;j++)
			{
		        System.out.print("*");
		    }
			  if(row<=3)
			  {
			    star=star-2;
			    space=space+1;
			  }
			  else
			  {
		
	            star=star+2;
	            space=space-1;
             }
			  System.out.println();
}
}
}