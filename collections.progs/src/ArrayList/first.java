package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class first {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<>();

	Scanner sc = new Scanner(System.in);
	System.out.println("enter Array");
	int n= sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter object at"+i+" index");
		a1.add(sc.next());
	}
	sc.close();
	for(int j=0;j<n;j++)
	{
		System.out.println(a1.get(j));
	}
}
}