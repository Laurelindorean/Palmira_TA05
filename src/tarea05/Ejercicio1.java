/**
 * 
 */
package tarea05;

import java.util.Scanner;

/**
 * @author Palmira
 *
 */
public class Ejercicio1 {
	/*
	 * 1. Declara 2 variables númericas (con el valor que desees), he indica cual es
	 * mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores
	 * para comprobar que funciona.
	 */

	int num1, num2;
	/*
	 * He decidido usar Scanner para poder hacer pruebas sin necesidad de ir
	 * cambiando las variables a mano con cada prueba.
	 */
	Scanner sc = new Scanner(System.in);

	public void comparacion() {
		System.out.println("Escribe un número: ");
		num1 = sc.nextInt();
		System.out.println("Escribe otro número para comparar: ");
		sc.nextLine();
		num2 = sc.nextInt();
		if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		} else if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else {
			System.out.println("Los números " + num1 + " y " + num2 + " son iguales");
		}

	}

}
