package chaining;

public class Driver 
{

	public static void main(String[] args) 
	{		
//		A objA = new A();
//		objA.methodA();
//		
//		B objB = new B();
//		objB.methodB();
//		
//		C objC = new C();
//		objC.methodC();
//		
//		D objD = new D();
//		objD.methodD();
		
//		A objA = new A();
//		objA.methodA().methodB().methodC().methodD();
		
		new A().methodA().methodB().methodC().methodD();
		
		
	}

}
