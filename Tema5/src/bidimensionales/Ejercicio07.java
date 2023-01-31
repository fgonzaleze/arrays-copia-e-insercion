package bidimensionales;

import java.util.Arrays;

public class Ejercicio07 {

	public static void main(String[] args) {
		int tabla[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int aux;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = i; j < tabla[i].length; j++) {
				aux = tabla[i][j];
				tabla[i][j] = tabla[j][i];
				tabla[j][i] = aux;
			}
		}
		System.out.println(Arrays.deepToString(tabla));
	}

}
