package com.ftp;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
public class FTPListFilesyDescarga {

    public static void main(String[] args) {
        FTPClient ftpClient = new FTPClient();

        try {
            // Conéctate al servidor FTP de manera anónima
            ftpClient.connect("ftp.rediris.es");
            ftpClient.login("anonymous", "");
            
            // Cambia a modo pasivo
            ftpClient.enterLocalPassiveMode();

            // Cambia al directorio 'mirror/MySQL'
            ftpClient.changeWorkingDirectory("mirror/MySQL");

            // Lista los archivos y directorios en el directorio 'mirror/MySQL'
            FTPFile[] files = ftpClient.listFiles();
            System.out.println("Archivos y directorios en el directorio 'mirror/MySQL':");
            for (FTPFile file : files) {
                String details = file.getName();
                if (file.isDirectory()) {
                    details = "[" + details + "]";
                }
                System.out.println(details);
            }

            //Ejercicio Descargar Archivo
            File archivoDescargado = new File("last-updated.txt ");
            OutputStream salida = new BufferedOutputStream(new FileOutputStream(archivoDescargado));
            boolean resultado = ftpClient.retrieveFile("last-updated.txt" ,salida);
            salida.close();

            if (resultado) {
                System.out.println("Se ha descargado el archivo");
            } else {
                System.out.println("No se pudo descargar el archivo");
            }

            // Cierra la sesión y desconéctate
            ftpClient.logout();
            ftpClient.disconnect();

            System.out.println("Desconexión exitosa.");

        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.disconnect();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
