package diabetes_app;

public class glucemia {
	//PASAREMOS 3 ARGUMENTOS PARA CALCULAR LAS UNIDADES DE INSULINA Y OBTENERLAS TRAS PASO POR REFERENCIA
	public void medidorglucemia(String [] nivelazucar, double [] hidratosporplato, double[] unidadesdeinsulina) {

		switch(nivelazucar[0]) {
			case "Óptimo":
			if (hidratosporplato[0] < 10) {
				//System.out.println("WORKING");
				unidadesdeinsulina[0] = 1;}
			else if (hidratosporplato[0] > 10 && hidratosporplato[0] < 20)
			{unidadesdeinsulina[0] = 2;}
			else {unidadesdeinsulina[0] = 3;}
			break;

			case "Hipoglucemia":
			// EN CASO DE HIPO TENDREMOS QUE INYECTAR MENOS INSULINA POR CADA 10GR DE HIDRATOS PARA QUE SUBA EL NIVEL DE AZÚCAR EN SANGRE

			if (hidratosporplato[0] < 10) {
				
				unidadesdeinsulina[0] = 0.5;}
			else if (hidratosporplato[0] > 10 && hidratosporplato[0] < 20)
			{unidadesdeinsulina[0] = 1;}
			else {unidadesdeinsulina[0] = 1.5;}
			break;

			case "Hiperglucemia":
			// EN CASO DE HIPER TENDREMOS QUE INYECTAR MÁS INSULINA POR CADA 10GR DE HIDRATOS PARA QUE BAJE EL NIVEL DE AZÚCAR EN SANGRE
			if (hidratosporplato[0] < 10) {
				
				unidadesdeinsulina[0] = 1.5;}
			else if (hidratosporplato[0] > 10 && hidratosporplato[0] < 20)
			{unidadesdeinsulina[0] = 2.5;}
			else {unidadesdeinsulina[0] = 3.5;}
			break;


			default: System.out.println("TEST");


		}
	}

}
