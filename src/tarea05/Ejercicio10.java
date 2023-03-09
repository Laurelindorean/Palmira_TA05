/**
 * 
 */
package tarea05;

import java.util.Scanner;

/**
 * @author Palmira
 *
 */
public class Ejercicio10 {

	/*
	 * 10. Realiza una aplicación que nos pida un número de ventas a introducir,
	 * después nos pedirá tantas ventas por teclado como número de ventas se hayan
	 * indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que
	 * se repite y lo que no.
	 */
	int numVentas;
	double totalVentas;
	Scanner sc = new Scanner(System.in);
	public void calcularVentas() {
		System.out.println("Introduce el número de ventas que quieras realizar: ");
		numVentas = sc.nextInt();
		for(int i = 0; i <numVentas; i++) {
			System.out.println("El valor de la venta es " + (i+1));
			sc.nextLine();
			totalVentas = totalVentas + sc.nextDouble();
		}
		System.out.println("El total de las ventas es " + totalVentas);
	}

}
