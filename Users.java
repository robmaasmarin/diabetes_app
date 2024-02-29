package diabetes_app;
import java.util.Scanner;

public class Users {
	
	
	String validUser1 = "Bob";
	String validUser2 = "Rob"; 
	String validUser3 = "Kob";
	
	public void checker() {
		
		Scanner nuevo = new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		
		String attempt = nuevo.nextLine();
		
		int count = 0; 
		
		
		boolean again= true;
		while (again){
		again= false;
		switch(attempt) {
		  case "Bob":
			  System.out.println("Welcome!");
			  break;
		  case "Rob":
			  System.out.println("Welcome!");
		    break;
		  case "Kob":
			  System.out.println("Welcome!");
			    break;
			    default:
			    	
			    	again=true;
					  System.out.println("Wrong username. Try again: ");
						attempt = nuevo.nextLine();
						count++;
						if (count == 2) {
							if (attempt.equals("Rob") || attempt.equals("Bob") || attempt.equals("Kob")) {
								
								
								
								again= true;
								
							}
							else {
								System.out.println("Exceeded!");
								again= false;
		
		
		
	}

}
						}
		}
		}
	}
