/**
 * 
 */
package tarea05;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Palmira
 *
 */
public class Ejercicio6 {
	/*
	 * 6. Lee un número por teclado que pida el precio de un producto(puede tener
	 * decimales) y calcule el precio final con IVA. El IVA sera una constante que
	 * sera del 21%.
	 */

	public static final double IVA = 0.21;
	double precioSinIVA;

	public void precios() {
		precioSinIVA = Double.parseDouble(JOptionPane.showInputDialog("Introduce un precio y lo calculo con iva: "));
		double precioConIVA = precioSinIVA + (precioSinIVA * IVA);
		System.out.println("El precio total con iva es: " + precioConIVA);
	}

}
