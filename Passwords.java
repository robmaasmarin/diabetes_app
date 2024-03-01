package diabetes_app;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;


public class Passwords {
		
	Scanner passScanner = new Scanner(System.in);
	String option;
	int intento = 0;
	
	public void checker1() {
				
		System.out.println("Please insert password: ");
		option = passScanner.nextLine();
		
		boolean again= true;
		while (again){
		again= false;
		switch(option) {
		  case "pass123":
		    
			  System.out.println("Welcome!");
		    break;
		  
		  default:
			  again=true;
		    System.out.println("Incorrect");
		    option = passScanner.nextLine();
		    intento++;
		    if (intento == 2) {
				if (option.equals("pass123") ) {
					
					
					
					again= true;
					
				}
				else {
					System.out.println("Exceeded!");
					again= false;



}}
		}
		}
		
	}
	
	public void checker2() {
		
		System.out.println("Please insert password: ");
		option = passScanner.nextLine();

				boolean again= true;
				while (again){
					again= false;
					switch(option) {
					case "pass456":
			    
				  System.out.println("Welcome!");
			    break;
			  
			  default:
				  again=true;
			    System.out.println("Incorrect");
			    option = passScanner.nextLine();
			    intento++;
			    if (intento == 2) {
					if (option.equals("pass123") ) {
						
						
						
						again= true;
						
					}
					else {
						System.out.println("Exceeded!");
						again= false;
			
			
			
			}}
			}
			}
			
			}
	

	public void checker3() {
		
			System.out.println("Please insert password: ");
			option = passScanner.nextLine();
			
			boolean again= true;
			while (again){
			again= false;
			switch(option) {
			  case "pass789":
			    
				  System.out.println("Welcome!");
			    break;
			  
			  default:
				  again=true;
			    System.out.println("Incorrect");
			    option = passScanner.nextLine();
			    intento++;
			    if (intento == 2) {
					if (option.equals("pass123") ) {
						
						
						
						again= true;
						
					}
					else {
						System.out.println("Exceeded!");
						again= false;



}}
}
}

}
	

	}

