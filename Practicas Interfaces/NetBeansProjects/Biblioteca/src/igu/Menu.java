package igu;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author Hp
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        BotonPrestamos = new javax.swing.JButton();
        BotonLibros = new javax.swing.JButton();
        BotonClientes = new javax.swing.JButton();
        CerrarImagen = new javax.swing.JLabel();
        BienvenidoTexto = new javax.swing.JLabel();
        Bocadillo = new javax.swing.JLabel();
        AuntArtic = new javax.swing.JLabel();
        ImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonPrestamos.setBackground(new java.awt.Color(255, 204, 51));
        BotonPrestamos.setFont(new java.awt.Font("Burbank Big Rg Bk", 3, 24)); // NOI18N
        BotonPrestamos.setForeground(new java.awt.Color(117, 88, 13));
        BotonPrestamos.setText("Prestamos");
        BotonPrestamos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        BotonPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPrestamosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonPrestamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonPrestamosMouseExited(evt);
            }
        });
        BotonPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrestamosActionPerformed(evt);
            }
        });
        Panel.add(BotonPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 200, 50));

        BotonLibros.setBackground(new java.awt.Color(255, 204, 51));
        BotonLibros.setFont(new java.awt.Font("Burbank Big Rg Bk", 3, 24)); // NOI18N
        BotonLibros.setForeground(new java.awt.Color(117, 88, 13));
        BotonLibros.setText("Libros");
        BotonLibros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        BotonLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLibrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonLibrosMouseExited(evt);
            }
        });
        Panel.add(BotonLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 200, 50));

        BotonClientes.setBackground(new java.awt.Color(255, 204, 51));
        BotonClientes.setFont(new java.awt.Font("Burbank Big Rg Bk", 3, 24)); // NOI18N
        BotonClientes.setForeground(new java.awt.Color(117, 88, 13));
        BotonClientes.setText("Clientes");
        BotonClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        BotonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonClientesMouseExited(evt);
            }
        });
        Panel.add(BotonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 200, 50));

        CerrarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        CerrarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarImagenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarImagenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarImagenMouseExited(evt);
            }
        });
        Panel.add(CerrarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 40, -1));

        BienvenidoTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 24)); // NOI18N
        BienvenidoTexto.setForeground(new java.awt.Color(80, 112, 150));
        BienvenidoTexto.setText("<html> Bienvenido a la biblioteca, <br>a donde quieres ir?");
        Panel.add(BienvenidoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 330, 60));

        Bocadillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bocadillo.png"))); // NOI18N
        Panel.add(Bocadillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        AuntArtic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Aunt_Arctic_Main_Pose_2015 (1).png"))); // NOI18N
        AuntArtic.setText("jLabel2");
        Panel.add(AuntArtic, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Book_RoomFondo.png"))); // NOI18N
        ImagenFondo.setText("jLabel1");
        Panel.add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1060, 690));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonClientesMouseClicked
    Clientes abrir = new Clientes();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);    }//GEN-LAST:event_BotonClientesMouseClicked

    private void BotonClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonClientesMouseEntered
        BotonClientes.setBackground(new Color(202,152,0));
    }//GEN-LAST:event_BotonClientesMouseEntered

    private void BotonClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonClientesMouseExited
        BotonClientes.setBackground(new Color(255,204,5));
    }//GEN-LAST:event_BotonClientesMouseExited

    private void BotonLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLibrosMouseClicked
Libro abrir = new Libro();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);     }//GEN-LAST:event_BotonLibrosMouseClicked

    private void BotonLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLibrosMouseEntered
        BotonLibros.setBackground(new Color(202,152,0));
    }//GEN-LAST:event_BotonLibrosMouseEntered

    private void BotonLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLibrosMouseExited
        BotonLibros.setBackground(new Color(255,204,5));
    }//GEN-LAST:event_BotonLibrosMouseExited

    private void BotonPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPrestamosMouseClicked
Prestamo abrir = new Prestamo();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);       }//GEN-LAST:event_BotonPrestamosMouseClicked

    private void BotonPrestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPrestamosMouseEntered
        BotonPrestamos.setBackground(new Color(202,152,0));
    }//GEN-LAST:event_BotonPrestamosMouseEntered

    private void BotonPrestamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPrestamosMouseExited
        BotonPrestamos.setBackground(new Color(255,204,5));
    }//GEN-LAST:event_BotonPrestamosMouseExited

    private void CerrarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarImagenMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarImagenMouseClicked

    private void BotonPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrestamosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPrestamosActionPerformed

    private void CerrarImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarImagenMouseEntered
        CerrarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar2.png")));
    }//GEN-LAST:event_CerrarImagenMouseEntered

    private void CerrarImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarImagenMouseExited
        CerrarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png")));
    }//GEN-LAST:event_CerrarImagenMouseExited

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuntArtic;
    private javax.swing.JLabel BienvenidoTexto;
    private javax.swing.JLabel Bocadillo;
    private javax.swing.JButton BotonClientes;
    private javax.swing.JButton BotonLibros;
    private javax.swing.JButton BotonPrestamos;
    private javax.swing.JLabel CerrarImagen;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
