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
public class Hoteles extends javax.swing.JFrame {

    /**
     * Creates new form MisViajes
     */
    public Hoteles() {
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

        PanelPrincipal = new javax.swing.JPanel();
        PanelLateral = new javax.swing.JPanel();
        ImagenLogo = new javax.swing.JLabel();
        BotonHoteles = new javax.swing.JButton();
        BotonMisViajes = new javax.swing.JButton();
        BotonVuelos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BotonCerrar1 = new javax.swing.JButton();
        PanelContenido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelMalaga = new javax.swing.JPanel();
        ImagenMalaga = new javax.swing.JLabel();
        TituloMalaga = new javax.swing.JLabel();
        DescripcionMalaga = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DescripcionMalaga1 = new javax.swing.JLabel();
        DescripcionMalaga2 = new javax.swing.JLabel();
        BotonCerrar = new javax.swing.JButton();
        TituloMalaga1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PanelMalaga1 = new javax.swing.JPanel();
        ImagenMalaga1 = new javax.swing.JLabel();
        TituloMalaga2 = new javax.swing.JLabel();
        DescripcionMalaga3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DescripcionMalaga4 = new javax.swing.JLabel();
        DescripcionMalaga5 = new javax.swing.JLabel();
        BotonCerrar2 = new javax.swing.JButton();
        TituloMalaga3 = new javax.swing.JLabel();
        PanelMalaga2 = new javax.swing.JPanel();
        ImagenMalaga2 = new javax.swing.JLabel();
        TituloMalaga4 = new javax.swing.JLabel();
        DescripcionMalaga6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        DescripcionMalaga7 = new javax.swing.JLabel();
        DescripcionMalaga8 = new javax.swing.JLabel();
        BotonCerrar3 = new javax.swing.JButton();
        TituloMalaga5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(255, 51, 51));
        PanelPrincipal.setMaximumSize(new java.awt.Dimension(1200, 700));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLateral.setBackground(new java.awt.Color(255, 255, 255));
        PanelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AvionLogo.png"))); // NOI18N
        PanelLateral.add(ImagenLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 115, -1, -1));

        BotonHoteles.setBackground(new java.awt.Color(7, 109, 154));
        BotonHoteles.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonHoteles.setForeground(new java.awt.Color(255, 255, 255));
        BotonHoteles.setText("Hoteles");
        BotonHoteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHotelesActionPerformed(evt);
            }
        });
        PanelLateral.add(BotonHoteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 434, 203, 72));

        BotonMisViajes.setBackground(new java.awt.Color(9, 157, 221));
        BotonMisViajes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonMisViajes.setForeground(new java.awt.Color(255, 255, 255));
        BotonMisViajes.setText("Mis Viajes");
        BotonMisViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMisViajesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonMisViajesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonMisViajesMouseExited(evt);
            }
        });
        PanelLateral.add(BotonMisViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 526, 203, 72));

        BotonVuelos.setBackground(new java.awt.Color(9, 157, 221));
        BotonVuelos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonVuelos.setForeground(new java.awt.Color(255, 255, 255));
        BotonVuelos.setText("Vuelos");
        BotonVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonVuelosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonVuelosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonVuelosMouseExited(evt);
            }
        });
        PanelLateral.add(BotonVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 344, 203, 72));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bienvenido a Telena");
        PanelLateral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        BotonCerrar1.setBackground(new java.awt.Color(9, 157, 221));
        BotonCerrar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonCerrar1.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar1.setText("Cerrar");
        BotonCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCerrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCerrar1MouseExited(evt);
            }
        });
        PanelLateral.add(BotonCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 616, 203, 72));

        PanelPrincipal.add(PanelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        PanelContenido.setBackground(new java.awt.Color(56, 109, 189));
        PanelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hoteles");
        PanelContenido.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        PanelMalaga.setBackground(new java.awt.Color(255, 255, 255));
        PanelMalaga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelMalagaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelMalagaMouseExited(evt);
            }
        });
        PanelMalaga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenMalaga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Hotel3.png"))); // NOI18N
        PanelMalaga.add(ImagenMalaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        TituloMalaga.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TituloMalaga.setForeground(new java.awt.Color(9, 157, 221));
        TituloMalaga.setText("303€");
        PanelMalaga.add(TituloMalaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        DescripcionMalaga.setBackground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionMalaga.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga.setText("Wifi Gratis, Aire Acondicionado");
        PanelMalaga.add(DescripcionMalaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrella.png"))); // NOI18N
        PanelMalaga.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrella.png"))); // NOI18N
        PanelMalaga.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellaazul.png"))); // NOI18N
        PanelMalaga.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellaazul.png"))); // NOI18N
        PanelMalaga.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrella.png"))); // NOI18N
        PanelMalaga.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        DescripcionMalaga1.setBackground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionMalaga1.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga1.setText("7.8 Muy bueno");
        PanelMalaga.add(DescripcionMalaga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 110, 30));

        DescripcionMalaga2.setBackground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionMalaga2.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga2.setText("Costa");
        PanelMalaga.add(DescripcionMalaga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 50, 30));

        BotonCerrar.setBackground(new java.awt.Color(9, 157, 221));
        BotonCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar.setText("Ver Oferta");
        BotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseExited(evt);
            }
        });
        PanelMalaga.add(BotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 150, 72));

        TituloMalaga1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloMalaga1.setForeground(new java.awt.Color(9, 157, 221));
        TituloMalaga1.setText("Beach Málaga Resort");
        PanelMalaga.add(TituloMalaga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        PanelContenido.add(PanelMalaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 740, 190));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Hoteles Más Recomendados");
        PanelContenido.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        PanelMalaga1.setBackground(new java.awt.Color(255, 255, 255));
        PanelMalaga1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelMalaga1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelMalaga1MouseExited(evt);
            }
        });
        PanelMalaga1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenMalaga1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Hotel1.png"))); // NOI18N
        PanelMalaga1.add(ImagenMalaga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        TituloMalaga2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TituloMalaga2.setForeground(new java.awt.Color(9, 157, 221));
        TituloMalaga2.setText("106€");
        PanelMalaga1.add(TituloMalaga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        DescripcionMalaga3.setBackground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionMalaga3.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga3.setText("Wifi Gratis, Aire Acondicionado");
        PanelMalaga1.add(DescripcionMalaga3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrella.png"))); // NOI18N
        PanelMalaga1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrella.png"))); // NOI18N
        PanelMalaga1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellaazul.png"))); // NOI18N
        PanelMalaga1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellaazul.png"))); // NOI18N
        PanelMalaga1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellaazul.png"))); // NOI18N
        PanelMalaga1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        DescripcionMalaga4.setBackground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionMalaga4.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga4.setText("8.6 Muy bueno");
        PanelMalaga1.add(DescripcionMalaga4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 110, 30));

        DescripcionMalaga5.setBackground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionMalaga5.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga5.setText("Costa");
        PanelMalaga1.add(DescripcionMalaga5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 50, 30));

        BotonCerrar2.setBackground(new java.awt.Color(9, 157, 221));
        BotonCerrar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonCerrar2.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar2.setText("Ver Oferta");
        BotonCerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCerrar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCerrar2MouseExited(evt);
            }
        });
        PanelMalaga1.add(BotonCerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 150, 72));

        TituloMalaga3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloMalaga3.setForeground(new java.awt.Color(9, 157, 221));
        TituloMalaga3.setText("Costa Marfil Hotel Palace");
        PanelMalaga1.add(TituloMalaga3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        PanelContenido.add(PanelMalaga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 740, 190));

        PanelMalaga2.setBackground(new java.awt.Color(255, 255, 255));
        PanelMalaga2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelMalaga2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelMalaga2MouseExited(evt);
            }
        });
        PanelMalaga2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenMalaga2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Hotel2.png"))); // NOI18N
        PanelMalaga2.add(ImagenMalaga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        TituloMalaga4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TituloMalaga4.setForeground(new java.awt.Color(9, 157, 221));
        TituloMalaga4.setText("209€");
        PanelMalaga2.add(TituloMalaga4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        DescripcionMalaga6.setBackground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionMalaga6.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga6.setText("Wifi Gratis, Aire Acondicionado");
        PanelMalaga2.add(DescripcionMalaga6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellaazul.png"))); // NOI18N
        PanelMalaga2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrella.png"))); // NOI18N
        PanelMalaga2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellaazul.png"))); // NOI18N
        PanelMalaga2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellaazul.png"))); // NOI18N
        PanelMalaga2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrellaazul.png"))); // NOI18N
        PanelMalaga2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        DescripcionMalaga7.setBackground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionMalaga7.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga7.setText("9.2 Muy bueno");
        PanelMalaga2.add(DescripcionMalaga7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 110, 30));

        DescripcionMalaga8.setBackground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionMalaga8.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionMalaga8.setText("Centro");
        PanelMalaga2.add(DescripcionMalaga8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 50, 30));

        BotonCerrar3.setBackground(new java.awt.Color(9, 157, 221));
        BotonCerrar3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonCerrar3.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar3.setText("Ver Oferta");
        BotonCerrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCerrar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCerrar3MouseExited(evt);
            }
        });
        PanelMalaga2.add(BotonCerrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 150, 72));

        TituloMalaga5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloMalaga5.setForeground(new java.awt.Color(9, 157, 221));
        TituloMalaga5.setText("Costa Marfil Hotel Palace");
        PanelMalaga2.add(TituloMalaga5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        PanelContenido.add(PanelMalaga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 740, 190));

        PanelPrincipal.add(PanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 700));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVuelosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVuelosMouseEntered
        BotonVuelos.setBackground(new Color(7,109,154));
    }//GEN-LAST:event_BotonVuelosMouseEntered

    private void BotonVuelosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVuelosMouseExited
        BotonVuelos.setBackground(new Color(9,157,221));
            }//GEN-LAST:event_BotonVuelosMouseExited

    private void BotonMisViajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMisViajesMouseEntered
        BotonMisViajes.setBackground(new Color(7,109,154));
    }//GEN-LAST:event_BotonMisViajesMouseEntered

    private void BotonMisViajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMisViajesMouseExited
        BotonMisViajes.setBackground(new Color(9,157,221));
    }//GEN-LAST:event_BotonMisViajesMouseExited

    private void BotonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseEntered
        BotonCerrar.setBackground(new Color(7,109,154));
    }//GEN-LAST:event_BotonCerrarMouseEntered

    private void BotonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseExited
        BotonCerrar.setBackground(new Color(9,157,221));
    }//GEN-LAST:event_BotonCerrarMouseExited

    private void BotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonCerrarMouseClicked

    private void PanelMalagaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMalagaMouseEntered
        PanelMalaga.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_PanelMalagaMouseEntered

    private void PanelMalagaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMalagaMouseExited
        PanelMalaga.setBackground(new Color(255,255,255 ));

    }//GEN-LAST:event_PanelMalagaMouseExited

    private void BotonVuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVuelosMouseClicked
