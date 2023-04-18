/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author jmcada
 */

import figura.Circulo;

public class CircleWindow extends javax.swing.JFrame {

    /**
     * Creates new form Circle
     */
    
    public Circulo circle;
    public MainWindow myMainWindow; 
    
    public void computeCircle() {
        this.txt_radio.setText(String.valueOf(this.circle.radio));
        this.txt_area.setText(String.valueOf(this.circle.area()));
        this.txt_perimetro.setText(String.valueOf(this.circle.perimetro()));
    }

    public void saveCircle() {
        this.circle.radio = Double.parseDouble(this.txt_radio.getText());
    }

    public CircleWindow(Circulo circle, MainWindow myMainWindow) {
        initComponents();

        this.circle = circle;
        this.myMainWindow = myMainWindow;

        this.computeCircle();
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
        btn_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_radio = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_area = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_perimetro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CIRCULO");

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel2.setText("Radio:");

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        jLabel3.setText("Area:");

        jLabel4.setText("Perimetro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txt_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_calcular, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txt_area))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txt_perimetro))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_calcular)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_perimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_salir)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.saveCircle();
        this.myMainWindow.updateCircle();
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        this.saveCircle();
        this.computeCircle();
    }//GEN-LAST:event_btn_calcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_area;
    private javax.swing.JTextField txt_perimetro;
    private javax.swing.JTextField txt_radio;
    // End of variables declaration//GEN-END:variables
}