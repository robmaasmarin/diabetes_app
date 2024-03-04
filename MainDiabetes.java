package diabetes_app;
import java.util.Scanner;

public class MainDiabetes {
	public static void main(String[] args) {
		boolean ejecucion = true; // boolean para controlar la ejecución y repetición de parte del programa en caso de querer seguir
		String continuar; // string para decidir si volvemos a ejecutar el programa o salimos del mismo
		int [] mgensangre = new int[1]; // array para guardar azúcar en sangre
		String [] nivelazucar = new String[1];//DETERMINAR NIVEL AZÚCAR EN SANGRE
		
		int [] comprobarpassword = new int[1];// controlador de intentos
		
		double [] hidratos = new double[1];// array para almacenar hidratos
		double [] hidratosporplato = new double[1];
		double [] gramos = new double[1]; // array para almacenar gramos
		double[] unidadesdeinsulina = new double[1];
		
		Users myUser = new Users();
		
		myUser.checker(comprobarpassword);
		
		//System.out.println(comprobarpassword[0]);
		while (ejecucion) {
			
		
		if (comprobarpassword[0] < 3) {
		// el comprobador de password se modifica a 3 en caso de que el usuario ingrese 3 veces mal la contraseña
		// o el usuario. de ser así se finalizaría el programa
		
				Sugar mysugar = new Sugar();
				mysugar.checkSugar(mgensangre);
				
				//DETERMINAR NIVEL AZÚCAR EN SANGRE
				if (mgensangre[0] < 70) {nivelazucar[0] = "Hipoglucemia";}
				else if (mgensangre[0] > 180) nivelazucar[0] = "Hiperglucemia";
				else nivelazucar[0] ="Óptimo";
				
				//System.out.println("Imprimiendo azúcar en sangre: " + mgensangre[0]);
				
				String [] seleccion = new String[5];
				Alimentos misAlimentos = new Alimentos();
				misAlimentos.menu(seleccion, hidratos);
				System.out.println("Alimento seleccionado: " + seleccion[0]);
				//System.out.println("Cantidad hidratos por cada 100: " + hidratos[0]);
				
				GrCantidad micantidad = new GrCantidad();
				micantidad.cantidad(gramos);
				
				//System.out.println("IMPRIMIR GRAMOS" + gramos[0]);
				
				hidratosporplato[0] = (gramos[0] * hidratos[0])/100;
				
				//CÁLCULO UNIDADES DE INSULINA - crear clase glucemia.java. Le pasaremos 3 parámetros para el cálculo:
				// nivelazucar, hidratosporplato, unidadesdeinsulina
				
				//if (nivelazucar[0].equals("Óptimo")) System.out.println("Estado óptimo.");

				glucemia miglucemia = new glucemia();
				miglucemia.medidorglucemia(nivelazucar, hidratosporplato, unidadesdeinsulina);

				//System.out.println("INsulina a inyectar: " + unidadesdeinsulina[0]);
				
				
				System.out.println("\n\nRESUMEN:\n" 
				+ "\nNivel de azúcar en sangre: " + mgensangre[0] + "mg/dL - " + nivelazucar[0]+ 
				"\nAlimento: " + seleccion[0] 
				+ "\nCantidad: " + gramos[0] 
				+ " gramos" 
				+ "\nHidratos: " + hidratosporplato[0] 
				+ "\nUnidades de insulina a inyectar: " + unidadesdeinsulina[0] + "\n");
				
				//System.out.println(hidratosporplato);
				// DAR OPORTUNIDAD DE PROBAR CON OTRO ALIMENTO O SALIR DEL PROGRAMA
				Scanner continuarono = new Scanner(System.in);
				System.out.println("Quieres probar con otro alimento?\n(Y) Sí\n(N) No");
				continuar = continuarono.nextLine();
				if (continuar.equals("Y")) {
					ejecucion = true;
				}
				else {
					ejecucion = false;
					System.out.println("Saliendo del programa.");
				}

				
		}
		
		else {System.out.println("Saliendo del programa.");
		ejecucion = false;}
		
	}
	}

}
