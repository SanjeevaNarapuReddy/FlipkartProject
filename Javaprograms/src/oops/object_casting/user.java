package oops.object_casting;

 class normal_user {
public void dailyshows()
{
	System.out.println("exixsting shows");
}
}
class vipuser extends normal_user
{
	public void liveshows()
	{
		System.out.println("all live shows can be watched");
	}
}
public class user
{
	public static void main(String args[])
	{
		normal_user d1=new vipuser();
		d1.dailyshows();
	vipuser l1=(vipuser) d1;//down casting
	l1.dailyshows();//super class 
	l1.liveshows();//sub class      
		
	}
	
}