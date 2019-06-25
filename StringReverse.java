package JavaPractice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "121";
		String k ="";
		
		
		
		for(int i=s.length()-1; i>=0; i--)
		{
//System.out.print(s.charAt(i));
			k = k + s.charAt(i);
	}
		System.out.println(k);
		
		if(s.equals(k))
		{
			System.out.println("Given text is palindrome:");
		}
		
		else
		{
			System.out.println("Not a palindrome");
		}
		
	

}
}
