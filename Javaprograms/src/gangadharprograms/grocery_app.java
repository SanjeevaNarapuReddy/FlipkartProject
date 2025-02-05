package gangadharprograms;

public class grocery_app 
{
static String itemname="chocoate",brand_name="kitkat";
int amount=40,quantity=1;
public static void customer_order()
{ 
	System.out.println("item: " +itemname);
	System.out.println( "brad: "+brand_name);
	grocery_app s1= new grocery_app();
	System.out.println("amount: "+s1.amount);
	System.out.println("quantity: "+s1.quantity);
}
public void delivery_partner()
{
	int mak_charges=5,sanitizer_charge=6;
	System.out.println("mask charges: " +mak_charges);
	System.out.println("sanitizer charges: "+sanitizer_charge);
	}
public static void main(String args[])
{ 
	customer_order();
	grocery_app s2=new grocery_app();
	s2.delivery_partner();
}
}
