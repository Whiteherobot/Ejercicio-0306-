package EditorGrafico;

import Controlador.Pizarra;
import Modelo.Figura;
import java.awt.Color;

public class Ventana extends javax.swing.JFrame {

    private Figura figura;
    private Pizarra pizarra;
    
    public Ventana() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.figura = new Figura(Figura.CUADRADO, Color.WHITE, 25, 25);
        pizarra = new Pizarra();
        pizarra.setBounds(10, 10, this.panelPizarra.getWidth() - 20, this.panelPizarra.getHeight() - 20);
        this.panelPizarra.add(pizarra);
        pizarra.setFigura(figura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbFigura = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbColor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelPizarra = new javax.swing.JPanel();
        btLimpiar = new javax.swing.JButton();
        txtAncho = new javax.swing.JFormattedTextField();
        txtAlto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Figura:");

        cbFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Rectangulo", "Triangulo", "Circulo", "Estrella" }));
        cbFigura.setToolTipText("");
        cbFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiguraActionPerformed(evt);
            }
        });

        jLabel2.setText("Color:");

        cbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Azul", "Verde", "Negro", "Amarillo" }));
        cbColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbColorActionPerformed(evt);
            }
        });

        jLabel3.setText("Ancho:");

        jLabel4.setText("Alto:");

        panelPizarra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPizarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelPizarraMouseMoved(evt);
            }
        });
        panelPizarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPizarraMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelPizarraLayout = new javax.swing.GroupLayout(panelPizarra);
        panelPizarra.setLayout(panelPizarraLayout);
        panelPizarraLayout.setHorizontalGroup(
            panelPizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        panelPizarraLayout.setVerticalGroup(
            panelPizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        txtAncho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtAncho.setText("25");
        txtAncho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnchoKeyReleased(evt);
            }
        });

        txtAlto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtAlto.setText("25");
        txtAlto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAltoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbFigura, 0, 176, Short.MAX_VALUE)
                            .addComponent(cbColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAncho)
                            .addComponent(txtAlto, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(panelPizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(btLimpiar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(panelPizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLimpiar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        this.pizarra.setLimpiar(true);
        this.pizarra.repaint();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void panelPizarraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPizarraMouseMoved
        configurarDibujo();
    }//GEN-LAST:event_panelPizarraMouseMoved

    private void panelPizarraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPizarraMouseEntered
        configurarDibujo();
    }//GEN-LAST:event_panelPizarraMouseEntered

    private void cbFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiguraActionPerformed
        configurarDibujo();
    }//GEN-LAST:event_cbFiguraActionPerformed

    private void cbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbColorActionPerformed
        configurarDibujo();
    }//GEN-LAST:event_cbColorActionPerformed

    private void txtAnchoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnchoKeyReleased
        configurarDibujo();
    }//GEN-LAST:event_txtAnchoKeyReleased

    private void txtAltoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAltoKeyReleased
        configurarDibujo();
    }//GEN-LAST:event_txtAltoKeyReleased

    public void configurarDibujo() {
        this.pizarra.setLimpiar(false);
        figura.setTipo(cbFigura.getSelectedIndex());
        int color = cbColor.getSelectedIndex();
        switch (color) {
            case 0:
                this.figura.setColor(Color.RED);
                break;
            case 1:
                this.figura.setColor(Color.BLUE);
                break;
            case 2:
                this.figura.setColor(Color.GREEN);
                break;
            case 3:
                this.figura.setColor(Color.BLACK);
                break;
            case 4:
                this.figura.setColor(Color.YELLOW);
                break;
        }
        if (txtAncho.getText().isEmpty()) {
            this.figura.setAncho(1);
        } else {
            this.figura.setAncho(Math.abs(Integer.valueOf(txtAncho.getText())));
        }
        if (txtAlto.getText().isEmpty()) {
            this.figura.setAlto(1);
        } else {
            this.figura.setAlto(Math.abs(Integer.valueOf(txtAlto.getText())));
        }
        
        this.pizarra.setFigura(figura);
    }
    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpiar;
    private javax.swing.JComboBox<String> cbColor;
    private javax.swing.JComboBox<String> cbFigura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelPizarra;
    private javax.swing.JFormattedTextField txtAlto;
    private javax.swing.JFormattedTextField txtAncho;
    // End of variables declaration//GEN-END:variables
}
