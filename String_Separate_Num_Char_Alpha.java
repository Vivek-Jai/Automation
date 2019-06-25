package JavaPractice;

public class String_Separate_Num_Char_Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String A = "vi2ve#$$6799$%$&^%k";
		
		String number="";
		String Text ="";
		String SpecialCharacter="";
		
		for(int i=0;i<A.length();i++)
		{
			char k=A.charAt(i);
			
			if(Character.isAlphabetic(k))
			{
				Text += k;
			}
			
			else if(Character.isDigit(k))
			{
				number+=k;
			}
			else 
			{
				SpecialCharacter+=k;
			}
			
		}
		
		System.out.println("the alphabet is:"+Text);
		System.out.println("the Number is:"+number);
		System.out.println("the Specialcharater is:"+SpecialCharacter);
	}

}
