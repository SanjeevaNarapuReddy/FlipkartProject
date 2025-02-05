package oops_inheritance;
class animal
{
	public void eat()
	{
		System.out.println(" animal eats");
	}
}
class dog extends animal
{
	public void barks()
	{
		System.out.println(" dog barks");
	}
}
public class forest
{
public static void main(String[] args)
{
		dog d1=new dog();
		d1.eat();
		d1.barks();

	}

}
