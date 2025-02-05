package workshop;

public class palindromerec {

	public static int palindrom(int i) {
		 
		 int temp=i,rem,rev=0,num=i;
		    while(i>0)
		    {
		    	rem= i%10;//quotient of number will be stored
		    	num=i/10;// reminder of number will be stored
		    	rev=rev*10+rem;//
		    }
		    if(temp==rev)
		    	System.out.print(temp+" palindrome number");
		    
		    else
		    	System.out.print(temp+" non palindrome number ");
			}
public static void main(String args[]) {
		}
}