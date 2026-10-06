package Extras.TryCatch;

import java.util.Scanner;

public class TryC {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");

    }

    public static void method1(){
        System.out.println("***METHOD1 START***");

        method2();

        System.out.println("***END METHOD2***");
    }

    public static void method2(){

        System.out.println("***METHOD2 START***");

        Scanner sc = new Scanner(System.in);
        try{
            String[] vect = sc.nextLine().split(" ");

            int position = sc.nextInt();

            System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        }

        sc.close();

        System.out.println("***END METHOD2***");
    }
}
