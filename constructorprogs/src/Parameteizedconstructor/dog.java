package Parameteizedconstructor;//pak declaration

public class dog //class declaration
{
String dname;              //initilise non static variables
public dog(String dogname)// constructor with arguments
{
	dname=dogname;
}
	public static void main(String[] args) {//main method
		dog d1=new dog("tommy");       //object creation
		System.out.println(d1.dname);
		dog d2= new dog("golden shpyard");//object creation
		System.out.println(d2.dname);
	}
}
