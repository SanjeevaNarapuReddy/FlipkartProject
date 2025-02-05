package gangadharprograms;

class Animal
 {
	public void eat()
	{
		System.out.println("Animal eat's");
	}
 }
class Cat extends Animal
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

class JavaExample
{
   
public static void main(String args[])
{
dog d1=new dog();
d1.eat();
d1.meow();
d1.barks();
}
}