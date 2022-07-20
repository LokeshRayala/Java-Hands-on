package projectemail;

import java.util.regex.*;  
import java.util.*;    

public class EmailValidation{  
    public static void main(String args[]){ 
    	
    	Scanner obj = new Scanner(System.in);
    	
        ArrayList<String> emails = new ArrayList<String>();  
        
        // Valid Email IDs
        emails.add("lokesh@gmail.com");  
        emails.add("lokesh@yahoo.co.in");  
        emails.add("lokesh.rayala@facebook.com");  
        emails.add("lokesh@git.in");
        
        // Invalid Email IDs
        emails.add("lokesh#@youtube.co.in");
        emails.add("lokeshYahoo");
        emails.add("@hotmail.com");
        
        // Dynamic Input email ids by user
        //System.out.println("Enter any 5 Email ids to validate\n");
        
       // for(int i=0; i<5; i++) {
        	
        	//String s = obj.nextLine();
            
            //emails.add(s);
        	// }
        
        
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";  
        
        Pattern pattern = Pattern.compile(regex); 
        
        System.out.println("Email ID Validation");
        System.out.println();
        
        for(String email : emails){    
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  
