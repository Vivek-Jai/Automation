package JavaPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFromFile {

	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub
		
		File file = 
			      new File("C:\\Users\\innoppl\\Desktop\\TEXT.txt"); 
			    Scanner sc = new Scanner(file); 
			  /*
			    while (sc.hasNextLine()) 
			    {
			      System.out.println(sc.nextLine()); 
			  } */
			  
			  //OTHER WAY 
			    
			    BufferedReader br = new BufferedReader(new FileReader(file)); 
			    
			    String st; 
			    while ((st = br.readLine()) != null) 
			      System.out.println(st); 
			    } 
			   
			   
			   

	}


