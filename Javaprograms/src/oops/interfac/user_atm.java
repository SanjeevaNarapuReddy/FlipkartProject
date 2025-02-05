package oops.interfac;
interface ATM
{
	void withdraw();
	void deposit();
	void pinchange();
}
 class Icici implements ATM
{
	public void withdraw()
	{
		System.out.println("withdarw amount");
	}
	public void deposit()
	{
		System.out.println("deposit amount");
	
	}
	public void pinchange()
	{
		System.out.println("change pin");
	}
	
}
class City implements ATM
{
	public void withdraw()
	{
		System.out.println("withdraw amount 1000 rs");
	}
	public void deposit()
	{
		System.out.println("deposit amount 2000 rs");
	
	}
	public void pinchange()
	{
		System.out.println("change pin to 3456");
	}
}
public class user_atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Icici a1=new Icici();
a1.withdraw();
a1.deposit();
a1.pinchange();
City b1=new City();
b1.withdraw();
b1.deposit();
b1.pinchange();
	}1q
}

