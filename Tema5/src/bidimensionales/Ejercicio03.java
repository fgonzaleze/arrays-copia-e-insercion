package bidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/**
		 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
		 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
		 * notas por teclado y luego el programa mostrará la tabla con las notas. A
		 * continuación, mostrará la nota mínima, máxima y media de cada alumno.
		 * 
		 */
				// Necesitamos una tabla de 4x5
				int[][] notas = new int[4][5];

				// Variable nota para guardar la nota individual
				int nota;
				
				Scanner sc = new Scanner(System.in); // Abrimos escáner
				
				// Variables para la nota máxima, mínima y media
				int max, min, suma;
				double media;

				// Creación del Scanner
				Scanner sc = new Scanner(System.in);

				for (int i = 0; i < notas.length; i++) {
					// Le pido al alumno las notas
					System.out.println("Introduzca las 5 notas del Alumno " + (i + 1));
					for (int j = 0; j < notas[i].length; j++) {
						nota = sc.nextInt();
						// Compruebo que la nota introducida es correcta
						while (nota < 1 || nota > 10) {
							// Sigo preguntando notas hasta que introduzca una válida
							System.out.println("La nota no es válida. Introduzca de nuevo la nota");
							nota = sc.nextInt();
						}
						// Almacenamos la nota en la tabla
						notas[i][j] = nota;
					}
				}
				System.out.println(Arrays.deepToString(notas));
				
				for(int i=0; i<notas.length; i++) {
					// Reinicializamos variables para cada alumno
					min=10;
					max=0;
					suma=0;
					for(int j=0; j<notas[i].length; j++) {
						// Comprobamos si la nota es mayor que la máxima
						if(notas[i][j]>max) {
							max = notas[i][j];
						}
						// Comprobamos si la nota es menor que la mínima
						if(notas[i][j]<min) {
							min = notas[i][j];
						}
						// Sumamos la nota para el cálculo de la media
						suma += notas[i][j];
					}
					// Cálculo de la media
					media = (double)suma/notas[i].length; 
					System.out.println("Nota máxima del alumno " + (i+1) + ": " + max);
					System.out.println("Nota mínima del alumno " + (i+1) + ": " + min);
					System.out.println("Nota media del alumno " + (i+1) + ": " + media);
					System.out.println();
				}
	}

}
