package arrays.prog;
import java.util.Scanner;
public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter size of array");
		int size= sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]= sc.nextInt();
		}
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
				   a[j+1]=temp;
				}
			}
		}
		System.out.println("Max :"+a[size-1]);
		System.out.println("Min :"+a[0]);
		System.out.println("Secound Max :"+a[size-2]);
		System.out.println("Secound Min :"+a[1]);
		sc.close();
	}
}
