package ejerciciosT5CopiaInsercion;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		/**
		 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
		 * menú con distintas opciones: 
		 * Mostrar valores. 
		 * Introducir valor. 
		 * Salir. 
		 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un
		 * valor V y una posición P, luego escribirá V en la posición P del array. El
		 * menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que
		 * terminará el programa.
		 */
		int tablaEnteros[] = new int [10];
		Scanner sc = new Scanner(System.in); // Abrimos escáner
		for (int i = 0; i < tablaEnteros.length; i++) { // For para ir pidiendo los números que irán al array
			System.out.println("Introduce un número: ");
			tablaEnteros[i] = sc.nextInt(); // Vamos rellenando el array
		}
	}

}
