import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ServidorConexionPersistente {

    private static Map<String, PrintWriter> usuariosConectados = new HashMap<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Servidor iniciado en el puerto 8080...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado desde: " + clientSocket.getInetAddress());

                // Crear un nuevo hilo para manejar la conexión con el cliente
                Thread clientThread = new ClientHandler(clientSocket);
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler extends Thread {
        private Socket clientSocket;
        private BufferedReader in;
        private PrintWriter out;

        ClientHandler(Socket socket) {
            this.clientSocket = socket;
            try {
                this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                this.out = new PrintWriter(clientSocket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                String mensaje;

                while (true) {
                    mensaje = in.readLine();
                    System.out.println("Mensaje recibido de " + clientSocket.getInetAddress() + ": " + mensaje);

                    if (mensaje.equals("0")) {
                        break;
                    }

                    // Analizar el mensaje para obtener el destino y el contenido
                    String[] parts = mensaje.split(":", 2);
                    String destino = parts[0];
                    String contenido = parts[1];

                    // Enviar el mensaje al destino si está conectado
                    if (usuariosConectados.containsKey(destino)) {
                        PrintWriter destinoWriter = usuariosConectados.get(destino);
                        destinoWriter.println("Mensaje de " + clientSocket.getInetAddress() + ": " + contenido);
                    } else {
                        System.out.println("Usuario " + destino + " no encontrado.");
                    }
                }

                // Cerrar la conexión con el cliente
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
