/**
 * 
 */
package tarea05;

/**
 * @author Palmira
 *
 */
public class Ejercicio12 {

	/*
	 * 12. Escribe una aplicación con un String que contenga una contraseña
	 * cualquiera. Después se te pedirá que introduzcas la contraseña, con 3
	 * intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un
	 * mensaje diciendo "Enhorabuena". Piensa bien en la condición de salida (3
	 * intentos y si acierta sale, aunque le queden intentos).
	 */

	String pswCorrecta, psw;
	int intentos = 0;
	Ejercicio11 ej11 = new Ejercicio11();

	public void contrasenya() {
		pswCorrecta = "zanahoria";

		while (intentos < 3) {
			System.out.println("Escribe la contraseña: ");
			psw = ej11.pedirString();
			if (psw.equals(pswCorrecta)) {
				intentos = 3;
				System.out.println("Enhorabuena!");
			} else {
				intentos++;
				System.out.println("La contraseña es incorrecta, te quedan " + (3 - intentos) + " intentos");
				if (intentos == 3) {
					System.out.println("Lo siento. Ya no puedes volver a intentarlo");
				}
			}

		}

	}
}
