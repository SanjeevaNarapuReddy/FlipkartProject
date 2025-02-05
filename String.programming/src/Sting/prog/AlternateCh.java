package Sting.prog;

public class AlternateCh {

	public static void main(String[] args) {
		String s1 = new String("java development");
		int len = s1.length();
		for (int i = 0; i < len; i++)// (int i=0;i<len;i+2)
		{
			if (i % 2 == 0) {
				char ch = s1.charAt(i);
				System.out.println(ch);
			}
		}

	}
}