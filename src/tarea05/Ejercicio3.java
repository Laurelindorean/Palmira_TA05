/**
 * 
 */
package tarea05;

import javax.swing.JOptionPane;

/**
 * @author Palmira
 *
 */
public class Ejercicio3 {
	/*
	 * 3. Modifica la aplicación anterior, para que nos pida el nombre que queremos
	 * introducir (recuerda usar JOptionPane).
	 */
	String nombre;

	public void saludo2() {
		nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Bienvenido/a " + nombre);
	}

}
