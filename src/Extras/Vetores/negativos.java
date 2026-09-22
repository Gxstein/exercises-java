package Extras.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        int x = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.print("Quantos numeros vai digitar (Max: 10) ? ");

        x = sc.nextInt();

        if (x > 10 || x <= 0){
            System.out.println("Número invalido, programa encerrado.");
        } else {
            for(int i = 0; i < x; i++){
                System.out.print("Digite um numero: ");
                vetor[i] = sc.nextInt();
            }
            System.out.println("NUMEROS NEGATIVOS:");

            for (int i = 0; i < x; i++){
                if (vetor[i] < 0){
                    System.out.println(vetor[i]);
                }

            }
        }

        sc.close();
    }
}
