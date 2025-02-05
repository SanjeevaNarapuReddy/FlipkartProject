package Sting.prog;

public class First {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = new String("java programming");
		int len = s1.length();
		for (int i = 0; i < len; i++)
		{
			char ch = s1.charAt(i);
			if(ch=='a'& ch=='m')
			{
			System.out.println(ch);
		    }
	  }
}
}