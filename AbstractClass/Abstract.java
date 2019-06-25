package AbstractClass;

abstract class Employee
{
	void name()
	{
		System.out.println("My name is: vivek");
	}
	abstract void id();
	
	}
	
class Employee2 extends Employee
{

	@Override
	void id() {
		// TODO Auto-generated method stub
		
		System.out.println("My employee ID is: 7");
		
	}
}
	public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee2 emp2 = new Employee2();
		emp2.id();
		emp2.name();
		

	}

}

