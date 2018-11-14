/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.mainframe;

import Business.TravelAgent;
import Business.airlinerclass;
import Business.airlinerdirectory;
import Interface.flight.viewflightsJPanel;
import java.awt.CardLayout;
import java.util.function.Supplier;
import javax.swing.JPanel;

/**
 *
 * @author Pranjal
 */
public class ManageFlightsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFlightsJPanel
     */
    private JPanel userprocesscontainer;
    private airlinerdirectory ad;
    private TravelAgent ta;
    public ManageFlightsJPanel(JPanel userprocesscontainer, airlinerdirectory ad, TravelAgent ta) {
        initComponents();
        this.userprocesscontainer=userprocesscontainer;
        this.ad=ad;
        this.ta=ta;
        populateComboBox();

    }
    
    private void populateComboBox(){
        for(airlinerclass airlin: ad.getairlinerDict()){
            airlinercombobox.addItem(airlin.getAirlinerName());
        }
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
        airlinercombobox = new javax.swing.JComboBox<>();
        Selectbtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        jLabel1.setText("Airliner");

        airlinercombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinercomboboxActionPerformed(evt);
            }
        });

        Selectbtn.setText("Select");
        Selectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectbtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addComponent(airlinercombobox, 0, 158, Short.MAX_VALUE)
                .addGap(216, 216, 216))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Selectbtn)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BackBtn)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(airlinercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(Selectbtn)
                .addGap(131, 131, 131)
                .addComponent(BackBtn)
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SelectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectbtnActionPerformed
        // TODO add your handling code here:
        String airlinername=(String) airlinercombobox.getSelectedItem();
        airlinerclass a1=null;
        for(airlinerclass airlin: ad.getairlinerDict())
            if(airlin.getAirlinerName().equals(airlinername)){
            a1=airlin;
            }
                
        viewflightsJPanel vfjp = new viewflightsJPanel(userprocesscontainer, a1,ta);
        userprocesscontainer.add("viewflightsJPanel",vfjp);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);
                                          
    }//GEN-LAST:event_SelectbtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        userprocesscontainer.remove(this);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.previous(userprocesscontainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void airlinercomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinercomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinercomboboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton Selectbtn;
    private javax.swing.JComboBox<String> airlinercombobox;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
