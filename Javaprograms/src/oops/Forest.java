package oops;

class animal
 {
	public void eat()
	{
		System.out.println("Animal eat's");
	}
 }
class Cat extends animal
{
	public void meow()
	{
		System.out.println("cat meow's");
	}
	}
class dog extends Cat
{
	public void barks()
	{ 
		System.out.println("dog bark's");
	}
}

public class Forest
{
public static void main(String []args)
{
dog d1=new dog();
d1.eat();
d1.meow();

}
}