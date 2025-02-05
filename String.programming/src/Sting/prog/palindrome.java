package Sting.prog;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter String");
	    String s1=new String(sc.nextLine());
	    int len=s1.length();
	    String rev= " ";
	    for(int i=len;i>=0;i--)
	    {
	    	char ch=s1.charAt(i);
	    	rev=rev+ch;
	    }
	    	    	
	    if(s1.equalsIgnoreCase(rev))
	    {
	    System.out.println("Is palindrome string");
	     }
	    	  sc.close();
	    	}
}
	
