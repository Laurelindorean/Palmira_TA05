package tarea05;

/**
 * 
 * @author Palmira
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Que ejercicio quieres corregir ?");
		int opcion = Ejercicio5.pedirNumero();
		switch (opcion) {
		case 1:
			Ejercicio1 ej1 = new Ejercicio1();
			ej1.comparacion();
			break;
		case 2:
			Ejercicio2 ej2 = new Ejercicio2();
			ej2.saludo();
			break;
		case 3:
			Ejercicio3 ej3 = new Ejercicio3();
			ej3.saludo2();
			break;
		case 4:
			Ejercicio4 ej4 = new Ejercicio4();
			ej4.calculaArea();
			break;
		case 5:
			Ejercicio5 ej5 = new Ejercicio5();
			ej5.divisible();
			break;
		case 6:
			Ejercicio6 ej6 = new Ejercicio6();
			ej6.precios();
			break;
		case 7:
			Ejercicio7 ej7 = new Ejercicio7();
			ej7.bucleWhile();
			break;
		case 8:
			Ejercicio8 ej8 = new Ejercicio8();
			ej8.bucleFor();
			break;
		case 9:
			Ejercicio9 ej9 = new Ejercicio9();
			ej9.bucles();
			break;
		case 10:
			Ejercicio10 ej10 = new Ejercicio10();
			ej10.calcularVentas();
			break;
		case 11:
			Ejercicio11 ej11 = new Ejercicio11();
			ej11.dias();
			break;
		case 12:
			Ejercicio12 ej12 = new Ejercicio12();
			ej12.contrasenya();
			break;
		case 13:
			Ejercicio13 ej13 = new Ejercicio13();
			ej13.calculadoraInversa();
			break;
		default:
			System.out.println("Error. Debes introducir un numero del 1 al 13.");
		}

	}

}
