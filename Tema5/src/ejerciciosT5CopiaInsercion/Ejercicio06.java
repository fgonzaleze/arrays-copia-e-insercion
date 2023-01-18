package ejerciciosT5CopiaInsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {
	/*
	 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego
	 * introducirá en el primer array todos los valores del 1 al 100. Por último,
	 * deberá copiar todos los valores del primer array al segundo array en orden
	 * inverso, y mostrar ambos por pantalla.
	 * 
	 */

	public static void main(String[] args) {
		int tablaOrdenada[] = new int[100]; // Array para los numeros pares
		int tablaInversa[] = new int[100];
		int contador = 0;
		Scanner sc = new Scanner(System.in); // Abrimos escáner
		for (int i = 0; i < tablaOrdenada.length; i++) { // For para ir pidiendo los números que irán al array
			tablaOrdenada[i] = i + 1; // Vamos rellenando el array
		}
		for (int i = tablaOrdenada.length - 1; i >= 0; i--) { // Declaramos el bucle en 0 ya que es descendente
			
			tablaInversa[contador] = tablaOrdenada[i];
			contador++; // Contador lo colocamos abajo., ya que la primera posicion es el 100
		}
		System.out.println("Tabla Ordenada:");
		System.out.println(Arrays.toString(tablaOrdenada));
		System.out.println("Tabla Desordenada:");
		System.out.println(Arrays.toString(tablaInversa));
	}
}
