package bidimensionales;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		/**
		 * Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente
		 * forma: el elemento de la posición [n][m] debe contener el valor 10 * n + m.
		 * Después se debe mostrar su contenido.
		 * 
		 */
		// Creamos la tabla bidimensional
		int[][] tabla = new int[5][5];

		// Bucle anidado para rellenar la tabla
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				// Para que la posicion en la que se encuentra el indice sea 10 * i + j
				tabla[i][j] = 10 * i + j;
			}
			// Imprimimos 
			System.out.println(Arrays.toString(tabla[i])); 
		}
	}
}
