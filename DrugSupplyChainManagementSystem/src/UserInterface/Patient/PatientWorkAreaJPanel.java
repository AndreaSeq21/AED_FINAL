/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Patient;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rutuja patil
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final UserAccount userAccount;
    private final Enterprise enterprise;
    private final Organization organization;
    private final EcoSystem business;
    
    public PatientWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.business = business;
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
        workContainer = new javax.swing.JPanel();
        mainMenu = new javax.swing.JPanel();
        btnViewImmunizationRecord = new javax.swing.JButton();
        lblPatient = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 102));

        workContainer.setBackground(new java.awt.Color(252, 208, 230));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        mainMenu.setBackground(new java.awt.Color(227, 102, 178));

        btnViewImmunizationRecord.setBackground(new java.awt.Color(0, 0, 102));
        btnViewImmunizationRecord.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnViewImmunizationRecord.setForeground(new java.awt.Color(255, 255, 255));
        btnViewImmunizationRecord.setText("View Immunization Record");
        btnViewImmunizationRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewImmunizationRecordActionPerformed(evt);
            }
        });

        lblPatient.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblPatient.setForeground(new java.awt.Color(0, 0, 102));
        lblPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatient.setText("PATIENT");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewImmunizationRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(lblPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblPatient)
                .addGap(93, 93, 93)
                .addComponent(btnViewImmunizationRecord)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(mainMenu);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewImmunizationRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewImmunizationRecordActionPerformed
        // TODO add your handling code here:
        PatientAdministeredVaccineListJPanel panel = new PatientAdministeredVaccineListJPanel(workContainer, (HospitalEnterprise)enterprise, userAccount);
        workContainer.add("AdministeredVaccineListJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnViewImmunizationRecordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewImmunizationRecord;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
