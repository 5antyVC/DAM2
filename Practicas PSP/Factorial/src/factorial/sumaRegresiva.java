package factorial;

import java.util.Scanner;

public class sumaRegresiva {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N;

	        do {
	            System.out.print("Introduzca su numero para hacer el sumarial:");
	            while (!sc.hasNextInt()) {
	                System.out.print("Error: Por favor ingrese un número entero y positivo:");
	                sc.next(); // Limpiar el buffer del scanner
	            }
	            N = sc.nextInt();
	        } while (N <= -1);

	        System.out.print("La suma regresiva de " + N + " es: " + sumar(N));
	        sc.close();
	    }

	    public static int sumar(int n) {	
	        int suma = 0;
	        for (int i = n; i >= 1; i--) {
	            suma += i;
	        }
	        return suma;
	    }
}
