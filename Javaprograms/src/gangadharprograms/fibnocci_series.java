package gangadharprograms;

public class fibnocci_series {

	public static void main(String[] args) {
		int a=12,b=15,c;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=8;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
