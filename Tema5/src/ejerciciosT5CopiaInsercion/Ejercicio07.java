package ejerciciosT5CopiaInsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		/**
		 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
		 * menú con distintas opciones: Mostrar valores. Introducir valor. Salir. La
		 * opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un
		 * valor V y una posición P, luego escribirá V en la posición P del array. El
		 * menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que
		 * terminará el programa.
		 */
		int tabla[] = new int[10]; // Creamos la tabla que será de un tamaño 10
		String opcion = "x"; // String que será la opción declarada y ponemos un valor para incializarla
		int valor = 0; // Creamos una variable para el valor introducido y lo declaramos a 0
		int posicion = 0; // Creamos la int posicion y lo declaramos a 0

		Scanner sc = new Scanner(System.in); // Abrimos escáner
		for (int i = 0; i < tabla.length; i++) { // For para ir pidiendo los números que irán al array
			tabla[i] = (int) (Math.random() * 100 + 1); // Calculamos i en la posición que se encuentra en el for
		}
		while (!opcion.equals("c")) { // While en caso de que ponga C que es cuando se cerrará el programa
			System.out.println("Introduzca una opción: ");
			System.out.println("a: Mostrar Valores");
			System.out.println("b: Introducir Valores");
			System.out.println("c: Salir");
			opcion = sc.next(); // La opción será el valor que pongamos por consola
			switch (opcion) { // Usamos un switch para la elección la menu
			case "a": // para cuando escriban a
				System.out.println(Arrays.toString(tabla)); // Y asi lo imprimimos los numeros aleatorios
				break;
			case "b": // para cuando escriban b
				System.out.println("Introduce un valor: ");
				valor = sc.nextInt();
				System.out.println("Introduce una posición: ");
				posicion = sc.nextInt();
				tabla = Arrays.copyOf(tabla, tabla.length + 1);
				System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
				tabla[posicion] = valor;
				System.out.println(Arrays.toString(tabla));
				break;
			case "c": // Para cuando escriban c
				System.out.println("El programa ha finalizado");
				break;
			default: // Default en caso de que se introduzca una opción incorrecta
				System.out.println("Ha introducido una opción incorrecta");
			}
		}
		sc.close(); // Cerramos escaner

	}

}
