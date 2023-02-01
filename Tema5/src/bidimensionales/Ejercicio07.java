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
		// for para ir recorriendo el 
		for (int i = 0; i < tabla.length; i++) {
			for (int j = i; j < tabla[i].length; j++) {
				aux = tabla[i][j];
				tabla[i][j] = tabla[j][i];
				tabla[j][i] = aux;
			}
		}
		System.out.println(Arrays.deepToString(tabla));
	}

}
