package gangadharprograms;

public class forloop_even
{

	public static void main(String[] args) 
	{
	
		int  a=0,b=1,c=0;
		
		System.out.print(a+" "+b+" ");
		for (int i=1;i<=9;i++) 
		{
			
			c=a+b;
			if(c%2==0)
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
		
		
		 
	}  
		
}

			

			

		
	

	


