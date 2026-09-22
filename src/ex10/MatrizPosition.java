package ex10;

import java.util.Scanner;

public class MatrizPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] matriz = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int found = sc.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (matriz[i][j] == found) {
                    System.out.printf("Position %d,%d:%n", i, j);

                    if (j > 0) {
                        System.out.printf("Left: %d%n", matriz[i][j - 1]);
                    }
                    if (j < y - 1) {
                        System.out.printf("Right: %d%n", matriz[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.printf("Up: %d%n", matriz[i - 1][j]);
                    }
                    if (i < x - 1) {
                        System.out.printf("Down: %d%n", matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}