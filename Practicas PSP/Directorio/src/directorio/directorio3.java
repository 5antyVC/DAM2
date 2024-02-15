package directorio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class directorio3 {
	public static void main(String[] args) {
		try {
			// Obtener el directorio de ejecución por defecto
			String directorioActual = System.getProperty("user.dir");
			System.out.println("Directorio por defecto: " + directorioActual);
			System.out.println("Introduzca su texto: ");


			// Crear un objeto ProcessBuilder para ejecutar el comando "dir" en diferentes
			// directorios
			Scanner sc = new Scanner(System.in);
			String scan=sc.next();
			sc.close();

			
            FileWriter writer = new FileWriter("C:\\Users\\Hp\\Documents\\fichero2.txt");
            writer.write(scan.toUpperCase());
            writer.close();

            /*FileOutputStream outputStream = new FileOutputStream("C://Users//Hp//Documents//fichero2.txt");
            outputStream.write(scan.getBytes());
            outputStream.close();
            ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", "C://Users//Hp//Documents//fichero2.txt");
            processBuilder.start();

			
			// Ejecutar el comando en el directorio por defecto
			String fichero1 = "C://Users//Hp//fichero1.txt";
			processBuilder.redirectOutput(new File(fichero1));//Envia el fichero
			processBuilder.directory(new File(directorioActual));//Por consola
			System.out.println("Resultado en el directorio por defecto ");
			ejecutarComando(processBuilder);

			// Ejecutar el comando en un directorio distinto
			String fichero2 = "C://Users//Hp//Documents//fichero2.txt";
			processBuilder.redirectOutput(new File(fichero2));
			String otroDirectorio = "C://";
			processBuilder.directory(new File(otroDirectorio));
			System.out.println("Resultado en C://Users//Hp//Documents// ");
			ejecutarComando(processBuilder);

			// Ejecutar el comando en un directorio distinto 2

			String fichero3 = "C://Users//Hp//Downloads//fichero3.txt";
			processBuilder.redirectOutput(new File(fichero3));
			String otroDirectorio2 = "C://Users/Hp//Desktop";
			processBuilder.directory(new File(otroDirectorio2));

			System.out.println("Resultado en C://Users//Hp//Downloads// ");
			ejecutarComando(processBuilder);
			*/
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void ejecutarComando(ProcessBuilder processBuilder) throws IOException {
		Process process = processBuilder.start();
		try (java.util.Scanner scanner = new java.util.Scanner(process.getInputStream())) {
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}
	}
}
