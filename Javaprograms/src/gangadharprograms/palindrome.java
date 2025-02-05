package gangadharprograms;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num =1231,rem,rev=0,temp=num;
    while(num>0)
    {
    	rem= num%10;//quotient of number will be stored
    	num=num/10;// reminder of number will be stored
    	rev=rev*10+rem;//
    }
    if(temp==rev)
    	System.out.print(temp+" palindrome number ");
    else
    	System.out.print(temp+" non palindrome number ");
	}

}
