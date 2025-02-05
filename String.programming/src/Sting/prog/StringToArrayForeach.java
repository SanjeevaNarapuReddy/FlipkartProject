package Sting.prog;

public class StringToArrayForeach {

	public static void main(String[] args) {
		String s= "java development is easy";
		String str[]=s.split(" ");
		for(String d: str)
		{
			System.out.println(d);
		}
	}

}