Vuelos abrir = new Vuelos();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);    }//GEN-LAST:event_BotonVuelosMouseClicked

    private void BotonMisViajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMisViajesMouseClicked
MisViajes abrir = new MisViajes();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);    }//GEN-LAST:event_BotonMisViajesMouseClicked

    private void BotonCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrar1MouseClicked

    private void BotonCerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrar1MouseEntered

    private void BotonCerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrar1MouseExited

    private void BotonCerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrar2MouseClicked

    private void BotonCerrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrar2MouseEntered

    private void BotonCerrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrar2MouseExited

    private void PanelMalaga1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMalaga1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelMalaga1MouseEntered

    private void PanelMalaga1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMalaga1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelMalaga1MouseExited

    private void BotonCerrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrar3MouseClicked

    private void BotonCerrar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrar3MouseEntered

    private void BotonCerrar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrar3MouseExited

    private void PanelMalaga2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMalaga2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelMalaga2MouseEntered

    private void PanelMalaga2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMalaga2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelMalaga2MouseExited

    private void BotonHotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHotelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonHotelesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MisViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisViajes().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonCerrar1;
    private javax.swing.JButton BotonCerrar2;
    private javax.swing.JButton BotonCerrar3;
    private javax.swing.JButton BotonHoteles;
    private javax.swing.JButton BotonMisViajes;
    private javax.swing.JButton BotonVuelos;
    private javax.swing.JLabel DescripcionMalaga;
    private javax.swing.JLabel DescripcionMalaga1;
    private javax.swing.JLabel DescripcionMalaga2;
    private javax.swing.JLabel DescripcionMalaga3;
    private javax.swing.JLabel DescripcionMalaga4;
    private javax.swing.JLabel DescripcionMalaga5;
    private javax.swing.JLabel DescripcionMalaga6;
    private javax.swing.JLabel DescripcionMalaga7;
    private javax.swing.JLabel DescripcionMalaga8;
    private javax.swing.JLabel ImagenLogo;
    private javax.swing.JLabel ImagenMalaga;
    private javax.swing.JLabel ImagenMalaga1;
    private javax.swing.JLabel ImagenMalaga2;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JPanel PanelMalaga;
    private javax.swing.JPanel PanelMalaga1;
    private javax.swing.JPanel PanelMalaga2;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel TituloMalaga;
    private javax.swing.JLabel TituloMalaga1;
    private javax.swing.JLabel TituloMalaga2;
    private javax.swing.JLabel TituloMalaga3;
    private javax.swing.JLabel TituloMalaga4;
    private javax.swing.JLabel TituloMalaga5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
