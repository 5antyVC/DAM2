/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;


public class Calculator {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        do {
            System.out.print("Introduzca su numero para hacer el factorial:");
            while (!sc.hasNextInt()) {
                System.out.print("Error: Por favor ingrese un número entero y positivo:");
                sc.next(); // Limpiar el buffer del scanner
            }
            N = sc.nextInt();
        } while (N <= -1);

        System.out.print("El factorial de " + N + " es: " + factorial(N));
        sc.close();
    }

    public static int factorial(int n) {
        int facto = 1;
        for (int i = n; i >= 1; i--) {
            facto *= i;
        }
        return facto;
    }
    
}
