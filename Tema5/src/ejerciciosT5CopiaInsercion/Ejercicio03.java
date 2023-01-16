package ejerciciosT5CopiaInsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
	/**
	 * Realiza un programa que pida 10 números por teclado y que los almacene en un
	 * array. Seguidamente, el programa pasará los números primos a las primeras
	 * posiciones, desplazando el resto de números (los que no son primos) a las
	 * últimas posiciones, de tal forma que no se pierda ninguno. Al final se debe
	 * mostrar el array resultante.
	 */
	static boolean esPrimo(int num) {
		boolean esPrimo = true;
		for (int aux = 2; aux < num; aux++) {
			if (num % aux == 0) {
				esPrimo = false;
				break;
			}
		}
		if (num == 0 || num == 1) {
			esPrimo = false;
		}
		return esPrimo;
	}

	public static void main(String[] args) {
		int lista[] = new int[10]; // Hacemos el array de longitud 10
		int primo[] = new int[0];
		int noPrimo[] = new int[0];
		Scanner sc = new Scanner(System.in); // Abrimos escáner
		/*
		 * for (int i = 0; i < lista.length; i++) { // Hacemos un for donde establecemos
		 * que acabe cuando llegue al // final de la tabla numAleatorio con .length
		 * lista[i] = (int) (Math.random() * 101); // Calculamos i en la posición que se
		 * encuentra en el for System.out.println(lista[i]); // Y asi lo imprimimos los
		 * numeros aleatorios
		 */
		for (int i = 0; i < lista.length; i++) { // For para ir pidiendo los números que irán al array
			System.out.println("Introduce un número: ");
			lista[i] = sc.nextInt(); // Vamos rellenando el array
		}
		for (int i = 0; i < lista.length; i++) { // Creamos un for que recorra el array
			if (esPrimo(lista[i])) { // Pare detectar los numeros primos hacemos un if
				primo = Arrays.copyOf(primo, primo.length + 1); // vamos añadiendo los primos al nuevo array vacio y
																// cada vez que añadamos ampliamos el array
				primo[primo.length - 1] = lista[i]; // usamos el mismo metodo array de los numeros primos - 1 para
													// localizar el indice
			} else {
				noPrimo = Arrays.copyOf(noPrimo, noPrimo.length + 1); // Hacemos lo mismo de los primos con los no primos
				noPrimo[noPrimo.length - 1] = lista[i];
			}
		}
		System.arraycopy(primo, 0, lista, 0, primo.length);
		System.arraycopy(noPrimo, 0, lista, primo.length, noPrimo.length);
		System.out.println(Arrays.toString(lista));
		sc.close();
	}

}
