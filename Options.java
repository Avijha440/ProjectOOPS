package Phase1Project;
import java.io.File;
import java.util.Scanner;
import java.io.IOException; 


public class Options {
	Scanner s= new Scanner(System.in);
	public void display() {
		System.out.println();
		System.out.println("1) Retrive all files in Lockers");
		System.out.println("2) File Operations");
		System.out.println("3) Exit");
		System.out.println();
	}
	public void operations() {
		System.out.println("Look below to choose your option, type-in the option number and press 'Enter' to proceed");
		System.out.println("a) Search a file in Lockers");
		System.out.println("b) Add a file to Lockers");
		System.out.println("c) Delete a file from Lockers");
		System.out.println("d) Go to Previous Menu");
		System.out.println("e) Exit");
	}
	public int input() {
		System.out.println("Please type-in the option number: ");
		int a= s.nextInt();
		return a;
	}
	public char ainput() {
		System.out.println("Please type-in the option number: ");
		char a= s.next().charAt(0);
		return a;
	}
	public void displayFiles() {
		File dir = new File("D:\\Project1");
	      String[] children = dir.list();
	      
	      if (children == null) {
	         System.out.println( "No Files");
	      } else { 
	         for (int i = 0; i< children.length; i++) {
	        	 for (int j = i+1; j<children.length; j++)   
	        	 {  
	        	 if(children[i].compareTo(children[j])>0)   
	        	 {  
	        	 String temp = children[i];  
	        	 children[i] = children[j];  
	        	 children[j] = temp;  
	        	 }  
	        	 }  
	         }
	}
	      System.out.println("Name of files in ascending order: ");
	      for (String i: children)
	    	  System.out.println(i);
	}
	public void search() {
		System.out.println("Enter the name of File");
		String z= s.next();
		File dir = new File("D:\\Project1");
	      String[] children = dir.list();
	      int temp= 0;
	      if (children == null) {
	         System.out.println( "No Files");
	      } else { 
	         for (String k: children) {
	        	 if(z.equals(k)) {
	        		 System.out.println("File found in Directory");
	        		 temp++;
	        		 break;
	        	 }
	        	 }
	        	 }
	      if(temp==0)
	        	 System.out.println("File not found");
	         }
	public void add() {
		boolean flag = false;
		System.out.println("Enter the name of File: ");
		String k= s.next();
		File stockFile = new File("D:\\Project1/"+ k);
		try {
		    flag = stockFile.createNewFile();
		    if(flag)
		    	System.out.println("File added successfully");
		} catch (IOException ioe) {
		     System.out.println("Error while Creating File in Java" + ioe);
		}

	}
	public void delete() {
		System.out.println("Enter the name of file you want to delete");
		String k= s.next();
		File file = new File("D:\\Project1\\"+ k);
        if(file.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
	}
	public void exit() {
		System.out.println("Program exited successfully");
		System.exit(0);
	}
}