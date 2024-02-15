package directorio;
import java.io.File;
import java.io.IOException;

public class directorio {
	 public static void main(String[] args) {
	        try {
	            // Obtener el directorio de ejecución por defecto
	            String directorioActual = System.getProperty("user.dir");
	            System.out.println("Directorio por defecto: " + directorioActual);

	            // Crear un objeto ProcessBuilder para ejecutar el comando "dir" en diferentes directorios
	            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "dir");

	            // Ejecutar el comando en el directorio por defecto
	            processBuilder.directory(new File(directorioActual));
	            System.out.println("Resultado en el directorio por defecto:");
	            ejecutarComando(processBuilder);

	            // Ejecutar el comando en un directorio distinto
	            String otroDirectorio = "C://";
	            processBuilder.directory(new File(otroDirectorio));
	            System.out.println("Resultado en otro directorio:");
	            ejecutarComando(processBuilder);

	            // Ejecutar el comando en un directorio distinto
	            String otroDirectorio2 = "C://Windows";
	            processBuilder.directory(new File(otroDirectorio2));
	            System.out.println("Resultado en otro directorio:");
	            ejecutarComando(processBuilder);

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
