package Noargconstructor;

public class dog
{
String dname;
public dog()     //constructor--->initialise  non static variabes for each object
{                
	dname="tommy" ;
	
}
	public static void main(String[] args)
	{
		dog d1 = new dog();
		System.out.println(d1.dname);
		dog d2 = new dog();
		System.out.println(d2.dname);
    }

}
