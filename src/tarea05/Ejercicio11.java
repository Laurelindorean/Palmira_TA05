/**
 * 
 */
package tarea05;

import java.util.Scanner;

/**
 * @author Palmira
 *
 */
public class Ejercicio11 {
	/*
	 * 11. Crea una aplicación que nos pida un día de la semana y que nos diga si es
	 * un día laboral o no. Usa un switch para ello.
	 */
	String dia;

	public void dias() {
		System.out.println("Introduce un día de la semana y te diré si es laboral o no");
		dia = pedirString();
		switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("Es laborable");
			break;
		case "martes":
			System.out.println("Es laborable");
			break;
		case "miercoles":
			System.out.println("Es laborable");
			break;
		case "jueves":
			System.out.println("Es laborable");
			break;
		case "viernes":
			System.out.println("Es laborable");
			break;
		case "sabado":
			System.out.println("Es laborable");
			break;
		case "domingo":
			System.out.println("Es festivo!!!");
			break;
		default:
			System.out.println("El valor introducido no es correcto");
			
		}

	}

	public String pedirString() {
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine();
		return palabra;
	}
}
