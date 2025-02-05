package gangadharprograms;

public class fibnocci_4series {

	public static void main(String[] args) {
		int a=3,b=5,c=7,d;
		System.out.println(a+" "+b+" "+c+" ");
		for(int i=1;i<=8;i++)
		{
			d=a+b+c;
			System.out.println(d+" ");
			a=b;
			b=c;
			c=d;
		}

	}

}
