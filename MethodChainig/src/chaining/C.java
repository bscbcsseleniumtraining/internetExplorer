package chaining;

public class C 
{
	public D methodC()
	{
		System.out.println("From class C - methodC");
		return new D();
	}
}
