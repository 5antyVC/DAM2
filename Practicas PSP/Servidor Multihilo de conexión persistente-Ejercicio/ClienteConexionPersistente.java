import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteConexionPersistente {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("10.0.1.3", 8080);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String mensaje;

            do {
                // Solicitar al usuario que ingrese el mensaje con el formato "destino:mensaje"
                System.out.print("Cliente dice (destino:mensaje): ");
                mensaje = reader.readLine();

                // Enviar el mensaje al servidor
                out.println(mensaje);

                // Leer la respuesta del servidor
                String respuesta = in.readLine();
                System.out.println("Respuesta del servidor: " + respuesta);

            } while (!mensaje.equals("0"));

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
