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
			  Passwords bob = new Passwords();
			  bob.checker1();
			  Sugar myUserSugar1 = new Sugar();
			  myUserSugar1.checkSugar();
			  
			  //System.out.println("Welcome!");
			  break;
		  case "Rob":
			  Passwords rob = new Passwords();
			  rob.checker2();
			  Sugar myUserSugar2 = new Sugar();
			  myUserSugar2.checkSugar();
		    break;
		  case "Kob":
			  Passwords kob = new Passwords();
			  kob.checker3();
			  Sugar myUserSugar3 = new Sugar();
			  myUserSugar3.checkSugar();
			  Alimentos myOption = new Alimentos();
			  myOption.menu();
			  
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
