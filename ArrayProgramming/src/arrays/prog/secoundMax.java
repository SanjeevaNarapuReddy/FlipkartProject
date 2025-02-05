package arrays.prog;
import java.util.Scanner;
public class secoundMax {


	public static void secoundmax(int a[]) {
	int max=a[0],smax=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			smax=max;
			max=a[i];
		}
		else if(a[i]>smax)
		{
			smax=a[i];
		}
	}
	System.out.println("maxium from array : "+max);
	System.out.println("secound maxium from array : "+smax);	
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
		secoundmax(a);
		sc.close();
	}
	
}
