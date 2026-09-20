package ex07;


import java.util.Locale;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int x = 0;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o tamanho do vetor de alturas? ");
        x = sc.nextInt();

        double[] vect = new double[x];
        // Create a vector, with x positions
        for(int i = 0; i < x; i++){
            System.out.println("Digite sua altura: ");
            // [i] represent the first enter and the next entries
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for(int i = 0; i < x; i++)  {
            sum += vect[i];
        }

        double avg = sum / x;


        System.out.printf("AVERAGE HEIGHT = %.2f", avg);

        sc.close();

    }
}
