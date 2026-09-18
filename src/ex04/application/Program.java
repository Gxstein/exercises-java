package ex04.application;

import ex04.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("Quarter 1 grade: ");
        student.q1 = sc.nextDouble();
        System.out.print("Quarter 2 grade: ");
        student.q2 = sc.nextDouble();
        System.out.print("Quarter 3 grade: ");
        student.q3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalQ());

        if (student.pass()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }

        sc.close();
    }
}