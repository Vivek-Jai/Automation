package JavaPractice;

public class Thiskeyword {
	  int a;
	
	public void key(int a)
	{
		this.a=a;
		
		System.out.println(a);
		
	}
	
	

	public static void main(String[] args) {
		
		Thiskeyword k = new Thiskeyword();
		k.key(10);
		

	}

}
