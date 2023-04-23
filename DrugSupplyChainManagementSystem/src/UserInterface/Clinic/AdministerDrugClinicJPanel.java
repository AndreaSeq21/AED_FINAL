/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Clinic;

import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;

import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.ClinicOrganization;
import Business.Person.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Bhagyashri Chavan
 */
public class AdministerDrugClinicJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdministerDrugClinicJPanel
     */
    private final JPanel workContainer;

    private final HospitalEnterprise hospital;
    private final UserAccount userAccount;
    private final ClinicOrganization clinicOrg;
    private final EcoSystem business;
    private final StateNetwork state;
    
    public AdministerDrugClinicJPanel(JPanel workContainer, HospitalEnterprise hospital,ClinicOrganization clinicOrg,UserAccount userAccount , EcoSystem business, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.hospital = hospital;
        this.business = business;
        this.clinicOrg = clinicOrg;
        this.state = state;
        populatepatientJComboBox();
   
    }
    
    private void populateInsurerJCombo(){

    }
    
     private void populatepatientJComboBox(){
        
        comboBoxPatientList.removeAllItems();
      
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof PatientOrganization)
            {
                PatientOrganization patientOrg = (PatientOrganization)org;
                for(Person p : patientOrg.getPersonDirectory().getPeopleList())
                {
                    if(p instanceof Patient)
                    {
                        Patient patient = (Patient) p;
                        comboBoxPatientList.addItem(patient);
                    }
                    
                }
            }
            
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

        lblTitle = new javax.swing.JLabel();
        lblPatient = new javax.swing.JLabel();
        comboBoxPatientList = new javax.swing.JComboBox();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        Separator1 = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 208, 230));

        lblTitle.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Administer Medicine");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPatient.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        lblPatient.setForeground(new java.awt.Color(0, 0, 102));
        lblPatient.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatient.setText("Patient:");

        comboBoxPatientList.setBackground(new java.awt.Color(0, 0, 102));
        comboBoxPatientList.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        comboBoxPatientList.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxPatientList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPatientListActionPerformed(evt);
            }
        });

        lblFirstName.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(0, 0, 102));
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("First Name:");

        lblLastName.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(0, 0, 102));
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastName.setText("Last Name:");

        lblEmail.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 102));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email:");

        lblPhone.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(0, 0, 102));
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhone.setText("Phone:");

        lblDOB.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(0, 0, 102));
        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDOB.setText("Date of Birth:");

        txtFirstName.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtFirstName.setEnabled(false);

        txtLastName.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtLastName.setEnabled(false);

        txtEmail.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtEmail.setEnabled(false);

        txtPhone.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtPhone.setEnabled(false);

        txtDOB.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtDOB.setEnabled(false);

        Separator1.setBackground(new java.awt.Color(0, 0, 102));
        Separator1.setForeground(new java.awt.Color(0, 0, 102));

        btnNext.setBackground(new java.awt.Color(0, 0, 102));
        btnNext.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxPatientList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDOB, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLastName)
                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtDOB))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addGap(26, 26, 26))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Separator1))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDOB, lblEmail, lblFirstName, lblLastName, lblPatient, lblPhone});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxPatientList, txtDOB, txtEmail, txtFirstName, txtLastName, txtPhone});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPatient)
                        .addComponent(comboBoxPatientList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDOB)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(lblLastName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblPhone)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNext, comboBoxPatientList, lblDOB, lblEmail, lblFirstName, lblLastName, lblPatient, lblPhone, txtDOB, txtEmail, txtFirstName, txtLastName, txtPhone});

    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPatientListActionPerformed
        // TODO add your handling code here:
         Patient patient = (Patient)comboBoxPatientList.getSelectedItem();
        if(patient == null)
        {
            return;
        }
        
        txtFirstName.setText(patient.getFirstName());
        txtLastName.setText(patient.getLastName());
        txtEmail.setText(patient.getEmail());
        txtPhone.setText(String.valueOf(patient.getPhone()));
        txtDOB.setText(String.valueOf(patient.getDateOfBirth()));
        

    }//GEN-LAST:event_comboBoxPatientListActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:

        try{
        Patient patient = (Patient)comboBoxPatientList.getSelectedItem();
        if(patient == null)
        {
            return;
        }
        
        
        AdministerDrugToPatientClinicJPanel panel = new AdministerDrugToPatientClinicJPanel(workContainer, hospital, clinicOrg, userAccount, business, patient, state);
        workContainer.add("AdministerVaccineToPatientSatelliteClinicJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
 
        }
  
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Only Numberic Value allowed for amount !");
            //return;
        }
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator1;
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox comboBoxPatientList;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
