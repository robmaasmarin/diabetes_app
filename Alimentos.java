package diabetes_app;
import java.util.Scanner;

public class Alimentos {
	
	public void menu(String [] seleccion, double[] hidratos) {
		
		Scanner foodScanner = new Scanner(System.in);
	
		System.out.println("Selecciona un tipo de alimento:"
				+ "\n(1) ALBÓNDIGAS"
				+ "\n(2) CEREALES & DERIVADOS"
				+ "\n(3) VERDURAS Y HORTALIZAS"
				+ "\n(4) FRUTAS"
				+ "\n(5) BEBIDAS"
				+ "\n(6) PLATOS COCINADOS");
		
		
		int optionmenu = Integer.parseInt(foodScanner.nextLine());
		
		switch(optionmenu) {
		  case 1:
			seleccion [0] = "Albóndigas";  
			Albóndigas misalbondigas = new Albóndigas();
			
			misalbondigas.albondigas(hidratos);
		    break;
		  case 2:
			 seleccion [0] = "Cereales";
		    Cereals mycereal = new Cereals();
		    mycereal.myCereals();
		    break;
		  case 3:
			  seleccion [0] = "Verduras y Hortalizas";
			  Verduras misverduras = new Verduras();
			  misverduras.lasverduras();
			  break;
		  case 4: 
			  seleccion[0] = "Frutas";
			  Frutas lasfrutas = new Frutas();
			  lasfrutas.misfrutas();
			  break;
		  case 5: 
			  seleccion[0] = "Bebidas";
			  Bebidas misbebidas = new Bebidas();
			  misbebidas.lasbebidas();
			  break;
		  case 6:
			  seleccion[0] = "Platos cocinados";
			  Platos misplatos = new Platos();
			  misplatos.losplatos();
			  break;
		    
		    
		    
		  default:
		    System.out.println("Invalid option.");
		}
	
	
	
	
	}

}
