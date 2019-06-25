package Innoppl.Selenium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fr=new FileWriter("C:\\Users\\innoppl\\Desktop\\new.txt");
    	BufferedWriter br=new BufferedWriter(fr);

    	br.write("test");
    	br.newLine();
    	br.close();

	}

}
