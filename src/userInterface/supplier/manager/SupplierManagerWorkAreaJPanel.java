/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.supplier.manager;

import business.enterprise.Enterprise;
import business.organization.Organization;
import business.role.Role.RoleType;
import business.userAccount.UserAccount;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rebeccabiju
 */
public class SupplierManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel mainPanel;
    private UserAccount account;
    private Enterprise enterprise;

    /**
     * Creates new form SupplierManagerWorkAreaJPanel
     */
    public SupplierManagerWorkAreaJPanel(JPanel mainPanel, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.mainPanel = mainPanel;
        this.enterprise = enterprise;
        this.account = account;

        populateLoginDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblWastageValue = new javax.swing.JLabel();
        lblWastage = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        btnEmployeeReports = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Supplier Manager Work Area");

        lblName.setText("Welcome, ");

        lblWastageValue.setText("<wastage_avoided>");

        lblWastage.setText("Total wastage avoided :");

        btnLog.setText("View Request Log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnEmployeeReports.setText("View Employee Wastage Avoided");
        btnEmployeeReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(475, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWastage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblWastageValue, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(512, 512, 512))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(573, 573, 573)
                        .addComponent(lblName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmployeeReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEmployeeReports, btnLog, lblName, lblWastage, lblWastageValue});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeader)
                .addGap(48, 48, 48)
                .addComponent(lblName)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWastage)
                    .addComponent(lblWastageValue))
                .addGap(53, 53, 53)
                .addComponent(btnLog)
                .addGap(18, 18, 18)
                .addComponent(btnEmployeeReports, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEmployeeReports, btnLog, lblName, lblWastage, lblWastageValue});

    }// </editor-fold>//GEN-END:initComponents

    private void populateLoginDetails() {
        double quantity = 0;
        lblName.setText(lblName.getText() + " " + account.getEmployee().getName());
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                if ((ua.getRole().getRoleType().getValue()).equals(RoleType.SupplierWorker.getValue())) {
                    for (WorkRequest wr : ua.getWorkQueue().getWorkRequestList()) {
                        CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                        quantity += cwr.getTotalQuantity();
                    }
                }
            }
        }
        lblWastageValue.setText(quantity + " pounds");
    }

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        SupplierManagerViewRequestLogJPanel supplierManagerViewRequestLogJPanel = new SupplierManagerViewRequestLogJPanel(mainPanel, enterprise);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        mainPanel.add("SupplierWorkerViewRequestLogJPanel", supplierManagerViewRequestLogJPanel);
        layout.next(mainPanel);
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnEmployeeReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeReportsActionPerformed
        SupplierManagerViewEmployeeWastageAvoidedRecords supplierManagerViewEmployeeWastageAvoidedRecords = new SupplierManagerViewEmployeeWastageAvoidedRecords(mainPanel, enterprise);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        mainPanel.add("SupplierManagerViewEmployeeWastageAvoidedRecords", supplierManagerViewEmployeeWastageAvoidedRecords);
        layout.next(mainPanel);
    }//GEN-LAST:event_btnEmployeeReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmployeeReports;
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWastage;
    private javax.swing.JLabel lblWastageValue;
    // End of variables declaration//GEN-END:variables
}
