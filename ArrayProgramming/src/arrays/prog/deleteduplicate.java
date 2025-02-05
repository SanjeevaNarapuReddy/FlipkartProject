package arrays.prog;

public class deleteduplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,5,1,2,1,2,4};
	int a[]= {1,1,1,2,2,3,3,4,5};
	int b[]=new int[a.length];
	int k=0;
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]!=a[i+1])
		{
			b[k]=a[i];
			k++;
		}
	}
	b[k]=a[a.length-1];
	for(int i=0;i<=k;i++)
	{
		System.out.println(b[i]);
	}
	}

}
