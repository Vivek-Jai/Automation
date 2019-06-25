package JavaPractice;

import java.util.HashSet;

import org.apache.xalan.xsltc.util.IntegerArray;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a[] ={ 1,2,3,5,5,6,8,9,9};
		  
	       /* HashSet<Integer> set = new HashSet<Integer>(); using collections
	  
	        for (int array : a)
	        {
	            if(!set.add(array)) // Print duplicate element
	            {
	                System.out.println("Duplicate Element is : "+array);
	            }*/
	            
	            /*if(set.add(array)) //Remove duplicate element
	            {
	                System.out.println("Duplicate Element is : "+array);
	            }
	        }*/
	            
	            for (int i = 0; i < a.length; i++) { 
	            	
	            	for (int j = i+ 1 ; j < a.length; j++) 
	            	{ 
	            		if (a[i]==(a[j])) 
	            		{
	            			System.out.println("The duplicate elements are:" +a[i]);
	            		}
	            	}
	            }

	            	

}
	}

