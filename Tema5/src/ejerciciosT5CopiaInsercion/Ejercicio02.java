package ejerciciosT5CopiaInsercion;

import java.util.Arrays;

public class Ejercicio02 {
	/**
	 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
	 * que los almacene en un array. El programa debe ser capaz de pasar todos los
	 * números pares a las primeras posiciones del array (del 0 en adelante) y todos
	 * los números impares a las celdas restantes. Utiliza arrays auxiliares si es
	 * necesario.
	 */
	public static void main(String[] args) {
		int numAleatorio[] = new int[20]; // Hacemos el array de longitud 20
		int pares[] = new int[0];
		int impares[] = new int[0];
		for (int i = 0; i < numAleatorio.length; i++) { // Hacemos un for donde establecemos que acabe cuando llegue al
														// final de la tabla numAleatorio con .length
			numAleatorio[i] = (int) (Math.random() * 100 + 1); // Calculamos i en la posición que se encuentra en el for
			System.out.println(numAleatorio[i]); // Y asi lo imprimimos los numeros aleatorios para saber los que llevamos
		}
		for (int i = 0; i < numAleatorio.length; i++) { // Creamos un for que recorra el array
			if (numAleatorio[i] % 2 == 0) { // Pare detectar los numeros par hacemos un if
				pares = Arrays.copyOf(pares, pares.length + 1); // vamos añadiendo los pares al nuevo array vacio y cada
																// vez que añadamos ampliamos el array
				pares[pares.length - 1] = numAleatorio[i]; // usamos el array de los numeros pares - 1 para localizar el
															// indice
			} else {
				impares = Arrays.copyOf(impares, impares.length + 1);
				impares[impares.length - 1] = numAleatorio[i];
			}
		}
		System.arraycopy(pares, 0, numAleatorio, 0, pares.length); // Copiamos los pares a las primeras posiciones
		System.arraycopy(impares, 0, numAleatorio, pares.length, impares.length); // los impares irán donde acaben los pares
		System.out.println(Arrays.toString(numAleatorio)); // Imprimimos la tabla
	}
}
