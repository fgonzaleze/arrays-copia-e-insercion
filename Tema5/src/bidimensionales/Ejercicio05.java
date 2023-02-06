package bidimensionales;

import java.util.Arrays;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999.
		 * Estos números se deben introducir en un array de 4 filas por 5 columnas. El
		 * programa mostrará las sumas parciales de filas y columnas igual que si de una
		 * hoja de cálculo se tratara. La suma total debe aparecer en la esquina
		 * inferior derecha.
		 */

		// Declaramos las variables
		int[][] tabla = new int[4][5]; // 4 filas y 5 columnas
		int sumaFilas = 0;
		int aux = 0;

		// Rellenamos la tabla con los numeros aleatorios con math.random
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				// Formula que explico Elena y David
				tabla[i][j] = (int) ((Math.random() * (999 - 100)) + 100);
			}

		}
		// Bucle for para rellenar 
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				aux += tabla[i][j];
			}
			// Vamos a necesitar al final la variable sumaFilas
			sumaFilas += aux;
			// Imprimimos la fila de la tabla
			System.out.print(Arrays.toString(tabla[i]));

			// Imprimimos el total de la suma de los elementos de la fila al final del bucle
			System.out.println(" = " + aux);
		}
		System.out.print("|");
		// Sumamos las columnas con un bucle for
		for (int z = 0; z < 5; z++) { 

			aux = 0; // Reiniciamos la variable aux a 0 cada vez que pase por aqui

			for (int y = 0; y < 4; y++) {
				aux += tabla[y][z]; // Le vamos sumando los numeros que vamos leyendo a la variable auxiliar
			}

			System.out.print(aux + "|"); // La imprimimos por pantalla y separamos los numeros con un espacio
		}
		// Imprimimos lo que seria la suma total
		System.out.print(" = ");
		System.out.print(sumaFilas);

	}
}
