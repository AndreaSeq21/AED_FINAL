/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.StateHealthDepartment;

import Business.EcoSystem;
import Business.Enterprise.StateHealthDepartment;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.SHDImmuneOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrea sequeria
 */
public class OrderApprovalDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderApprovalDetailsJPanel
     */
    private final JPanel workContainer;
    private final UserAccount userAccount;
    private final StateHealthDepartment enterprise;
    private final SHDImmuneOrganization phdOrg;
    private final EcoSystem business;
    private final StateNetwork state;
    
    public OrderApprovalDetailsJPanel(JPanel workContainer, UserAccount userAccount, StateHealthDepartment enterprise,SHDImmuneOrganization phdOrg, StateNetwork state,EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.phdOrg = phdOrg;
        this.business = business;
        this.state = state;
        populateOrderTable();
    }
    
    
    private void populateOrderTable(){
        
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblOrderDetails.getModel();
        defaulttabelmodel.setRowCount(0);
        
         SHDImmuneOrganization pOrg = null;
         
        for(Organization organize : enterprise.getOrganizationDirectory().getOrganizationList())
        {   if(organize instanceof SHDImmuneOrganization)
        {   pOrg = (SHDImmuneOrganization)organize;
            for(WorkRequest workRequest : pOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof ProviderVaccineOrderWorkRequest)
            {ProviderVaccineOrderWorkRequest vaccineOrderWR = (ProviderVaccineOrderWorkRequest)workRequest;
                
                Object[] rowData = new Object[5];
                rowData[0] = vaccineOrderWR;
                rowData[1] = vaccineOrderWR.getEnterprise();
                rowData[2] = vaccineOrderWR.getSender();
                rowData[3] = vaccineOrderWR.getStatus();
                rowData[4] = vaccineOrderWR.getPhdApprovedBy();
                
                defaulttabelmodel.addRow(rowData);
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
        tblOrderDetails = new javax.swing.JTable();
        btnViewAndApprove = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 208, 230));

        lblTitle.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Approve Orders from Providers");

        tblOrderDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Provider", "Sender", "Status", "Approved By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblOrderDetails);

        btnViewAndApprove.setBackground(new java.awt.Color(0, 0, 102));
        btnViewAndApprove.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnViewAndApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAndApprove.setText("View Details and Approve");
        btnViewAndApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAndApproveActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 0, 102));
        btnRefresh.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewAndApprove, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewAndApprove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAndApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAndApproveActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblOrderDetails.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        
         ProviderVaccineOrderWorkRequest request = (ProviderVaccineOrderWorkRequest)tblOrderDetails.getValueAt(selectedRow, 0);
        
        
        
         ViewOrderDetailsJPanel panel = new ViewOrderDetailsJPanel(workContainer, userAccount, enterprise,phdOrg, state, business, request);
        workContainer.add("OrderApprovalsJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnViewAndApproveActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewAndApprove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrderDetails;
    // End of variables declaration//GEN-END:variables
}
