/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Manufacture;

import Business.EcoSystem;
import Business.NationalEnterprise.Manufacturer;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rutuja patil
 */
public class ManageOrdersDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersDetailsJPanel
     */
    
    private final JPanel workContainer;
    private final Manufacturer manufacturer;
    private final UserAccount userAccount;
    private final EcoSystem business;
    
    public ManageOrdersDetailsJPanel(JPanel workContainer, Manufacturer manufacturer, UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.manufacturer = manufacturer;
        this.userAccount = userAccount;
        this.business = business;
        populateOrderTable();
        populateProcessedOrderTable();
    }
    
    private void populateOrderTable(){
        
         DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblOrderDetails.getModel();
        defaulttabelmodel.setRowCount(0);
         ManufactureOrganization manufacureOrg = null;
         
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(WorkRequest workRequest : manufacureOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof VaccineOrderWorkRequest)
            {VaccineOrderWorkRequest vaccineOrderWR = (VaccineOrderWorkRequest)workRequest;
                
                Object[] row = new Object[4];
            
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getSender();
                row[2] = vaccineOrderWR.getReceiver();
                row[3] = vaccineOrderWR.getStatus();
                
                defaulttabelmodel.addRow(row);
            }
            }
        }
 
    }
        
    }
    
    
    private void populateProcessedOrderTable(){
        
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblOrderProcessed.getModel();
        defaulttabelmodel.setRowCount(0);
         ManufactureOrganization manufacureOrg = null;
         
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(WorkRequest workRequest : manufacureOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof VaccineOrderWorkRequest)
            {VaccineOrderWorkRequest vaccineOrderWR = (VaccineOrderWorkRequest)workRequest;
                if(vaccineOrderWR.getStatus().equals("Shipped"))
                {Object[] row = new Object[5];
            
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getSender();
                row[2] = vaccineOrderWR.getReceiver();
                row[3] = vaccineOrderWR.getStatus();
                row[4] = vaccineOrderWR.getShipdate();
                
                defaulttabelmodel.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        btnAssignOrder = new javax.swing.JButton();
        btnprocess = new javax.swing.JButton();
        btnRefresh1 = new javax.swing.JButton();
        lblOrderList = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderProcessed = new javax.swing.JTable();
        lblProcessedOrder = new javax.swing.JLabel();
        btnRefresh2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 208, 230));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Orders");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblOrderDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblOrderDetails);

        btnAssignOrder.setBackground(new java.awt.Color(0, 0, 102));
        btnAssignOrder.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAssignOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignOrder.setText("Assign to Me");
        btnAssignOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignOrderActionPerformed(evt);
            }
        });

        btnprocess.setBackground(new java.awt.Color(0, 0, 102));
        btnprocess.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnprocess.setForeground(new java.awt.Color(255, 255, 255));
        btnprocess.setText("Process order");
        btnprocess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocessActionPerformed(evt);
            }
        });

        btnRefresh1.setBackground(new java.awt.Color(0, 0, 102));
        btnRefresh1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh1.setText("Refresh");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        lblOrderList.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        lblOrderList.setForeground(new java.awt.Color(0, 0, 102));
        lblOrderList.setText("Orders From Distributor:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        tblOrderProcessed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblOrderProcessed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Sender", "Receiver", "Status", "Ship Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderProcessed.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblOrderProcessed);

        lblProcessedOrder.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        lblProcessedOrder.setForeground(new java.awt.Color(0, 0, 102));
        lblProcessedOrder.setText("Processed Orders:");

        btnRefresh2.setBackground(new java.awt.Color(0, 0, 102));
        btnRefresh2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRefresh2.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh2.setText("Refresh");
        btnRefresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssignOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnprocess))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblOrderList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProcessedOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh1)
                    .addComponent(lblOrderList))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignOrder)
                    .addComponent(btnprocess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProcessedOrder)
                    .addComponent(btnRefresh2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void btnAssignOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrderDetails.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        WorkRequest request = (WorkRequest)tblOrderDetails.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equalsIgnoreCase("Shipped") || request.getStatus().equalsIgnoreCase("Stored"))
         {
             JOptionPane.showMessageDialog(null, "Order already shipped!");
             return;
         }
        request.setReceiver(userAccount);
        request.setStatus("Assigned");
        populateOrderTable();
        
        
    }//GEN-LAST:event_btnAssignOrderActionPerformed

    private void btnprocessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrderDetails.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        
         VaccineOrderWorkRequest request = (VaccineOrderWorkRequest)tblOrderDetails.getValueAt(selectedRow, 0);
         
         if(request.getStatus().equalsIgnoreCase("Shipped") || request.getStatus().equalsIgnoreCase("Stored"))
         {
             JOptionPane.showMessageDialog(null, "Order already shipped!");
             return;
         }
         
         if(request.getReceiver() == null)
         {
             JOptionPane.showMessageDialog(null, "Please assign the work request first");
            return;
             
         }
        
         ProcessOrdersJPanel panel = new ProcessOrdersJPanel(workContainer, request,manufacturer, business );
        workContainer.add("ProcessOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
        
    }//GEN-LAST:event_btnprocessActionPerformed

    private void btnRefresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh2ActionPerformed
        // TODO add your handling code here:
        populateProcessedOrderTable();
    }//GEN-LAST:event_btnRefresh2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignOrder;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnRefresh2;
    private javax.swing.JButton btnprocess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblOrderList;
    private javax.swing.JLabel lblProcessedOrder;
    private javax.swing.JTable tblOrderDetails;
    private javax.swing.JTable tblOrderProcessed;
    // End of variables declaration//GEN-END:variables
}
