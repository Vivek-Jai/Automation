package JavaPractice;

import java.util.HashSet;

public class CommonElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a []={"one","two","three","four","five"};
		String b []={"one","seven","three","four","six"};
		
		HashSet<String> set = new HashSet<String>();	
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					set.add (a[i]);
				}
			}
		}
		
		System.out.println("The common values are:"+set);
		
		
		
		
		
		}

	}


