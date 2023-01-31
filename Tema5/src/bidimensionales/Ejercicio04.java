package bidimensionales;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		 /*
	     * Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores según la
	     * siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se
	     * muestra en la figura.
	     * [0, 30, 2, , , 5]
	     * [75, , , , 0, ]
	     * [ , , -2, 9, , 11]
	     */
		 //Declaramos las variables
        int[][] num = new int[3][6];
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        //TODO: cambiar los 0 que no han sido introducidos manualmente por un un espacio en blanco

        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }
    }
	}


