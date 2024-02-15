/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.awt.Color;

/**
 *
 * @author Hp
 */
public class Apuntes extends javax.swing.JFrame {

    /**
     * Creates new form Colegas
     */
    public Apuntes() {
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

        panelContenido = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        panelMenuLateral = new javax.swing.JPanel();
        jLabelTextoBrothers = new javax.swing.JLabel();
        jLabelLogoImagen = new javax.swing.JLabel();
        jButtonMiMusica = new javax.swing.JButton();
        jButtonColegas = new javax.swing.JButton();
        jButtonIdeas = new javax.swing.JButton();
        jButtonApuntes = new javax.swing.JButton();
        jButtonTutoriales = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContenido.setBackground(new java.awt.Color(35, 35, 35));
        panelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Poppins", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Apuntes");
        panelContenido.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        getContentPane().add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1010, 670));

        panelMenuLateral.setBackground(new java.awt.Color(0, 0, 0));
        panelMenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTextoBrothers.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabelTextoBrothers.setForeground(new java.awt.Color(255, 0, 153));
        jLabelTextoBrothers.setText("Brothers");
        panelMenuLateral.add(jLabelTextoBrothers, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabelLogoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        panelMenuLateral.add(jLabelLogoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jButtonMiMusica.setBackground(new java.awt.Color(35, 35, 35));
        jButtonMiMusica.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButtonMiMusica.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMiMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/auriculares.png"))); // NOI18N
        jButtonMiMusica.setText("Mi Musica");
        jButtonMiMusica.setBorder(null);
        jButtonMiMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMiMusicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMiMusicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMiMusicaMouseExited(evt);
            }
        });
        panelMenuLateral.add(jButtonMiMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 200, 50));

        jButtonColegas.setBackground(new java.awt.Color(35, 35, 35));
        jButtonColegas.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButtonColegas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonColegas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colegas.png"))); // NOI18N
        jButtonColegas.setText("Colegas");
        jButtonColegas.setBorder(null);
        jButtonColegas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonColegasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonColegasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonColegasMouseExited(evt);
            }
        });
        panelMenuLateral.add(jButtonColegas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 50));

        jButtonIdeas.setBackground(new java.awt.Color(35, 35, 35));
        jButtonIdeas.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButtonIdeas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIdeas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bombilla.png"))); // NOI18N
        jButtonIdeas.setText("Ideas");
        jButtonIdeas.setBorder(null);
        jButtonIdeas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIdeasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIdeasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIdeasMouseExited(evt);
            }
        });
        panelMenuLateral.add(jButtonIdeas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 200, 50));

        jButtonApuntes.setBackground(new java.awt.Color(255, 0, 153));
        jButtonApuntes.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButtonApuntes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApuntes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/apuntes-de-clase.png"))); // NOI18N
        jButtonApuntes.setText("Apuntes");
        jButtonApuntes.setBorder(null);
        panelMenuLateral.add(jButtonApuntes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 50));

        jButtonTutoriales.setBackground(new java.awt.Color(35, 35, 35));
        jButtonTutoriales.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButtonTutoriales.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTutoriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/video.png"))); // NOI18N
        jButtonTutoriales.setText("Tutoriales");
        jButtonTutoriales.setBorder(null);
        jButtonTutoriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTutorialesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTutorialesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTutorialesMouseExited(evt);
            }
        });
        panelMenuLateral.add(jButtonTutoriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 200, 50));

        jButtonSalir.setBackground(new java.awt.Color(25, 207, 196));
        jButtonSalir.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorder(null);
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseExited(evt);
            }
        });
        panelMenuLateral.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 130, 40));

        getContentPane().add(panelMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonColegasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonColegasMouseClicked
        Colegas abrir = new Colegas();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonColegasMouseClicked

    private void jButtonMiMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMiMusicaMouseClicked
MiMusica abrir = new MiMusica();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);    }//GEN-LAST:event_jButtonMiMusicaMouseClicked

    private void jButtonIdeasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIdeasMouseClicked
Ideas abrir = new Ideas();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);     }//GEN-LAST:event_jButtonIdeasMouseClicked

    private void jButtonTutorialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTutorialesMouseClicked
Tutoriales abrir = new Tutoriales();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);    }//GEN-LAST:event_jButtonTutorialesMouseClicked

    private void jButtonColegasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonColegasMouseEntered
        jButtonColegas.setBackground(new Color(255, 0, 153)); //Provide the r g b values
    }//GEN-LAST:event_jButtonColegasMouseEntered

    private void jButtonColegasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonColegasMouseExited
        jButtonColegas.setBackground(new Color(35, 35, 35)); //Provide the r g b values
    }//GEN-LAST:event_jButtonColegasMouseExited

    private void jButtonMiMusicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMiMusicaMouseEntered
        jButtonMiMusica.setBackground(new Color(255, 0, 153)); //Provide the r g b values
    }//GEN-LAST:event_jButtonMiMusicaMouseEntered

    private void jButtonMiMusicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMiMusicaMouseExited
        jButtonMiMusica.setBackground(new Color(35, 35, 35)); //Provide the r g b values
    }//GEN-LAST:event_jButtonMiMusicaMouseExited

    private void jButtonIdeasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIdeasMouseEntered
        jButtonIdeas.setBackground(new Color(255, 0, 153)); //Provide the r g b values
    }//GEN-LAST:event_jButtonIdeasMouseEntered

    private void jButtonIdeasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIdeasMouseExited
        jButtonIdeas.setBackground(new Color(35, 35, 35)); //Provide the r g b values
    }//GEN-LAST:event_jButtonIdeasMouseExited

    private void jButtonTutorialesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTutorialesMouseEntered
        jButtonTutoriales.setBackground(new Color(255, 0, 153)); //Provide the r g b values
    }//GEN-LAST:event_jButtonTutorialesMouseEntered

    private void jButtonTutorialesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTutorialesMouseExited
        jButtonTutoriales.setBackground(new Color(35, 35, 35)); //Provide the r g b values
    }//GEN-LAST:event_jButtonTutorialesMouseExited

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        jButtonSalir.setBackground(new Color(19,130,124)); //Provide the r g b values
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        jButtonSalir.setBackground(new Color(25,207,196)); //Provide the r g b values
    }//GEN-LAST:event_jButtonSalirMouseExited

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
            java.util.logging.Logger.getLogger(Apuntes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apuntes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apuntes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apuntes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apuntes().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApuntes;
    private javax.swing.JButton jButtonColegas;
    private javax.swing.JButton jButtonIdeas;
    private javax.swing.JButton jButtonMiMusica;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonTutoriales;
    private javax.swing.JLabel jLabelLogoImagen;
    private javax.swing.JLabel jLabelTextoBrothers;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelMenuLateral;
    // End of variables declaration//GEN-END:variables
}
