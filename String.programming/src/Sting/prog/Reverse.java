package Sting.prog;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter String");
    String s1=new String(sc.nextLine());
    int len=s1.length();
    String rev= " ";
    for(int i=len-1;i>=0;i--)
    {
    	char ch=s1.charAt(i);
    	rev=rev+ch;
    }
    System.out.println("Reverse of String :"+rev);
    if(s1.equalsIgnoreCase(rev))
    {
    	System.out.println("Is palindrome string");
    }
    else
    {
    	System.out.println("Is non palindrome string");
    }
    sc.close();
}
}
