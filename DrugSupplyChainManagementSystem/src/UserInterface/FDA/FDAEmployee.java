/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FDA;

import Business.EcoSystem;
import Business.NationalEnterprise.FDA;
import Business.Organization.FDAOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author andrea sequeria
 */
public class FDAEmployee extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final FDA cdc;
    private final UserAccount userAccount;
    private FDAOrganization cdcOrg;
    private final EcoSystem business;
    
    /**
     * Creates new form CDCEmployee
     * @param userProcessContainer
     * @param userAccount
     * @param cdc
     * @param cdcOrg
     * @param business
     */
    public FDAEmployee(JPanel userProcessContainer,UserAccount userAccount, FDA cdc,FDAOrganization cdcOrg,EcoSystem business ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.cdc = cdc;
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
        mainMenu = new javax.swing.JPanel();
        btnOrderMedicine = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        btnManageOrder = new javax.swing.JButton();
        workContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 102));
        jSplitPane1.setDividerLocation(200);

        mainMenu.setBackground(new java.awt.Color(227, 102, 178));

        btnOrderMedicine.setBackground(new java.awt.Color(0, 0, 102));
        btnOrderMedicine.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnOrderMedicine.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderMedicine.setText("Order Medicine");
        btnOrderMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrderMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderMedicineActionPerformed(evt);
            }
        });

        lblMenu.setBackground(new java.awt.Color(0, 0, 102));
        lblMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(0, 0, 102));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Main Menu");

        btnManageOrder.setBackground(new java.awt.Color(0, 0, 102));
        btnManageOrder.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnManageOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrder.setText("Manage Orders");
        btnManageOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManageOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(btnOrderMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblMenu)
                .addGap(42, 42, 42)
                .addComponent(btnOrderMedicine)
                .addGap(38, 38, 38)
                .addComponent(btnManageOrder)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(mainMenu);

        workContainer.setBackground(new java.awt.Color(252, 208, 230));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderMedicineActionPerformed
        // TODO add your handling code here:
        PlaceDrugOrder panel = new PlaceDrugOrder(workContainer, cdc, business, cdcOrg,userAccount);
        workContainer.add("CreateVaccineOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnOrderMedicineActionPerformed

    private void btnManageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrderActionPerformed
        // TODO add your handling code here:
        ManageOrder panel = new ManageOrder(workContainer,userAccount, business, cdc, cdcOrg);
        workContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnManageOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrder;
    private javax.swing.JButton btnOrderMedicine;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
