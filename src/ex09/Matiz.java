package ex09;

import java.util.Scanner;

public class Matiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        // Array bimensional
        int[][] mat = new int[x][x];


        // Double for, para percorrer a matriz por completo
        for(int i=0; i< mat.length; i++){
            for (int j=0; j< mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        // looping para contagem de números negativos

        int negatives = 0;

        for(int i=0; i< mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                if(mat[i][j] < 0){
                    negatives++;
                }
            }
        }

        System.out.printf("Main diagonal: %d %d %d %n", (mat[0][0]), (mat[1][1]), (mat[2][2]));
        System.out.printf("Negative numbers = %d", negatives);
        sc.close();

    }
}
