/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FDA;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.NationalEnterprise.FDA;
import Business.Network.CityNetwork;
import Business.Organization.FDAOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author andrea sequeria
 */
public class DrugProviderDistributionJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;
    private final UserAccount userAccount;
    private final EcoSystem business;
    private final FDA cdcEnterprise;
    private final FDAOrganization cdcOrg;
    private final CityNetwork city;
    
    /**
     * Creates new form VaccineProviderDistributionJPanel
     * @param workContainer
     * @param userAccount
     * @param business
     * @param cdcEnterprise
     * @param cdcOrg
     * @param city
     */
    public DrugProviderDistributionJPanel(JPanel workContainer, UserAccount userAccount,EcoSystem business,FDA cdcEnterprise,FDAOrganization cdcOrg,CityNetwork city) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise = cdcEnterprise;
        this.cdcOrg = cdcOrg;
        this.city = city;
        txtCityName.setText(city.getName());
        populateTable();
        
        
        
    }
    
    
    private void populateTable(){
         DefaultTableModel model = (DefaultTableModel) tblDistributionDetails.getModel();
        model.setRowCount(0);
        if(business.getStateList() != null)
        {
            for(Enterprise enterprise: city.getEnterpriseDirectory().getEnterpriseDirectory())
            {
                if(enterprise instanceof HospitalEnterprise)
                {HospitalEnterprise hospEnterprise =(HospitalEnterprise)enterprise;
                    Object[] row = new Object[3];
                    row[0]= hospEnterprise;
                    for(Organization org: hospEnterprise.getOrganizationDirectory().getOrganizationList())
                    {
                        if(org instanceof HospitalOrganization)
                        {HospitalOrganization hospOrg = (HospitalOrganization)org;
                            row[1]=hospOrg.getClinic().getTotalStoredVaccines();
                            
                            model.addRow(row);
                        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDistributionDetails = new javax.swing.JTable();
        lblCity = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 208, 230));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Drug Distribution in City");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDistributionDetails.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        tblDistributionDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Provider", "Total Drugs Distributed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDistributionDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDistributionDetails);

        lblCity.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCity.setForeground(new java.awt.Color(0, 0, 102));
        lblCity.setText("City:");

        txtCityName.setEnabled(false);

        btnBack.setBackground(new java.awt.Color(0, 0, 102));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblDistributionDetails;
    private javax.swing.JTextField txtCityName;
    // End of variables declaration//GEN-END:variables
}
