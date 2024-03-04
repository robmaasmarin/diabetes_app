package diabetes_app;
import java.util.Scanner;

public class Alimentos {
	
	public void menu(String [] seleccion, double[] hidratos) {
		
		Scanner foodScanner = new Scanner(System.in);
	
		System.out.println("\nSelecciona un tipo de alimento:"
				+ "\n(1) ALBÓNDIGAS"
				+ "\n(2) LASAÑA DE CARNE"
				+ "\n(3) LASAÑA DE VERDURA"
				+ "\n(4) PAELLA"
				+ "\n(5) LENTEJAS"
				+ "\n(6) ENSALADA"
				+ "\n(7) TORTILLA DE PATATA"
				+ "\n(8) PIZZA"
				
				);
		
		
		int optionmenu = Integer.parseInt(foodScanner.nextLine());
		
		switch(optionmenu) {
		  case 1:
			seleccion [0] = "Albóndigas";  
			Albóndigas misalbondigas = new Albóndigas();
			
			misalbondigas.albondigas(hidratos);
		    break;
		  case 2:
			 seleccion [0] = "Lasaña de carne";
		    LasanaCarne mylasana = new LasanaCarne();
		    mylasana.mylasanacarne(hidratos);
		    break;
		  case 3:
			  seleccion [0] = "Lasaña de verduras";
			  LasanaVerduras misverduras = new LasanaVerduras();
			  misverduras.lasverduras(hidratos);
			  break;
		  case 4: 
			  seleccion[0] = "Paella";
			  Paella paella1 = new Paella();
			  paella1.miPaella(hidratos);
			  break;
		  case 5: 
			  seleccion[0] = "Lentejas";
			  Lentejas mislentejas = new Lentejas();
			  mislentejas.laslentejas(hidratos);
			  break;
		  case 6:
			  seleccion[0] = "Ensalada";
			  Ensalada miensalada = new Ensalada();
			  miensalada.laensalada(hidratos);
			  break;
			case 7:
			seleccion[0] = "Tortilla";
			Tortilla mitortilla = new Tortilla();
			mitortilla.latortilla(hidratos);
			break;

			case 8:
			seleccion[0] = "Pizza";
			Pizza mipizza = new Pizza();
			mipizza.lapizza(hidratos);
			break;


		
		    
		    
		    
		  default:
		    System.out.println("Invalid option.");
		}
	
	
	
	
	}

}
