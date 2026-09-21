package ExtraVetores;

import java.util.Locale;
import java.util.Scanner;

public class SumVetor {
    public static void main() {
        int x = 0;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero voce vai digitar? ");

        x = sc.nextInt();

        double[] vet = new double[x];

        for(int i = 0; i < x; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < x; i++){
            sum += vet[i];
        }

        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < x; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        double avg = sum / x;

        System.out.println();
        System.out.print("SOMA = " + sum);
        System.out.println();
        System.out.print("MEDIA = " + avg);
    }
}
