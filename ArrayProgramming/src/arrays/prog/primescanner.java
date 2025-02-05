package arrays.prog;
import java.util.Scanner;
public class primescanner {

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
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<a[i];j++)
			{
		if(a[i]%j ==0)
		{
			count++;
		
			}
			if(count==2) 
			{
				System.out.println(a[i]+"is prime number");
			}
		}
		}
	}
}
