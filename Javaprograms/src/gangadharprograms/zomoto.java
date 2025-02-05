package gangadharprograms;

 class zomoto
{
public void restaurant()
{ 
	System.out.print("sort as per location");
}
public void customer()
{ 
	System.out.print("sort as per ratinga and reviews");
}
class zomotoApp extends zomoto
{
public void restaurant()
{ 
	System.out.print("sort as per  GPS location");
}
}
public class whatsApp
{
	public void main (String args[])
	{
		zomotoApp w1= new zomotoApp();
				w1.restaurant();
		w1.customer();
	}
}
}