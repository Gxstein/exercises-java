package Extras.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {

        int x = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");

        x = sc.nextInt();

        String[] name = new String[x];
        int[] age = new int[x];
        double[] height = new double[x];

        for (int i = 0; i < x; i++){
            System.out.printf("Dados da %da pessoa: ", i+1);
            System.out.println();
            System.out.print("Nome: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < x; i++){
            sum += height[i];
        }

        double avg = sum / x;

        int sixTeen = 0;
        String nameSixTeen = "";

        for (int i = 0; i < x; i++) {
            if (age[i] < 16) {
                sixTeen++;
                nameSixTeen += name[i] + "\n";
            }
        }


        double percentAge = (sixTeen * 100.0) / x;


        //int sixTeen = totalAges * (porcentagem / 100);
        System.out.println();
        System.out.printf("Altura média: %.2f", avg);
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentAge);
        System.out.println(nameSixTeen);



    }
}