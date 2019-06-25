package rest.Practice.Multiple_inheritance;

public class ClassC extends ClassB {

	public void write() {
		// TODO Auto-generated method stub
		System.out.println("This is from Class A");
	}
	
	public static void main(String[] args) {
		
		ClassB b =new ClassB();
		b.write();
		ClassC c= new ClassC();
		c.write();
		
		
		
	
		
	}
	
	
	
	

	
}
