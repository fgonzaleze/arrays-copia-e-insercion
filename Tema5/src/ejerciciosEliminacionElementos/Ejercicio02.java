package ejerciciosEliminacionElementos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/**
		 * Realiza un programa que pida 10 números por teclado y que los almacene en un
		 * array. Seguidamente, el programa eliminará los números no primos.
		 * 
		 */
		int tabla[] = new int[10]; // Creamos la tabla que será de un tamaño 10
		int contador = 0;
		Scanner sc = new Scanner(System.in); // Abrimos escáner
		for (int i = 0; i < tabla.length; i++) { // For para ir pidiendo los números que irán al array
			System.out.println("Introduce un número: ");
			tabla[i] = sc.nextInt(); // Vamos rellenando el array
		}
		while (contador < tabla.length) {
			if (tabla[contador] % 2 == 0) {
				contador++;
			} else {
				System.arraycopy(tabla, contador + 1, tabla, contador, tabla.length - contador -1);
				tabla = Arrays.copyOf(tabla, tabla.length - 1);
			}
		}
		System.out.println(Arrays.toString(tabla));
		sc.close();
	}

}
