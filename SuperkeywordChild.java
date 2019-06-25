package JavaPractice;

public class SuperkeywordChild extends SuperkeywordParent {
	
	String name ="Vivek";
	
	public void namechild()
	{
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperkeywordChild love = new SuperkeywordChild();
		
		love.namechild();
		
		
		
		
		
		

	}

}
