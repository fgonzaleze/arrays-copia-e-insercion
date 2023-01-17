package ejerciciosT5CopiaInsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
	/*
	 * Escribir un programa que lea 10 valores enteros por teclado y los almacene en
	 * una tabla (tablaEnteros). A continuación, debes crear dos tablas: numPares y
	 * numImpares. En numPares almacenarás los números pares que se encuentren en
	 * tablaEnteros y en numImpares almacenarás los números impares.
	 * 
	 */
	static boolean esPar(int num) {
		boolean esPar = false;
		if (num % 2 == 0) {
			esPar = true;
		}
		return esPar;
	}

	public static void main(String[] args) {
		int tablaEnteros[] = new int[10]; // Hacemos el array de los num que pedimos
		int numPares[] = new int[0]; // Array para los numeros pares
		int numImpares[] = new int[0]; // Array para los numeros pares

		Scanner sc = new Scanner(System.in); // Abrimos escáner
		for (int i = 0; i < tablaEnteros.length; i++) { // For para ir pidiendo los números que irán al array
			System.out.println("Introduce un número: ");
			tablaEnteros[i] = sc.nextInt(); // Vamos rellenando el array
		}
		for (int i = 0; i < tablaEnteros.length; i++) { // Creamos un for que recorra el array
			if (esPar(tablaEnteros[i])) { // Pare detectar los numeros primos hacemos un if
				numPares = Arrays.copyOf(numPares, numPares.length + 1); // vamos añadiendo los primos al nuevo array
																			// vacio y
				// cada vez que añadamos ampliamos el array
				numPares[numPares.length - 1] = tablaEnteros[i]; // usamos el mismo metodo array de los numeros primos - 1
																// para
				// localizar el indice
			} else {
				numImpares = Arrays.copyOf(numImpares, numImpares.length + 1); // Hacemos lo mismo de los primos con los
																				// no primos
				numImpares[numImpares.length - 1] = tablaEnteros[i];
			}
		}
			System.out.println("Tabla valores pares: "); // Para imprimir la tabla 
			System.out.println(Arrays.toString(numPares));
			System.out.println("Tabla valores impares: "); // Para imprimir la tabla 
			System.out.println(Arrays.toString(numImpares));
			sc.close();
		
	}
}
