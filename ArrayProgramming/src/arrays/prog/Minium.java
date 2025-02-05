package arrays.prog;
import java.util.Scanner;
public class Minium {
public static void Minium(int a[])
{
int min=a[0];
for(int i=1;i<a.length;i++)
{
	
	
	if(a[i]<min)
	{
		min=a[i];
	}
}

System.out.println("minium from array : "+min);	

}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	int a[]=new int[size];
	for( int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	Minium(a);
	sc.close();
}
}