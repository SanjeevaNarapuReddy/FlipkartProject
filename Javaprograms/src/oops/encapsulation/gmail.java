package oops.encapsulation;
class gmail
{
	private String uname,pwd;
	public void setuname(String uname)    //setter for uname
	{
		this.uname=uname;
	}
	public void setpwd(String pwd)       //setter for pwd
	{
		this.pwd=pwd;
	}
	   public String getuname()                       //getter for uname
	   {
	
	if(uname=="ygrreddy1947@gmail.com")      //vaiddata
	{
		return"valid gmail address";
	}
	else
	{
		return"invalid gmail adderss";
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

