package diabetes_app;

public class MainDiabetes {
	public static void main(String[] args) {
		int [] mgensangre = new int[1]; // array para guardar azúcar en sangre
		String nivelazucar;
		
		int [] comprobarpassword = new int[1];
		
		double [] hidratos = new double[1];// array para almacenar hidratos
		double hidratosporplato;
		double [] gramos = new double[1]; // array para almacenar gramos
		int unidadesdeinsulina;
		
		Users myUser = new Users();
		
		myUser.checker(comprobarpassword);
		
		//System.out.println(comprobarpassword[0]);
		
		if (comprobarpassword[0] < 3) {
		// el comprobador de password se modifica a 3 en caso de que el usuario ingrese 3 veces mal la contraseña
		// o el usuario. de ser así se finalizaría el programa
		
		Sugar mysugar = new Sugar();
		mysugar.checkSugar(mgensangre);
		
		//DETERMINAR NIVEL AZÚCAR EN SANGRE
		if (mgensangre[0] < 70) {nivelazucar = "Hipoglucemia";}
		else if (mgensangre[0] > 180) nivelazucar = "Hiperglucemia";
		else nivelazucar ="Óptimo";
		
		//System.out.println("Imprimiendo azúcar en sangre: " + mgensangre[0]);
		
		String [] seleccion = new String[5];
		Alimentos misAlimentos = new Alimentos();
		misAlimentos.menu(seleccion, hidratos);
		System.out.println("Alimento seleccionado: " + seleccion[0]);
		//System.out.println("Cantidad hidratos por cada 100: " + hidratos[0]);
		
		GrCantidad micantidad = new GrCantidad();
		micantidad.cantidad(gramos);
		
		//System.out.println("IMPRIMIR GRAMOS" + gramos[0]);
		
		hidratosporplato = (gramos[0] * hidratos[0])/100;
		
		//CÁLCULO UNIDADES DE INSULINA
		
		if (nivelazucar.equals("Óptimo")) System.out.println("Estado óptimo.");
		
		
		System.out.println("\n\nRESUMEN:\n" 
		+ "\nNivel de azúcar en sangre: " + mgensangre[0] + "mg/dL - " + nivelazucar+ 
		"\nAlimento: " + seleccion[0] + "\nCantidad: " + gramos[0] + " gramos" + "\nHidratos: " + hidratosporplato);
		
		//System.out.println(hidratosporplato);
				
		}
		
		else {System.out.println("El programa se ha acabado.");}
		
		
	}

}
