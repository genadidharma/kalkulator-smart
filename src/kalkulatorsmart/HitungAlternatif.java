/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kalkulatorsmart;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author genad
 */
public class HitungAlternatif extends javax.swing.JFrame {
    Object listKriteria[][];
    public int rowAlt;

    /**
     * Creates new form HitungAlternatif
     * @param listKriteria
     */
    public HitungAlternatif(Object listKriteria[][] , int rowAlt1) {
        this.listKriteria = listKriteria;
        this.rowAlt = rowAlt1;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tb_alternatif = new javax.swing.JTable();
        btn_hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_alternatif.setColumnSelectionAllowed(true);
        tb_alternatif.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tb_alternatifPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tb_alternatif);
        tb_alternatif.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_hapus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void tb_alternatif(Object obj[][]){
        Object columns [] =new String[(obj.length/2)+2];
        String data [][] = new String[rowAlt][(obj.length/2)+2];
        System.out.print(rowAlt);
        for(int i = 0; i < obj.length;i++){
            for(int j = 0; j<obj[i].length;j++){
                if(j == 0){
                    columns[0] = "Nama Alternatif";
                    columns[i+1] = obj[i][0];
                }
            }
        }
       DefaultTableModel model = new DefaultTableModel(data,columns);
       tb_alternatif.setModel(model);
    }
    private void tb_alternatifPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tb_alternatifPropertyChange
        
    }//GEN-LAST:event_tb_alternatifPropertyChange

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        if (tb_alternatif.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) tb_alternatif.getModel();
            model.removeRow(tb_alternatif.getSelectedRow());
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_alternatif;
    // End of variables declaration//GEN-END:variables
}
