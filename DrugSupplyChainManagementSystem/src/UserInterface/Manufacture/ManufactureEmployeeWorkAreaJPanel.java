/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Manufacture;

import Business.EcoSystem;
import Business.NationalEnterprise.Manufacturer;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rutuja patil
 */
public class ManufactureEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufactureEmployeeWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final UserAccount userAccount;
    private final Manufacturer manufacturer;
    private final EcoSystem business;
    
    public ManufactureEmployeeWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,Manufacturer manufacturer,EcoSystem business  ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.manufacturer = manufacturer;
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainMenu = new javax.swing.JPanel();
        btnManufactureDrugProducts = new javax.swing.JButton();
        btnManageOrder = new javax.swing.JButton();
        lblManufacturer = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 102));
        jSplitPane1.setDividerLocation(210);

        workContainer.setBackground(new java.awt.Color(102, 153, 255));
        workContainer.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(252, 208, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Manufacture/MicrosoftTeams-image (6).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );

        workContainer.add(jPanel1, "card2");

        jSplitPane1.setRightComponent(workContainer);

        mainMenu.setBackground(new java.awt.Color(227, 102, 178));

        btnManufactureDrugProducts.setBackground(new java.awt.Color(0, 0, 102));
        btnManufactureDrugProducts.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnManufactureDrugProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnManufactureDrugProducts.setText("Manage Drug Products");
        btnManufactureDrugProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufactureDrugProductsActionPerformed(evt);
            }
        });

        btnManageOrder.setBackground(new java.awt.Color(0, 0, 102));
        btnManageOrder.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnManageOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrder.setText("Manage Orders");
        btnManageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrderActionPerformed(evt);
            }
        });

        lblManufacturer.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        lblManufacturer.setForeground(new java.awt.Color(0, 0, 102));
        lblManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturer.setText("MANUFACTURER");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManufactureDrugProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lblManufacturer)
                .addGap(80, 80, 80)
                .addComponent(btnManufactureDrugProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageOrder)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(mainMenu);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManufactureDrugProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufactureDrugProductsActionPerformed
        // TODO add your handling code here:
        ManageDrugsListJPanel panel = new ManageDrugsListJPanel(workContainer, manufacturer, business);
        workContainer.add("ManageVaccinesJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_btnManufactureDrugProductsActionPerformed

    private void btnManageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrderActionPerformed
        // TODO add your handling code here:
         ManageOrdersDetailsJPanel panel = new ManageOrdersDetailsJPanel(workContainer, manufacturer, userAccount, business);
        workContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnManageOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrder;
    private javax.swing.JButton btnManufactureDrugProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
