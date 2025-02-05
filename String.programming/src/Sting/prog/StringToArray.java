package Sting.prog;

public class StringToArray {

	public static void main(String[] args) {
		String s= "java development is easy";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);

	}

}
