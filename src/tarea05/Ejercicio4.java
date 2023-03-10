/**
 * 
 */
package tarea05;

import javax.swing.JOptionPane;

/**
 * @author Palmira
 *
 */
public class Ejercicio4 {
	/*
	 * 4. Haz una aplicación que calcule el área de un circulo (pi*R2). El radio se
	 * pedirá por teclado (recuerda pasar de String a double con el
	 * Double.parseDouble). Usa la constante PI y el método pow de Math.
	 */

	public void calculaArea() {

		String numero = JOptionPane.showInputDialog("Introduce el radio para calcular el área de nuestro circulo");
		double area = Math.PI * Math.pow(Double.parseDouble(numero), 2);
		JOptionPane.showMessageDialog(null, "El area del circulo és" + area);
	}

}
