package ejerciciosT5CopiaInsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
	/**
	 * 
	 * Escribir un programa que lea 10 valores enteros por teclado y los almacene en
	 * una tabla (tablaEnteros). A continuación, debes construir una tabla que
	 * contenga los mismos elementos que tablaEnteros pero sin repetir. Usa el
	 * algoritmo de búsqueda explicado en los apuntes.
	 * 
	 */
	public static void main(String[] args) {
		int tablaEnteros[] = new int[10]; // Hacemos el array de longitud 10
		int tablaEnterosSinRepetir[] = new int[10];
		int contador = 0;
		Scanner sc = new Scanner(System.in); // Abrimos escáner
		for (int i = 0; i < tablaEnteros.length; i++) { // For para ir pidiendo los números que irán al array
			System.out.println("Introduce un número: ");
			tablaEnteros[i] = sc.nextInt(); // Vamos rellenando el array
		}
		Arrays.sort(tablaEnteros); // Ordenamos la tabla 
		for (int i = 0; i < tablaEnteros.length; i++) {
            if (i == 0 || tablaEnteros[i] != tablaEnteros[i - 1]) {
                tablaEnterosSinRepetir[contador++] = tablaEnteros[i];
            }
        } 
		System.out.println("Tabla sin valores repetidos: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(tablaEnterosSinRepetir[i] + " ");
        }
	       
	    }
	}


