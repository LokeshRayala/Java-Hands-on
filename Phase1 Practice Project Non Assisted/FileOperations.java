package FileHandlingProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class FileOperations {
	
	public static void readFileReaderClass() throws IOException
	{ 
		FileReader reader= new FileReader("E:\\files\\FileDemo.txt");
		
		int data;
		
		while((data=reader.read())!=-1){
			
			System.out.print((char)data);
		}
		
	}
	
	public static void WriteFile() throws IOException
	{
		File file= new File("E:\\files\\FileDemo.txt");

		FileWriter  writer= new  FileWriter(file,false);//overWrites file
		writer.write("Welcome to Java Training...!");
		System.out.println("Sucessfully written text into the file");
		writer.close();
		
		
	}
	
	public static void AppendFile() throws IOException
	{
		File file= new File("E:\\files\\FileDemo.txt");
		
		FileWriter  writer= new  FileWriter(file,true);//appends File
		writer.write("Have a Nice Day...!");
		System.out.println("Sucessfully appended text into the file");
		writer.close();
	}
	
	 public static void main(String args[]) throws FileNotFoundException, IOException {
		 
		 	Scanner obj =new Scanner(System.in);
		 	
	        System.out.println("Select any one operation");
	        System.out.println(" r for read mode ");
	        System.out.println(" w for write mode ");
	        System.out.println(" a for append mode ");
	        
	        String s=obj.nextLine();
	        
	        if(s.equalsIgnoreCase("r"))
	        {
	        	try{
	        		readFileReaderClass();
	        		}
	        	catch (IOException e) {
	    			e.printStackTrace();
	        	}
	        }
	        else if(s.equalsIgnoreCase("w"))
	        {
	        	try{
	        		WriteFile();
	        		}
	        	catch (IOException e) {
	    			e.printStackTrace();
	        	}
	        }
	        else if(s.equalsIgnoreCase("a")) {
	        	
	        	try{
	        		AppendFile();
	        		}
	        	catch (IOException e) {
	    			e.printStackTrace();
	        	}
	        }
	        else
	        {
	            System.out.println("Unknown Input");
	        }
	        
	        obj.close();
	        
	    }
	
}
