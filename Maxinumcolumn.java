package JavaPractice;

public class Maxinumcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                                            //      [0] [1] [2] 
		int abc[] [] ={{1,10,0},
				       {3,9,5},
				       {21,3,7}};                           //[0]        1    10   6
		                                                   //[1]    6     8   9
		                                                   //[2]    21    3   7 
		
		int min = abc[0] [0];
		int mincolumn = 0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min = abc [i] [j];
					mincolumn = j;  //[0]
				}
			}
		}
		
		int k=0;
		int max = abc[0] [mincolumn]; 
		while (k<3)
		{           
			if(abc[k] [mincolumn]>max) 
			{
				max = abc[k] [mincolumn];
			}
			k++;
			
		}
		
		System.out.println(max);
	}
}




	


