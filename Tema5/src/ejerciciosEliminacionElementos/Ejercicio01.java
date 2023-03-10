package ejerciciosEliminacionElementos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/**
		 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
		 * que los almacene en un array. El programa debe eliminar todos los números
		 * impares. No se debe cambiar el orden en el que están insertados los
		 * elementos.
		 * 
		 */
		int tabla[] = new int[20]; // Creamos la tabla que será de un tamaño 20
		int contador = 0;

		Scanner sc = new Scanner(System.in); // Abrimos escáner
		for (int i = 0; i < tabla.length; i++) { // For para ir pidiendo los números que irán al array
			tabla[i] = (int) (Math.random() * 100 + 1); // Calculamos i en la posición que se encuentra en el for
		} 
		while (contador < tabla.length) { 
			if (tabla[contador] % 2 == 0) { // Identificar los pares
				contador++; // Para salir del bucle
			} else {
				// En caso de que sea impar, lo copiamos de nuevo a la tabla
				System.arraycopy(tabla, contador + 1, tabla, contador, tabla.length - contador -1);
				tabla = Arrays.copyOf(tabla, tabla.length - 1);
			}
		}
		/** Forma de hacerlo con bucles for 
		 * 
		 * for (int i = tabla.length-1; i >= 0; i--){
		 * if (tabla[i] % 2 != 0) {
		 * System.arraycopy(tabla, i + 1, tabla, i, tabla.length - i -1);
		 * tabla = Arrays.copyOf(tabla, tabla.length - 1);
		 * }
		 * }
		 */
		System.out.println(Arrays.toString(tabla));
	}
}
