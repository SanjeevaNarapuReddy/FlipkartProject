package arrays.prog;
import java.util.Scanner;
public class Maxium {
public static void maxium(int a[])
{
int max=a[0];
for(int i=1;i<a.length;i++)
{
	if(a[i]>max)
	{
		max=a[i];
	}
	
}
System.out.println("maxium from array : "+max);
	

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
	maxium(a);
	sc.close();
}
}