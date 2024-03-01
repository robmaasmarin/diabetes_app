package diabetes_app;
import java.util.Scanner;

public class Alimentos {
	
	public void menu() {
		
		Scanner foodScanner = new Scanner(System.in);
	
		System.out.println("Selecciona un tipo de alimento:"
				+ "\n(1) LÁCTEOS"
				+ "\n(2) CEREALES & DERIVADOS"
				+ "\n(3) VERDURAS Y HORTALIZAS"
				+ "\n(4) FRUTAS"
				+ "\n(5) BEBIDAS"
				+ "\n(6) PLATOS COCINADOS");
		
		
		int optionmenu = Integer.parseInt(foodScanner.nextLine());
		
		switch(optionmenu) {
		  case 1:
		    Lacteos mislacteos = new Lacteos();
		    mislacteos.misLacteos();
		    break;
		  case 2:
		    Cereals mycereal = new Cereals();
		    mycereal.myCereals();
		    break;
		  default:
		    System.out.println("Invalid option.");
		}
	
	
	
	
	}

}
