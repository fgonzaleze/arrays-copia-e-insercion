package ejerciciosT5CopiaInsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
		/**
		 * Escribe un programa que lea 15 números por teclado y que los almacene en un
		 * array. Rota los elementos de ese array, es decir, el elemento de la posición
		 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
		 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
		 * muestra el contenido del array.
		 * 
		 */
	public static void main(String[] args) {
		int indice[] = new int[15]; // Creamos el índice con la longitud 15
		int posicionFinal; // Varaible para guardar la ultima posicion, que pasará a ser la primera
		Scanner sc = new Scanner(System.in); // Abrimos escáner
		for (int i = 0; i < indice.length; i++) { // For para ir pidiendo los números que irán al array
		System.out.println("Introduce un número: ");
			indice[i] = sc.nextInt(); // Vamos rellenando el array
		}
		posicionFinal = indice[indice.length - 1]; // Guardamos la posición final en el final del array menos 1
		System.arraycopy(indice, 0, indice, 1, indice.length - 1); // Copiamos el array 
		indice[0] = posicionFinal; // Cambiamos la posición guardada en el nuevo array
		System.out.println(Arrays.toString(indice)); // Devolvemos e imprimimos el array en string 
		sc.close(); // Cerramos el escáner
	}

}
