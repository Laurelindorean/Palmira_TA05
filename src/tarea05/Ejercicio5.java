/**
 * 
 */
package tarea05;

import java.util.Scanner;

/**
 * @author Palmira
 *
 */
public class Ejercicio5 {

	/*
	 * 5. Lee un número por teclado e indica si es divisible entre 2(resto = 0). Si
	 * no lo es, también debemos indicarlo.
	 */
	public void divisible() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número por teclado y te diré si es divisible entre 2: ");
		int num = sc.nextInt();
		if (esDivisible(num, 2)) {
			System.out.println("El número " + num + " es divisible entre 2");
		} else {
			System.out.println("El número " + num + " no es divisible entre 2");
		}
	}

	public boolean esDivisible(double num1, double num2) {

		return (num1 % num2) == 0;
	}

}
