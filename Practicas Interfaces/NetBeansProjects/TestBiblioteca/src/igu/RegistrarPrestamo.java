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
public class RegistrarPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public RegistrarPrestamo() {
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

        jLabel1 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        CerrarImagen = new javax.swing.JLabel();
        Editar = new javax.swing.JLabel();
        Libro1 = new javax.swing.JLabel();
        TituloCampo = new javax.swing.JTextField();
        AutorCampo = new javax.swing.JTextField();
        IDCampo = new javax.swing.JTextField();
        ISBNCampo = new javax.swing.JTextField();
        FechaCampo = new javax.swing.JTextField();
        AutorTexto = new javax.swing.JLabel();
        IDTexto = new javax.swing.JLabel();
        ISBDTexto = new javax.swing.JLabel();
        FechaTexto = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        TituloTexto = new javax.swing.JLabel();
        ImagenFondo = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Book_RoomFondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Panel.add(CerrarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 40, -1));

        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pencilpequeño.png"))); // NOI18N
        Panel.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        Libro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cruzpequeña.png"))); // NOI18N
        Libro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Libro1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Libro1MouseExited(evt);
            }
        });
        Panel.add(Libro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        TituloCampo.setBackground(new java.awt.Color(204, 204, 204));
        TituloCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        TituloCampo.setForeground(new java.awt.Color(153, 153, 153));
        TituloCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TituloCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloCampoActionPerformed(evt);
            }
        });
        Panel.add(TituloCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 230, 20));

        AutorCampo.setBackground(new java.awt.Color(204, 204, 204));
        AutorCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        AutorCampo.setForeground(new java.awt.Color(153, 153, 153));
        AutorCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        AutorCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorCampoActionPerformed(evt);
            }
        });
        Panel.add(AutorCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 230, 20));

        IDCampo.setBackground(new java.awt.Color(204, 204, 204));
        IDCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        IDCampo.setForeground(new java.awt.Color(153, 153, 153));
        IDCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        IDCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDCampoActionPerformed(evt);
            }
        });
        Panel.add(IDCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 230, 20));

        ISBNCampo.setBackground(new java.awt.Color(204, 204, 204));
        ISBNCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        ISBNCampo.setForeground(new java.awt.Color(153, 153, 153));
        ISBNCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ISBNCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNCampoActionPerformed(evt);
            }
        });
        Panel.add(ISBNCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 230, 20));

        FechaCampo.setBackground(new java.awt.Color(204, 204, 204));
        FechaCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        FechaCampo.setForeground(new java.awt.Color(153, 153, 153));
        FechaCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        FechaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaCampoActionPerformed(evt);
            }
        });
        Panel.add(FechaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 230, 20));

        AutorTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        AutorTexto.setForeground(new java.awt.Color(80, 112, 150));
        AutorTexto.setText("Titulo:");
        Panel.add(AutorTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 60, -1));

        IDTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        IDTexto.setForeground(new java.awt.Color(80, 112, 150));
        IDTexto.setText("Fecha Prestamo:");
        Panel.add(IDTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 150, -1));

        ISBDTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        ISBDTexto.setForeground(new java.awt.Color(80, 112, 150));
        ISBDTexto.setText("Fecha Devolucion:");
        Panel.add(ISBDTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 170, -1));

        FechaTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        FechaTexto.setForeground(new java.awt.Color(80, 112, 150));
        FechaTexto.setText("Observacion:");
        Panel.add(FechaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 120, -1));

        BotonGuardar.setBackground(new java.awt.Color(255, 204, 51));
        BotonGuardar.setFont(new java.awt.Font("Burbank Big Rg Bk", 3, 24)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(117, 88, 13));
        BotonGuardar.setText("Guardar");
        BotonGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseExited(evt);
            }
        });
        Panel.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 200, 50));

        TituloTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        TituloTexto.setForeground(new java.awt.Color(80, 112, 150));
        TituloTexto.setText("Cliente:");
        Panel.add(TituloTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 90, -1));

        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LibrofondoAzul.png"))); // NOI18N
        ImagenFondo.setText("jLabel1");
        Panel.add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 540, 600));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarImagenMouseClicked
        setVisible(false);
        dispose();
     }//GEN-LAST:event_CerrarImagenMouseClicked

    private void TituloCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloCampoActionPerformed

    private void AutorCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutorCampoActionPerformed

    private void IDCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDCampoActionPerformed

    private void ISBNCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNCampoActionPerformed

    private void FechaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaCampoActionPerformed

    private void BotonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseClicked
        setVisible(false);
        dispose();
    }//GEN-LAST:event_BotonGuardarMouseClicked

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        BotonGuardar.setBackground(new Color(202,152,0));
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        BotonGuardar.setBackground(new Color(255,204,5));
    }//GEN-LAST:event_BotonGuardarMouseExited

    private void CerrarImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarImagenMouseEntered
        CerrarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar2.png")));
    }//GEN-LAST:event_CerrarImagenMouseEntered

    private void CerrarImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarImagenMouseExited
        CerrarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png")));
    }//GEN-LAST:event_CerrarImagenMouseExited

    private void Libro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Libro1MouseEntered
        Libro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cruzpequeña2.png")));
    }//GEN-LAST:event_Libro1MouseEntered

    private void Libro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Libro1MouseExited
        Libro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cruzpequeña.png")));
    }//GEN-LAST:event_Libro1MouseExited
   
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AutorCampo;
    private javax.swing.JLabel AutorTexto;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JLabel CerrarImagen;
    private javax.swing.JLabel Editar;
    private javax.swing.JTextField FechaCampo;
    private javax.swing.JLabel FechaTexto;
    private javax.swing.JTextField IDCampo;
    private javax.swing.JLabel IDTexto;
    private javax.swing.JLabel ISBDTexto;
    private javax.swing.JTextField ISBNCampo;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JLabel Libro1;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField TituloCampo;
    private javax.swing.JLabel TituloTexto;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
