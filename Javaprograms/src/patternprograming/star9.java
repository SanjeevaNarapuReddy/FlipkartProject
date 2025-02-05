package patternprograming;
/*
public class star9{

	public static void main(String[] args) 
	{
		
for(int row=1;row<=4;row++)
{
	for(int col=1;col<=4;col++)
	{
		if(row==4 || col==1 || row==3 && col==2 || row==3 && col==3 || row==2 && col==2)  //if(row>=col)
        System.out.print("*");
		else
        System.out.print(" ");
}
	    System.out.println();
}
}
}
*/
public class star9{

public static void main(String[] args) 
{
	
for(int row=1;row<=4;row++)
{
for(int col=1;col<=4;col++)
{
	if(row>=col)
    System.out.print("*");
	else
    System.out.print(" ");
}
    System.out.println();
}
}
}                                                                        
