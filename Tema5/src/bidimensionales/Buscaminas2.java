package bidimensionales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas2 {
    static int[] tablero;
    static boolean[] descubiertos;
    static int minas = 6;

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        inicializar();

        while (true) {
            System.out.println("Introduce la posición a descubrir (0-20):");
            int posicion = lectura.nextInt();
            descubrir(posicion);
            if (gameOver()) {
                System.out.println("Fin del juego");
                break;
            }
            mostrarTablero();
        }
    }

    public static void inicializar() {
        tablero = new int[20];
        descubiertos = new boolean[20];

        Random random = new Random();
        int minasColocadas = 0;
        while (minasColocadas < minas) {
            int posicion = random.nextInt(20);
            if (tablero[posicion] != -1) {
                tablero[posicion] = -1;
                minasColocadas++;
                actualizarPistas(posicion);
            }
        }
    }

    public static void actualizarPistas(int posicion) {
        int fila = posicion / 4;
        int columna = posicion % 4;

        for (int i = Math.max(0, fila - 1); i <= Math.min(fila + 1, 4); i++) {
            for (int j = Math.max(0, columna - 1); j <= Math.min(columna + 1, 4); j++) {
                if (tablero[i * 4 + j] != -1) {
                    tablero[i * 4 + j]++;
                }
            }
        }
    }

    public static void descubrir(int posicion) {
        if (tablero[posicion] == -1) {
            System.out.println("Has perdido");
            System.exit(0);
        }
        descubiertos[posicion] = true;
    }

    public static boolean gameOver() {
        for (int i = 0; i < 20; i++) {
            if (tablero[i] != -1 && !descubiertos[i]) {
                return false;
            }
        }
        return true;
    }

    public static void mostrarTablero() {
        for (int i = 0; i < 20; i++) {
            if (descubiertos[i]) {
                System.out.print(tablero[i] + " ");
            } else {
                System.out.print("X ");
            }
            if (i % 4 == 3) {
                System.out.println();
            }
        }
        System.out.println();
    }
}