package Sting.prog;

import java.util.Scanner;

public class countwords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter String");
	    String s=sc.nextLine();
	    s=s.trim();
	    String s1=new String(s);
	    int len=s1.length();
	    int count=1;
	   for(int i=0;i<len;i++)
	   {
		   if(s1.charAt(i)==' '&& s1.charAt(i+1)!=' ')
		   {
			   count++;
		   }
	   }
	   System.out.println("count is : "+count);
	sc.close();
	}
}