/**
 * 
 */
package tarea05;

/**
 * @author Palmira
 *
 */
public class Ejercicio9 {

	/*
	 * 9. Muestra los números del 1 al 100(ambos incluidos) divisibles entre 2 y 3.
	 * Utiliza el bucle que desees.
	 */
	Ejercicio5 divisible = new Ejercicio5();
	public void bucles() {
		System.out.println("Los números del 0 al 100 divisibles entre 2");
		for(int i = 0; i<=100; i++) {
			if(divisible.esDivisible(i, 2)) {
				System.out.println(i);	
			}
		}
		System.out.println("Los números del 0 al 100 divisibles entre 3");
		for(int i = 0; i<=100; i++) {
			if(divisible.esDivisible(i, 3)) {
				System.out.println(i);	
			}
		}
	}
	
}
