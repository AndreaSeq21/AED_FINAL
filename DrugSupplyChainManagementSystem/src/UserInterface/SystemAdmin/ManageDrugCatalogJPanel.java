

package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhagyashri Chavan
 */
public class ManageDrugCatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugCatalogJPanel
     */
     private final JPanel workContainer;
    private final EcoSystem business;
    
    public ManageDrugCatalogJPanel(JPanel workContainer, EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.business = business;
        populateTable();
    }
    
    private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblDrugDetails.getModel();
        model.setRowCount(0);
        
        for(Vaccine vaccine : business.getVaccineDirectory().getVaccineCatalog())
        {
            Object[] row = new Object[2];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineName();
            model.addRow(row);
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
        tblDrugDetails = new javax.swing.JTable();
        btnAddDrug = new javax.swing.JButton();
        btnRemoveDrug = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 208, 230));

        lblTitle.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Drug Catalog");

        tblDrugDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblDrugDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Code", "Drug Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDrugDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDrugDetails);
        if (tblDrugDetails.getColumnModel().getColumnCount() > 0) {
            tblDrugDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDrugDetails.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAddDrug.setBackground(new java.awt.Color(134, 134, 242));
        btnAddDrug.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        btnAddDrug.setText("Add Drug");
        btnAddDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrugActionPerformed(evt);
            }
        });

        btnRemoveDrug.setBackground(new java.awt.Color(134, 134, 242));
        btnRemoveDrug.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        btnRemoveDrug.setText("Remove Drug");
        btnRemoveDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDrugActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(134, 134, 242));
        btnRefresh.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
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
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRefresh)))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemoveDrug)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddDrug)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDrug)
                    .addComponent(btnRemoveDrug))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDrugActionPerformed
        // TODO add your handling code here:
        
         int row = tblDrugDetails.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a Vaccine from table");
            return;
        }
        
        Vaccine vaccine = (Vaccine)tblDrugDetails.getValueAt(row, 0);
        business.getVaccineDirectory().removeVaccineDefinition(vaccine);
        populateTable();
        
    }//GEN-LAST:event_btnRemoveDrugActionPerformed

    private void btnAddDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrugActionPerformed
        // TODO add your handling code here:
      
        AddNewDrugInfoJPanel panel = new AddNewDrugInfoJPanel(workContainer, business);
        workContainer.add("AddNewVaccineInfoJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnAddDrugActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDrug;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemoveDrug;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblDrugDetails;
    // End of variables declaration//GEN-END:variables
}
