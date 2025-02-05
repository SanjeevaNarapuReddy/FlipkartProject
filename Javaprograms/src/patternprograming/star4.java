package patternprograming;
public class star4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
for(int row=1;row<=4;row++)
{
	for(int col=1;col<=4;col++)
	{
		if(col%2!=0)
			System.out.print("*");
		else
			System.out.print("#");
	}
	System.out.println();
}
	}
}
 