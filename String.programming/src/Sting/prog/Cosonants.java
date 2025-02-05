package Sting.prog;

import java.util.Scanner;

public class Cosonants {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String s1 = new String(sc.nextLine());
		int len = s1.length(), count = 0;
		for (int i = 0; i < len; i++) {
			char ch = s1.charAt(i);
			if (ch !='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u') 
			{
				count++;
			}
		}
		System.out.println("total consonants are : " + count);
		sc.close();
	}
}
	