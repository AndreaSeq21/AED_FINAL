
package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Disease.Disease;
import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Bhagyashri Chavan
 */
public class AddNewDrugInfoJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;
    private final EcoSystem business;
    
    /**
     * Creates new form AddNewVaccineInfoJPanel
     */
    public AddNewDrugInfoJPanel(JPanel workContainer, EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.business = business;
        populateDiseaseCombo();
        
    }
    
    private void populateDiseaseCombo(){
        comboBoxDiseaseList.removeAllItems();
        
        for(Disease disease : business.getDiseaseDirectory().getdiseaseDirectory())
        {
            comboBoxDiseaseList.addItem(disease);
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

        jDateLastUpdate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtDrugCode = new javax.swing.JTextField();
        txtDrugName = new javax.swing.JTextField();
        btnAddDrug = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboBoxDiseaseList = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(252, 208, 230));

        jDateLastUpdate.setDateFormatString(" MMM, d yyyy");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Last Updated on:");

        txtDrugCode.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        txtDrugName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        btnAddDrug.setBackground(new java.awt.Color(134, 134, 242));
        btnAddDrug.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        btnAddDrug.setText("Add Drug");
        btnAddDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrugActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Enter New Drug Details :");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Drug Code:");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Drug Name:");

        btnBack.setBackground(new java.awt.Color(134, 134, 242));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Disease:");

        comboBoxDiseaseList.setBackground(new java.awt.Color(134, 134, 242));
        comboBoxDiseaseList.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        comboBoxDiseaseList.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxDiseaseList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 162, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDrugCode)
                                                .addComponent(comboBoxDiseaseList, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnAddDrug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDateLastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 163, Short.MAX_VALUE))
                            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel5, jLabel6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(9, 9, 9)
                .addComponent(btnBack)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboBoxDiseaseList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDrugCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateLastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnAddDrug)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddDrug, comboBoxDiseaseList, jDateLastUpdate, txtDrugCode, txtDrugName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrugActionPerformed
        // TODO add your handling code here:
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        Pattern pattern2 = Pattern.compile("^[0-9]*");
        String vaccineCode = txtDrugCode.getText();
        if(vaccineCode.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter vaccine Code!");
            return;
        }
        String vaccineName = txtDrugName.getText();
        if(vaccineName.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter vaccine Name!");
            return;
        }
        
         if (!(pattern2.matcher(vaccineCode).matches())) {
            JOptionPane.showMessageDialog(null, "Please enter a valid vaccine code"); 
            return;
        } 
        
         if (!(pattern.matcher(vaccineName).matches())) {
            JOptionPane.showMessageDialog(null, "Please enter a valid vaccine Name");
            return;
        } 
        
         if (Integer.valueOf(vaccineCode) < 0) {
            JOptionPane.showMessageDialog(null, "vaccine code is negative");
            return;
        } 
        
          LocalDate dobValue = jDateLastUpdate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); // convert JDateChooser to LocalDate
            LocalDate today = LocalDate.now();
            
            if (dobValue == null) {
            JOptionPane.showMessageDialog(null, "Please enter your date.");
            return;
            }  else if (dobValue.isAfter(today)) {
                JOptionPane.showMessageDialog(null, "Invalid date. Date cannot be in the future.");
                return;
            } else if (dobValue.isEqual(today)) {
            JOptionPane.showMessageDialog(null, "Invalid date. Date cannot be today.");
            return;
            }  
        

        Date lastUpdatedDate = jDateLastUpdate.getDate();
        Disease disease = (Disease)comboBoxDiseaseList.getSelectedItem();

        for(Vaccine v : business.getVaccineDirectory().getVaccineCatalog())
        {
            if(v.getVaccineName().equalsIgnoreCase(vaccineName) && v.getVaccineCode().equalsIgnoreCase(vaccineCode))
            {
                JOptionPane.showMessageDialog(null, "Vaccine exists!");
                return;
            }
        }

        Vaccine vaccine = business.getVaccineDirectory().addNewVaccineDefinition();
        vaccine.setVaccineCode(vaccineCode);
        vaccine.setVaccineName(vaccineName);

        vaccine.setDisease(disease);

    }//GEN-LAST:event_btnAddDrugActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDrug;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboBoxDiseaseList;
    private com.toedter.calendar.JDateChooser jDateLastUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtDrugCode;
    private javax.swing.JTextField txtDrugName;
    // End of variables declaration//GEN-END:variables
}
