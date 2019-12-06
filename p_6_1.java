class Animal
{
	void eat()
	{	
	System.out.println("I am eat in Animal");	
	}
	void sleep()
	{	
	System.out.println("I am sleep in Animal");	
	}
}
class Bird extends Animal
{
	void eat()
	{	
	System.out.println("I am eat in Bird");	
	}
	void sleep()
	{	
	System.out.println("I am sleep in Bird");	
	}
	void fly()
	{	
	System.out.println("I am fly in Bird");	
	}
}
class p_6_1
{
	public static void main(String args[])
	{
	Animal a=new Animal();
	a.sleep();
	a.eat();
	Bird b=new Bird();
	b.sleep();
	b.eat();
	b.fly();
	}
}
















