import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorConexionPersistente {

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

        ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String mensaje;

                do {
                    mensaje = in.readLine();
                    System.out.println("Cliente " + clientSocket.getInetAddress() + " dice: " + mensaje);

                    // Responder al cliente
                    out.println("Servidor dice: ¡Hola, cliente! "+ clientSocket.getInetAddress());

                } while (!mensaje.equals("0"));

                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}