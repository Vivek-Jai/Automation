package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int value[]={1,3,5};  //
	ArrayList lis=new ArrayList<>();
	
	int count =1;//3
	
	for(int i=0;i<value.length;i++)
	{
		//    3==1
		if(count==value[i])
		{
			count++;//2
			continue;
		}
		else
		{
			lis.add(count);//2
			
			i--; // 0
			
			count++;//3
		}
	}
		
		System.out.println(lis);
		 
	
	
	
	}

}
