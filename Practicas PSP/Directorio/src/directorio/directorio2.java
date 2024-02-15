package directorio;
import java.io.File;
import java.io.IOException;

public class directorio2 {
	 public static void main(String[] args) {
	        try {
	            // Obtener el directorio de ejecución por defecto
	            String directorioActual = System.getProperty("user.dir");
	            System.out.println("Directorio por defecto: " + directorioActual);

	            // Crear un objeto ProcessBuilder para ejecutar el comando "dir" en diferentes directorios
	            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "ipconfig");

	            // Ejecutar el comando en el directorio por defecto
	            processBuilder.directory(new File(directorioActual));
	            System.out.println("Resultado en el directorio por defecto:");
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
