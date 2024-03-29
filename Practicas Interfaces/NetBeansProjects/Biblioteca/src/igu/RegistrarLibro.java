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
public class RegistrarLibro extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public RegistrarLibro() {
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
        EjemplaresCampo = new javax.swing.JTextField();
        IDCampo = new javax.swing.JTextField();
        ISBNCampo = new javax.swing.JTextField();
        FechaCampo = new javax.swing.JTextField();
        GeneroCampo = new javax.swing.JTextField();
        PaginasCampo = new javax.swing.JTextField();
        idiomaCampo = new javax.swing.JTextField();
        AutorTexto = new javax.swing.JLabel();
        IDTexto = new javax.swing.JLabel();
        ISBDTexto = new javax.swing.JLabel();
        FechaTexto = new javax.swing.JLabel();
        GeneroTexto = new javax.swing.JLabel();
        PaginasTexto = new javax.swing.JLabel();
        IdiomaTexto = new javax.swing.JLabel();
        EjemplaresTexto = new javax.swing.JLabel();
        TituloTexto = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
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
        Panel.add(Libro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        TituloCampo.setBackground(new java.awt.Color(204, 204, 204));
        TituloCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        TituloCampo.setForeground(new java.awt.Color(153, 153, 153));
        TituloCampo.setText("Introduzca Titulo");
        TituloCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TituloCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloCampoActionPerformed(evt);
            }
        });
        Panel.add(TituloCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 230, 20));

        AutorCampo.setBackground(new java.awt.Color(204, 204, 204));
        AutorCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        AutorCampo.setForeground(new java.awt.Color(153, 153, 153));
        AutorCampo.setText("Introduzca Autor");
        AutorCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        AutorCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorCampoActionPerformed(evt);
            }
        });
        Panel.add(AutorCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 230, 20));

        EjemplaresCampo.setBackground(new java.awt.Color(204, 204, 204));
        EjemplaresCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        EjemplaresCampo.setForeground(new java.awt.Color(153, 153, 153));
        EjemplaresCampo.setText("Introduzca Ejemplares");
        EjemplaresCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        EjemplaresCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjemplaresCampoActionPerformed(evt);
            }
        });
        Panel.add(EjemplaresCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 230, 20));

        IDCampo.setBackground(new java.awt.Color(204, 204, 204));
        IDCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        IDCampo.setForeground(new java.awt.Color(153, 153, 153));
        IDCampo.setText("Introduzca ID");
        IDCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        IDCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDCampoActionPerformed(evt);
            }
        });
        Panel.add(IDCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 230, 20));

        ISBNCampo.setBackground(new java.awt.Color(204, 204, 204));
        ISBNCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        ISBNCampo.setForeground(new java.awt.Color(153, 153, 153));
        ISBNCampo.setText("Introduzca ISBN");
        ISBNCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ISBNCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNCampoActionPerformed(evt);
            }
        });
        Panel.add(ISBNCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 230, 20));

        FechaCampo.setBackground(new java.awt.Color(204, 204, 204));
        FechaCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        FechaCampo.setForeground(new java.awt.Color(153, 153, 153));
        FechaCampo.setText("Introduzca Fecha");
        FechaCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        FechaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaCampoActionPerformed(evt);
            }
        });
        Panel.add(FechaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 230, 20));

        GeneroCampo.setBackground(new java.awt.Color(204, 204, 204));
        GeneroCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        GeneroCampo.setForeground(new java.awt.Color(153, 153, 153));
        GeneroCampo.setText("Introduzca Genero");
        GeneroCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        GeneroCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroCampoActionPerformed(evt);
            }
        });
        Panel.add(GeneroCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 230, 20));

        PaginasCampo.setBackground(new java.awt.Color(204, 204, 204));
        PaginasCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        PaginasCampo.setForeground(new java.awt.Color(153, 153, 153));
        PaginasCampo.setText("Introduzca Numero Paginas");
        PaginasCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PaginasCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginasCampoActionPerformed(evt);
            }
        });
        Panel.add(PaginasCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 230, -1));

        idiomaCampo.setBackground(new java.awt.Color(204, 204, 204));
        idiomaCampo.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 14)); // NOI18N
        idiomaCampo.setForeground(new java.awt.Color(153, 153, 153));
        idiomaCampo.setText("Introduzca Idioma");
        idiomaCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        idiomaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiomaCampoActionPerformed(evt);
            }
        });
        Panel.add(idiomaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 230, 20));

        AutorTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        AutorTexto.setForeground(new java.awt.Color(80, 112, 150));
        AutorTexto.setText("Autor:");
        Panel.add(AutorTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 60, -1));

        IDTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        IDTexto.setForeground(new java.awt.Color(80, 112, 150));
        IDTexto.setText("ID:");
        Panel.add(IDTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 60, -1));

        ISBDTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        ISBDTexto.setForeground(new java.awt.Color(80, 112, 150));
        ISBDTexto.setText("ISBN:");
        Panel.add(ISBDTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 60, -1));

        FechaTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        FechaTexto.setForeground(new java.awt.Color(80, 112, 150));
        FechaTexto.setText("Fecha:");
        Panel.add(FechaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 60, -1));

        GeneroTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        GeneroTexto.setForeground(new java.awt.Color(80, 112, 150));
        GeneroTexto.setText("Genero:");
        Panel.add(GeneroTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 70, -1));

        PaginasTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        PaginasTexto.setForeground(new java.awt.Color(80, 112, 150));
        PaginasTexto.setText("Paginas:");
        Panel.add(PaginasTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 80, -1));

        IdiomaTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        IdiomaTexto.setForeground(new java.awt.Color(80, 112, 150));
        IdiomaTexto.setText("Idioma:");
        Panel.add(IdiomaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 70, -1));

        EjemplaresTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        EjemplaresTexto.setForeground(new java.awt.Color(80, 112, 150));
        EjemplaresTexto.setText("Ejemplares:");
        Panel.add(EjemplaresTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 100, -1));

        TituloTexto.setFont(new java.awt.Font("Burbank Big Rg Bk", 1, 18)); // NOI18N
        TituloTexto.setForeground(new java.awt.Color(80, 112, 150));
        TituloTexto.setText("Titulo:");
        Panel.add(TituloTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 60, -1));

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
        Panel.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 200, 50));

        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Librofondo.png"))); // NOI18N
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

    private void EjemplaresCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjemplaresCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EjemplaresCampoActionPerformed

    private void IDCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDCampoActionPerformed

    private void ISBNCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNCampoActionPerformed

    private void FechaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaCampoActionPerformed

    private void GeneroCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneroCampoActionPerformed

    private void PaginasCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaginasCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaginasCampoActionPerformed

    private void idiomaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idiomaCampoActionPerformed

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
    private javax.swing.JTextField EjemplaresCampo;
    private javax.swing.JLabel EjemplaresTexto;
    private javax.swing.JTextField FechaCampo;
    private javax.swing.JLabel FechaTexto;
    private javax.swing.JTextField GeneroCampo;
    private javax.swing.JLabel GeneroTexto;
    private javax.swing.JTextField IDCampo;
    private javax.swing.JLabel IDTexto;
    private javax.swing.JLabel ISBDTexto;
    private javax.swing.JTextField ISBNCampo;
    private javax.swing.JLabel IdiomaTexto;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JLabel Libro1;
    private javax.swing.JTextField PaginasCampo;
    private javax.swing.JLabel PaginasTexto;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField TituloCampo;
    private javax.swing.JLabel TituloTexto;
    private javax.swing.JTextField idiomaCampo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
