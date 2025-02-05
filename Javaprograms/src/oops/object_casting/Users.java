package oops.object_casting;

class students//super class
{
	public void view()
	{
		System.out.println("view details in app");
	}
}
class admin extends students
{
	public void edit()
	{
		System.out.println("edit details in app");
	}
}
class corporatoff extends admin
{
	public void delete()
	{
		System.out.println("delete data permanently");
	}
}
public class Users 
{
public static void mian(String args[])
{
	students s1=new admin();       //upcasted
	s1.view();
	admin a1=(admin) s1;           //downcasted
	a1.view();    a1.edit();
	admin a2=new corporatoff();      //upcasted
	a2.view();   a2.edit();
	corporatoff c1= (corporatoff) a2;  //downcasted
	c1.view(); c1.edit(); c1.delete();
}
}	
	
	

