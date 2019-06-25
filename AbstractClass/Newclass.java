package AbstractClass;
interface A
{  
void a();//bydefault, public and abstract  
}

interface B
{
	void b();
}

abstract class c implements A,B
{
	public void a()
	{
		System.out.println("This is A class");
	}
	
	public void b()
	{
		System.out.println("This is B class");
	}

}
class M extends c
{
	public void c()
	{
		System.out.println("This is C class");
	}
}

public class Newclass {
	public static void main(String args[]){ 
		M a = new M();
		a.a();
		a.b();
		a.c();
	}

}
