package torre;


public class torreHanoi {

	public static void main(String[] args) {
		int numeroDiscos=100;
		moverDisco(numeroDiscos, 'A','C','B');
			//filas
	}
	
	public static void moverDisco(int n, char origen, char destino, char aux ) {
		if(n==0) {
			return;
		}
		moverDisco(n-1, origen, aux, destino);	
		System.out.println("Mover disco "+n+" de la fila "+origen +" a fila "+destino);
		moverDisco(n-1, aux, destino, origen);	

	}
	
	
}
