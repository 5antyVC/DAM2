package com.ftp;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class FTPListFiles {

    public static void main(String[] args) {
        FTPClient ftpClient = new FTPClient();
        
        try {
            // Conéctate al servidor FTP de manera anónima
            ftpClient.connect("ftp.rediris.es");
            ftpClient.login("anonymous", "");

            // Cambia a modo pasivo
            ftpClient.enterLocalPassiveMode();

            // Cambia al directorio 'debian'
            ftpClient.changeWorkingDirectory("mirror");

            // Lista los archivos y directorios en el directorio 'debian'
            FTPFile[] files = ftpClient.listFiles();
            System.out.println("Archivos y directorios en el directorio 'debian':");
            for (FTPFile file : files) {
                String details = file.getName();
                if (file.isDirectory()) {
                    details = "[" + details + "]";
                }
                System.out.println(details);
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