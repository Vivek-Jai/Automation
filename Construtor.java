package JavaPractice;

public class Construtor {
	
	
	int id;
	int num;
	
	Construtor( int a)
	{
		id=a;
		
		System.out.println(a);
	}
	
	Construtor( int a, int b)
	{
		id=a;
		num=b;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	/*void display()
	{
	System.out.println("employee id is:"+id);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Construtor n =new Construtor(4);
		Construtor nn =new Construtor(5,25);
		
		
	   //n.display();
       
	}

}
