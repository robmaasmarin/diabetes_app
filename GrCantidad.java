package diabetes_app;
import java.util.Scanner;

public class GrCantidad {

	public void cantidad(double [] gramos) {
		
		Scanner grScanner = new Scanner(System.in);
		
		System.out.println("Introduce cantidad en gramos: ");
		
		double foodquantity = Double.parseDouble(grScanner.nextLine());
		
		System.out.println("Has introducido " + foodquantity + " gramos.");
		gramos[0] = foodquantity;
		
		
		
		
		
	}
}
