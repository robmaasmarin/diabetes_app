package diabetes_app;
import java.util.Scanner;

public class Sugar {

	public void checkSugar() {
	Scanner mysugar = new Scanner(System.in);
	int count = 0;
	
	while(true) {
	
	System.out.println("Please, insert sugar in blood: ");
	int quantity;
	
	// try catch para que el usuario solo pueda introducir un número
	try {
	quantity = Integer.parseInt(mysugar.nextLine());
	
	System.out.println("Your sugar quantity in blood: " +  quantity);
	break;
	
	}
	
	catch (NumberFormatException e) {
		// creamos un contador. Si introduce 3 veces datos no aceptados la app se cierra
		count++;
		if (count < 3) {
		System.out.println("Incorrect value.");
		continue;}
		
		else {
			System.out.println("Exceeded.");
			break;
		}
		//quantity = Integer.parseInt(mysugar.nextLine());
		
		
	}
	
	
	}
}}
