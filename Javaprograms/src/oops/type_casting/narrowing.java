package oops.type_casting;

public class narrowing {
	public static void main(String args[])
	{
		double d=120.987864;
		float f=(float)d;
		long l=(long)f;
		int i=(int)l;
		short s=(short)i;
		byte b=(byte)s;
	
System.out.println(d);
System.out.println(f);
System.out.println(l);
System.out.println(i);
System.out.println(s);
System.out.println(b);
}
}