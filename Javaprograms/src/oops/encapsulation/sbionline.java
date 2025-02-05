
       package oops.encapsulation;
public class sbionline
{
	private String uname,pwd,text;
	public void setuname(String uname)    //setter for uname
	{
		this.uname=uname;
	}
	public void setpwd(String pwd)       //setter for pwd
	{
		this.pwd=pwd;
	}
	public void settext(String text)
	{
		this.text=text;
	}
	   public String getuname()                       //getter for uname
	   {
	
	if(uname=="Ygrreddy924ganga")      //vaiddata
	{
		return"valid uname address";
	}
	else
	{
		return"invalid uname adderss";
	}
}
	  
	   public String getpwd()        // getter for pwd
	   {
		   if(pwd=="Ganga@924")
		   {
			   return"valid password";
		   }
		   else
		   {
			   return"invalid password,enter correct password";
		   }
	   }
public String gettext()
{
	if(text=="423e678")
	{
		return"vaild text typed";
	}
	else
	{
		return"invalid text,type valid text";
	}
}
}

