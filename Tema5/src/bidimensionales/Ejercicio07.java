package bidimensionales;

import java.util.Arrays;

public class Ejercicio07 {

	/*
	 * Transponer la matriz A de orden NxN y guardar el resultado en la matriz B.
	 * Repetir el ejercicio dejando el resultado en la matriz A (no se puede usar
	 * una matriz auxiliar).
	 * 
	 */

	public static void main(String[] args) {
		// Declaramos la tabla con los datos de la matriz como se nos ha indicado
		int tabla[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int aux; // Creamos un auxiliar para introducir los valores de la tabla

		System.out.println(Arrays.deepToString(tabla)); // Imprimimos la tabla original
		for (int i = 0; i < tabla.length; i++) { // Tabla for para ir recorriendo
			for (int j = i; j < tabla[i].length; j++) { // tabla para cambiar los valores de la matriz A a la B
				aux = tabla[i][j];
				tabla[i][j] = tabla[j][i];
				tabla[j][i] = aux;
			}
		}
		// Imprimimos la nueva tabla
		System.out.println(Arrays.deepToString(tabla));
	}

}
