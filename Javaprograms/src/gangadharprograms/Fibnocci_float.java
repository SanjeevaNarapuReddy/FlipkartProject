package gangadharprograms;

public class Fibnocci_float{

	public static void main(String[] args) {
		float a=0.5f, b=1.5f,c;
		System.out.print(a+"  "+b+"  ");
		for(int i=1;i<=8;i++)
		{
			c=a+b;
			System.out.print(c+"  ");
			a=b;
			b=c;
		}

	}

}
