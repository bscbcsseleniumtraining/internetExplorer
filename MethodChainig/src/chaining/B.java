package chaining;

public class B 
{
	public C methodB()
	{
		System.out.println("From class B - methodB");
		return new C();
	}
	

}
