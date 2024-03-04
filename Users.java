package diabetes_app;
import java.util.Scanner;

public class Users {
	
	
	String validUser1 = "Bob";
	String validUser2 = "Rob"; 
	String validUser3 = "Kob";
	
	public void checker(int [] comprobarpassword ) {
		
		Scanner nuevo = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre de usuario: ");
		
		String attempt = nuevo.nextLine();
		
		int count = 0; 
		
		
		boolean again= true;
		while (again){
		again= false;
		switch(attempt) {
		  case "Bob":
			  Passwords bob = new Passwords();
			  bob.checker1(comprobarpassword);
			  //Sugar myUserSugar1 = new Sugar();
			  //myUserSugar1.checkSugar(mgensangre[0]);
			  
			  //System.out.println("Welcome!");
			  break;
		  case "Rob":
			  Passwords rob = new Passwords();
			  rob.checker2(comprobarpassword);
			  //Sugar myUserSugar2 = new Sugar();
			  //myUserSugar2.checkSugar(mgensangre[0]);
		    break;
		  case "Kob":
			  Passwords kob = new Passwords();
			  kob.checker3(comprobarpassword);
			  
			  
			  //Sugar myUserSugar3 = new Sugar();
			  //myUserSugar3.checkSugar(mgensangre[0]);
			  //Alimentos myOption = new Alimentos();
			  //myOption.menu();
			  
			  break;
			    default:
			    	
			    	again=true;
					  System.out.println("Usuario incorrecto. Intenta de nuevo: ");
						attempt = nuevo.nextLine();
						count++;
						if (count == 2) {
							if (attempt.equals("Rob") || attempt.equals("Bob") || attempt.equals("Kob")) {
								
								
								
								again= true;
								
							}
							else {
								System.out.println("Máximo de intentos permitido!");
								comprobarpassword[0] = 3;
								again= false;
		
		
		
	}

}
						}
		}
		}
	}
