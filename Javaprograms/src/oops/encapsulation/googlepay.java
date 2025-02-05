package oops.encapsulation;

public class googlepay 
{
	private String upi,pwd;
	public void setupi(String upi)    //setter for uname
	{
		this.upi=upi;
	}
	public void setpwd(String pwd)       //setter for pwd
	{
		this.pwd=pwd;
	}
	   public String getupi()                       //getter for uname
	   {
	
	if(upi=="7550119128@ybl")      //vaiddata
	{
		return"valid upi address";
	}
	else
	{
		return"invalid upi adderss";
	}
}
	  
	   public String getpwd()        // getter for pwd
	   {
		   if(pwd=="Ganga@0987")
		   {
			   return("valid password");
		   }
		   else
		   {
			   return"invalid password,enter correct password";
		   }
	   }

}



