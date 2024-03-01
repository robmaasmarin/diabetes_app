package diabetes_app;
import java.util.Scanner;

public class Sugar {

	public void checkSugar() {
	Scanner mysugar = new Scanner(System.in);
	
	System.out.println("Please, insert sugar in blood: ");
	
	int quantity = Integer.parseInt(mysugar.nextLine());
	
	System.out.println("Your sugar quantity in blood: " +  quantity);
	
	
	
	
	}
}
