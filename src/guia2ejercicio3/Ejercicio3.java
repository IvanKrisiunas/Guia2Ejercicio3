/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicio3;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monica
 */
public class Ejercicio3 extends javax.swing.JFrame {
private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form Ejercicio3
     */
    public Ejercicio3() {
        initComponents();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jCategoria = new javax.swing.JComboBox<>();
        JTNombre = new javax.swing.JTextField();
        JTPrecio = new javax.swing.JTextField();
        JBAgregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabla = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Catalogo");

        jCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronica", "Ropa", "Alimentos" }));

        JTNombre.setText("Nombre de producto");
        JTNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTNombreMouseClicked(evt);
            }
        });
        JTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNombreActionPerformed(evt);
            }
        });

        JTPrecio.setText("Precio");
        JTPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTPrecioMouseClicked(evt);
            }
        });
        JTPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTPrecioKeyReleased(evt);
            }
        });

        JBAgregarProducto.setText("Agregar Producto");
        JBAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarProductoActionPerformed(evt);
            }
        });

        JTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBAgregarProducto))
                        .addGap(32, 32, 32)
                        .addComponent(JTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(JBAgregarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarProductoActionPerformed
        // TODO add your handling code here:
        Accion();
    }//GEN-LAST:event_JBAgregarProductoActionPerformed

    private void JTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNombreActionPerformed
        // TODO add your handling code here:
                JTNombre.setText("");
    }//GEN-LAST:event_JTNombreActionPerformed

    private void JTNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTNombreMouseClicked
        // TODO add your handling code here:
                JTNombre.setText("");
    }//GEN-LAST:event_JTNombreMouseClicked

    private void JTPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTPrecioMouseClicked
        // TODO add your handling code here:
        JTPrecio.setText("");
    }//GEN-LAST:event_JTPrecioMouseClicked

    private void JTPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPrecioKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             Accion();
            
        }
    }//GEN-LAST:event_JTPrecioKeyReleased

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregarProducto;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JTextField JTPrecio;
    private javax.swing.JTable JTabla;
    private javax.swing.JComboBox<String> jCategoria;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void Accion(){
    try{
            if (JTNombre.getText().isEmpty()||JTPrecio.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Debes completar los espacios vacios", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            String categoria =(String) jCategoria.getSelectedItem();
            String nombre = JTNombre.getText();
            int precio = Integer.parseInt(JTPrecio.getText());
            modelo.addRow(new Object[]{categoria, nombre, precio});
            JTNombre.setText("");
            JTPrecio.setText("");
        }catch(NumberFormatException a){
            JOptionPane.showMessageDialog(this, "Debes agregar numeros enteros al precio", "NumberFormatException", JOptionPane.ERROR_MESSAGE);
        }
}
    private void llenarTabla(){
    modelo.addColumn("Categoria");
    modelo.addColumn("Nombre");
    modelo.addColumn("Precio");
    JTabla.setModel(modelo);
}
} 

