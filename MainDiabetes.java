package diabetes_app;

public class MainDiabetes {
	public static void main(String[] args) {
		int [] mgensangre = new int[1];
		
		int [] comprobarpassword = new int[1];
		
		double [] hidratos = new double[1];
		double hidratosporplato;
		
		Users myUser = new Users();
		
		myUser.checker(comprobarpassword);
		
		//System.out.println(comprobarpassword[0]);
		
		if (comprobarpassword[0] < 3) {
		// el comprobador de password se modifica a 3 en caso de que el usuario ingrese 3 veces mal la contraseña
		// o el usuario. de ser así se finalizaría el programa
		
		Sugar mysugar = new Sugar();
		mysugar.checkSugar(mgensangre);
		
		//System.out.println("Imprimiendo azúcar en sangre: " + mgensangre[0]);
		
		String [] seleccion = new String[5];
		Alimentos misAlimentos = new Alimentos();
		misAlimentos.menu(seleccion, hidratos);
		System.out.println("Alimento seleccionado: " + seleccion[0]);
		System.out.println("Cantidad hidratos por cada 100: " + hidratos[0]);
		
		GrCantidad micantidad = new GrCantidad();
		micantidad.cantidad();
		
		
				
		}
		
		else {System.out.println("El programa se ha acabado.");}
		
		
	}

}
