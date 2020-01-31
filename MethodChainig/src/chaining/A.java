package chaining;

public class A 
{

	public B methodA()
	{
		System.out.println("From class A - methodA");
		return new B();
	}

}
