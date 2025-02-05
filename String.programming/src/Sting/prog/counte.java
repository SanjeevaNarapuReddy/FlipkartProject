package Sting.prog;
import java.util.Scanner;
public class counte {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any array");
		String s1 = new String(sc.nextLine());
		int len = s1.length(), count = 0;
		for (int i = 0; i < len; i++) {
			char ch = s1.charAt(i);
			if (ch =='e') 
			{
				count++;
			}
		}
		System.out.println("total e's are : " + count);
		sc.close();
	}
}
	