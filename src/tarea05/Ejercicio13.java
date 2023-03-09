/**
 * 
 */
package tarea05;

import javax.swing.JOptionPane;

/**
 * @author Palmira
 *
 */
public class Ejercicio13 {

	/*
	 * Crea una aplicación llamada CalculadoraInversa, nos pedirá 2 operandos (int)
	 * y un signo aritmético (String), según este último se realizara la operación
	 * correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
	 */

	public void calculadoraInversa() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número entero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número entero"));
		String operador = JOptionPane.showInputDialog("Introduce el signo aritmético que desees");
		int resultado;

		switch (operador) {
		case "+":
			resultado = num1 + num2;
			JOptionPane.showMessageDialog(null, ("Has escogido la suma y el resultado es :" + resultado));
			break;
		case "-":
			resultado = num1 - num2;
			JOptionPane.showMessageDialog(null, ("Has escogido la resta y el resultado es :" + resultado));
			break;
		case "*":
			resultado = num1 * num2;
			JOptionPane.showMessageDialog(null, ("Has escogido la multiplicación y el resultado es :" + resultado));
			break;
		case "/":
			double resultadoDecimal = num1 / num2;
			JOptionPane.showMessageDialog(null, ("Has escogido la división y el resultado es :" + resultadoDecimal));
			break;
		case "^":
			resultado = num1 ^ num2;
			JOptionPane.showMessageDialog(null, ("Has escogido la potencia y el resultado es :" + resultado));
			break;
		case "%":
			resultado = num1 % num2;
			JOptionPane.showMessageDialog(null, ("Has escogido el modulo y el resultado es :" + resultado));
			break;
		default:
			System.out.println("Error. No has introducido un carácter correcto");
		}
	}
}
