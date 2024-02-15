package torre;

import java.util.Scanner;
import java.util.Stack;

public class hanoiPila {
	public static void main(String[] args) {
		Stack<Integer> origen = new Stack<>();
		Stack<Integer> destino = new Stack<>();
		Stack<Integer> auxiliar = new Stack<>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el numero de discos: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = n; i > 0; i--) {
			origen.push(i);
		}

		System.out.println("Contenido de la pila origen: " + origen);

		moverDisco(n, origen, destino, auxiliar);

	}

	public static void moverDisco(int n, Stack<Integer> origen, Stack<Integer> destino, Stack<Integer> aux) {
		if (n == 0) {
			return;
		}

		moverDisco(n - 1, origen, aux, destino);
		int disco = origen.pop();// Saca el disco de la ultima posicion
		destino.push(disco);// Pone el disco en la primera
		System.out.println("Mover disco " + n + " de la fila " + origen + " a fila " + destino);
		moverDisco(n - 1, aux, destino, origen);

	}
}
