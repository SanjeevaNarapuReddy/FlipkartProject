package oops.encapsulation;

public class gmailuser
{
	public static void main (String args[])
	{
		gmail g1=new gmail();
		g1.setuname("ygrreddy1947@gmail.com");
		g1.setpwd("Ganga@0987");
		System.out.println(g1.getuname());
		System.out.println(g1.getpwd());
	}
}