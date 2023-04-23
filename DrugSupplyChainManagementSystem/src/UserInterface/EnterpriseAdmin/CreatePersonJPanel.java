/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.EnterpriseAdmin;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.StateHealthDepartment;
import Business.NationalEnterprise.FDA;
import Business.NationalEnterprise.Distributor;
import Business.NationalEnterprise.Manufacturer;
import Business.Organization.FDAOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.ClinicOrganization;
import Business.Organization.medicalOrganization;
import Business.Person.Patient;
import Business.Person.Person;
import Business.Role.Role.RoleType;
import Business.Utils.WelcomeMail;
import java.awt.CardLayout;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author andrea sequeria
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;
    private final Enterprise enterprise;
    /**
     * Creates new form CreatePersonJPanel
     * @param workContainer
     * @param enterprise
     */
    public CreatePersonJPanel(JPanel workContainer, Enterprise enterprise) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        comboBoxDepartmentList.removeAllItems();
        populateDepartmentComboBox();
        lblClinicName.setVisible(false);
            txtClinicName.setVisible(false);
        if(enterprise instanceof HospitalEnterprise)
        {
            lblClinicName.setVisible(true);
            txtClinicName.setVisible(true);
        }
        
        
    }
    
    public void populateDepartmentComboBox(){
        
        for(Organization organize: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            comboBoxDepartmentList.addItem(organize);
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

        lbl1 = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txtDomain = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        btnAddPerson = new javax.swing.JButton();
        lblDepartment = new javax.swing.JLabel();
        comboBoxDepartmentList = new javax.swing.JComboBox();
        lblClinicName = new javax.swing.JLabel();
        txtClinicName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jDateDOB = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(252, 208, 230));

        lbl1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 102));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Create Person");
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFirstName.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(0, 0, 102));
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("First Name:");

        txtFirstName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblLastName.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(0, 0, 102));
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastName.setText("Last Name:");

        txtEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 102));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email:");

        lbl5.setText("@");

        txtDomain.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblPhone.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(0, 0, 102));
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhone.setText("Phone:");

        txtPhone.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblDateOfBirth.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        lblDateOfBirth.setForeground(new java.awt.Color(0, 0, 102));
        lblDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateOfBirth.setText("Date of Birth:");

        btnAddPerson.setBackground(new java.awt.Color(0, 0, 102));
        btnAddPerson.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAddPerson.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        lblDepartment.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        lblDepartment.setForeground(new java.awt.Color(0, 0, 102));
        lblDepartment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDepartment.setText("Department:");

        comboBoxDepartmentList.setBackground(new java.awt.Color(0, 0, 102));
        comboBoxDepartmentList.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        comboBoxDepartmentList.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxDepartmentList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxDepartmentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDepartmentListActionPerformed(evt);
            }
        });

        lblClinicName.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        lblClinicName.setForeground(new java.awt.Color(0, 0, 102));
        lblClinicName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblClinicName.setText("Clinic Name:");

        txtClinicName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtClinicName.setEnabled(false);

        btnBack.setBackground(new java.awt.Color(0, 0, 102));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lbl5)
                        .addGap(3, 3, 3)
                        .addComponent(txtDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(comboBoxDepartmentList, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddPerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblDateOfBirth)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jDateDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblClinicName, lblDateOfBirth, lblDepartment, lblEmail, lblFirstName, lblLastName, lblPhone});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDepartment)
                    .addComponent(comboBoxDepartmentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClinicName)
                    .addComponent(txtClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddPerson)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddPerson, comboBoxDepartmentList, lbl5, lblClinicName, lblDateOfBirth, lblDepartment, lblEmail, lblFirstName, lblLastName, lblPhone, txtClinicName, txtDomain, txtEmail, txtFirstName, txtLastName, txtPhone});

    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        try{
            
            String firstName = txtFirstName.getText();

            if(firstName.trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Please enter First Name");
                return;
            }
            boolean bFirstName = Pattern.matches("^[A-Za-z0-9 ]*$", firstName);
            if(!bFirstName){
                JOptionPane.showMessageDialog(this, "First name field should only have Alphanumeric characters. Special characters are not allowed. Please try again!");
                txtFirstName.setText("");
                return;
            }
            String lastName = txtLastName.getText();
            if(lastName.trim().equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter Last Name");
                return;
            }
            boolean bLastName = Pattern.matches("^[A-Za-z0-9 ]*$", lastName);
            if(!bLastName){
                JOptionPane.showMessageDialog(this, "Last name field should only have Alphanumeric characters. Special characters are not allowed. Please try again!");
                txtLastName.setText("");
                return;
            }
            
            String email = txtEmail.getText()+"@"+txtDomain.getText();
            boolean bEmail = Pattern.matches("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$", email);
        
            if(!bEmail){
                    JOptionPane.showMessageDialog(null, "Invalid email. Please try again!");
                    txtEmail.setText("");
                    txtDomain.setText("");
                    return;
            }
            long phone = Long.parseLong(txtPhone.getText());
            boolean bPhone = Pattern.matches("[0-9]{10}", Long.toString(phone));
            if(!bPhone){
                JOptionPane.showMessageDialog(this, "Cell Phone Number field should only have 10 digits (0-9). Alphabets and special characters are not allowed. Please try again!");
                txtPhone.setText("");
                return;
            }
            
            Date dob = jDateDOB.getDate();
            if (jDateDOB.getDate()== null )
            {
                   JOptionPane.showMessageDialog(null, "Enter your date of birth");
                   return;
            }
            Organization organize = (Organization)comboBoxDepartmentList.getSelectedItem();
            Person person = null;
            Patient patient = null;
            if(enterprise instanceof FDA){
                if(organize instanceof FDAOrganization){
                    person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.FDAEmployee);
                     WelcomeMail temp1 = new WelcomeMail(email, "Welcome!!", "Hi Your account was created successfully, Welcome!");
                    temp1.sendEmail();
                }
                if(organize instanceof medicalOrganization){
                    person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.MedicalOfficer);
                     WelcomeMail temp1 = new WelcomeMail(email, "Welcome!!", "Hi Your account was created successfully, Welcome!");
                    temp1.sendEmail();
                }
            }
            if(enterprise instanceof Manufacturer){
                person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.Manufacturer);
                 WelcomeMail temp1 = new WelcomeMail(email, "Welcome!!", "Hi Your account was created successfully, Welcome!");
                    temp1.sendEmail();
            }
            if(enterprise instanceof Distributor){
                person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.Distributor);
                 WelcomeMail temp1 = new WelcomeMail(email, "Welcome!!", "Hi Your account was created successfully, Welcome!");
                    temp1.sendEmail();
            }
            if(enterprise instanceof StateHealthDepartment){
                person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.StateHealthDepartment);
                 WelcomeMail temp1 = new WelcomeMail(email, "Welcome!!", "Hi Your account was created successfully, Welcome!");
                    temp1.sendEmail();
            }
            if(enterprise instanceof HospitalEnterprise){
                if(organize instanceof HospitalOrganization){
                    person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.Provider);
                     WelcomeMail temp1 = new WelcomeMail(email, "Welcome!!", "Hi Your account was created successfully, Welcome!");
                    temp1.sendEmail();
                }
                if(organize instanceof PatientOrganization){
                    patient = (Patient)organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.Patient);
                    WelcomeMail temp1 = new WelcomeMail(email, "Welcome!!", "Hi Your account was created successfully, Welcome!");
                    temp1.sendEmail();
                }
                if(organize instanceof ClinicOrganization){
                    person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.ClinicProvider);
                     WelcomeMail temp1 = new WelcomeMail(email, "Welcome!!", "Hi Your account was created successfully, Welcome!");
                    temp1.sendEmail();
                }
            }
            if(person!=null){
                person.setDateOfBirth(dob);
                person.setEmail(email);
                person.setPhone(phone);
            }
            if(patient!=null){
                patient.setDateOfBirth(dob);
                patient.setEmail(email);
                patient.setPhone(phone);
            }

            JOptionPane.showMessageDialog(null, "Person Added Successfully!");
            txtFirstName.setText("");
            txtLastName.setText("");
            txtPhone.setText("");    
            txtEmail.setText("");
            txtDomain.setText("");
            jDateDOB.setDate(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter data in all the fields and try again.");
            //return;
        }

    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void comboBoxDepartmentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDepartmentListActionPerformed
        // TODO add your handling code here:

        Organization organize =(Organization)comboBoxDepartmentList.getSelectedItem();
        if(organize ==  null)
        {
            return;
        }
        if(organize instanceof ClinicOrganization)
        {   ClinicOrganization satOrg = (ClinicOrganization)organize;
            txtClinicName.setText(satOrg.getClincName());
        }
        else
        return;

    }//GEN-LAST:event_comboBoxDepartmentListActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboBoxDepartmentList;
    private com.toedter.calendar.JDateChooser jDateDOB;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblClinicName;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTextField txtClinicName;
    private javax.swing.JTextField txtDomain;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
