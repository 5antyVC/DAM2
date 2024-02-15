/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class conexion {
    
    Connection enlazar=null;
    
    public Connection  conectar(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            enlazar = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","aula1");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+" No fue posible establecer la conexion");
        }
        
        return enlazar;
    
    
    }
    //Puede estar en biblioteca
    
    Conexion enlace= new Conexion();
    Connection conect=enlace;
}
