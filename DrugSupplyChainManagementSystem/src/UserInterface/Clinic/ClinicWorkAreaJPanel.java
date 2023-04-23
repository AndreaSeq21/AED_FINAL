/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Clinic;

import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.StateNetwork;
import Business.Organization.ClinicOrganization;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author Bhagyashri Chavan
 */
public class ClinicWorkAreaJPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final UserAccount userAccount;
    private final HospitalEnterprise enterprise;
    private final ClinicOrganization organization;
    private final EcoSystem business;
    private final StateNetwork state;
    /**
     * Creates new form ClinicWorkAreaJPanel
     * @param userProcessContainer
     * @param userAccount
     * @param enterprise
     * @param organization
     * @param business
     * @param state
     */
    
    
    public ClinicWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, HospitalEnterprise enterprise, ClinicOrganization organization,EcoSystem business,StateNetwork state) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.business = business;
        this.state = state;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        mainMenujPanel = new javax.swing.JPanel();
        btnPlaceMedicineOrder = new javax.swing.JButton();
        btnAdministerMedicine = new javax.swing.JButton();
        btnNewPatient = new javax.swing.JButton();
        lblClinic = new javax.swing.JLabel();
        workContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 102));
        jSplitPane1.setDividerLocation(170);

        mainMenujPanel.setBackground(new java.awt.Color(227, 102, 178));

        btnPlaceMedicineOrder.setBackground(new java.awt.Color(0, 0, 102));
        btnPlaceMedicineOrder.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnPlaceMedicineOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceMedicineOrder.setText("Place Medicine Order");
        btnPlaceMedicineOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlaceMedicineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceMedicineOrderActionPerformed(evt);
            }
        });

        btnAdministerMedicine.setBackground(new java.awt.Color(0, 0, 102));
        btnAdministerMedicine.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAdministerMedicine.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministerMedicine.setText("Administer Medicine");
        btnAdministerMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministerMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministerMedicineActionPerformed(evt);
            }
        });

        btnNewPatient.setBackground(new java.awt.Color(0, 0, 102));
        btnNewPatient.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnNewPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnNewPatient.setText("Register New Patient");
        btnNewPatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPatientActionPerformed(evt);
            }
        });

        lblClinic.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblClinic.setForeground(new java.awt.Color(0, 0, 102));
        lblClinic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClinic.setText("CLINIC");

        javax.swing.GroupLayout mainMenujPanelLayout = new javax.swing.GroupLayout(mainMenujPanel);
        mainMenujPanel.setLayout(mainMenujPanelLayout);
        mainMenujPanelLayout.setHorizontalGroup(
            mainMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenujPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClinic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlaceMedicineOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdministerMedicine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenujPanelLayout.setVerticalGroup(
            mainMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenujPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblClinic)
                .addGap(57, 57, 57)
                .addComponent(btnPlaceMedicineOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdministerMedicine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNewPatient)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(mainMenujPanel);

        workContainer.setBackground(new java.awt.Color(204, 204, 255));
        workContainer.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(102, 204, 0));
        workContainer.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(workContainer);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceMedicineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceMedicineOrderActionPerformed
        // TODO add your handling code here:

        PlaceDrugOrderClinicJPanel panel = new PlaceDrugOrderClinicJPanel(workContainer, enterprise, organization, userAccount, business, state);
        workContainer.add("PlaceVaccineOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnPlaceMedicineOrderActionPerformed

    private void btnAdministerMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministerMedicineActionPerformed
        // TODO add your handling code here:
        AdministerDrugClinicJPanel panel = new AdministerDrugClinicJPanel(workContainer, enterprise, organization, userAccount, business, state);
        workContainer.add("AdministerVaccineJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnAdministerMedicineActionPerformed

    private void btnNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPatientActionPerformed
        // TODO add your handling code here:
        RegisterNewPatientJPanel panel = new RegisterNewPatientJPanel(workContainer, enterprise, organization, userAccount, business);
        workContainer.add("RegisterNewPatientJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnNewPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministerMedicine;
    private javax.swing.JButton btnNewPatient;
    private javax.swing.JButton btnPlaceMedicineOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblClinic;
    private javax.swing.JPanel mainMenujPanel;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
