package arrays.prog;

import java.util.Scanner;

public class secoundMin {
	public static void secoundmin(int a[]) {
		int min=a[0],smin=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println("first 4minium from array : "+min);
		System.out.println("secound minium from array : "+smin);	
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
			secoundmin(a);
			sc.close();
		}
		
	}



