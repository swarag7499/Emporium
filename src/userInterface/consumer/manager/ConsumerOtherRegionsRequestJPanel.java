/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.consumer.manager;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.logistics.LogisticsManagerOrganization;
import business.userAccount.UserAccount;
import business.util.request.RequestItem;
import business.util.request.RequestStatus;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.ShortageWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arpit
 */
public class ConsumerOtherRegionsRequestJPanel extends javax.swing.JPanel {

    private JPanel mainPanel;
    private UserAccount account;
    private Organization organization;
    private Network network;
    private CollectionWorkRequest collectionWorkRequest;
    private String message;

    /**
     * Creates new form ConsumerOtherRegionsRequestJPanel
     */
    public ConsumerOtherRegionsRequestJPanel(JPanel mainPanel, CollectionWorkRequest collectionWorkRequest, Organization organization, UserAccount account, Network network, String message) {
        initComponents();
        this.mainPanel = mainPanel;
        this.collectionWorkRequest = collectionWorkRequest;
        this.account = account;
        this.organization = organization;
        this.network = network;
        this.message = message;

        populateShortageTable();
        populateRequestDetails();
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
        jScrollPane = new javax.swing.JScrollPane();
        tblShortage = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        btnAssign = new javax.swing.JButton();
        lblQuantity = new javax.swing.JLabel();
        lblRequestStatusVal = new javax.swing.JLabel();
        lblRequestStatus = new javax.swing.JLabel();
        lblRequestDateVal = new javax.swing.JLabel();
        lblRequestDate = new javax.swing.JLabel();
        lblRequestFromVal = new javax.swing.JLabel();
        lblRequestFrom = new javax.swing.JLabel();
        jScrollPaneRequestDetails = new javax.swing.JScrollPane();
        tblRequestDetails = new javax.swing.JTable();
        lblQuantityVal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(6, 36, 50));
        setMinimumSize(new java.awt.Dimension(1400, 1000));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(204, 204, 204));
        lblHeader.setText("Consumer Manager - Redirect Request");

        tblShortage.setBackground(new java.awt.Color(87, 92, 123));
        tblShortage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblShortage.setForeground(new java.awt.Color(255, 255, 255));
        tblShortage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "NGO Name", "Raised By(Manager Name)", "Assign to Employee", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblShortage);
        if (tblShortage.getColumnModel().getColumnCount() > 0) {
            tblShortage.getColumnModel().getColumn(0).setResizable(false);
            tblShortage.getColumnModel().getColumn(1).setResizable(false);
            tblShortage.getColumnModel().getColumn(2).setResizable(false);
            tblShortage.getColumnModel().getColumn(3).setResizable(false);
            tblShortage.getColumnModel().getColumn(4).setResizable(false);
        }

        btnBack.setBackground(new java.awt.Color(191, 149, 155));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jSeparator.setBackground(new java.awt.Color(204, 204, 204));

        btnAssign.setBackground(new java.awt.Color(191, 149, 155));
        btnAssign.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblQuantity.setBackground(new java.awt.Color(204, 204, 204));
        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(204, 204, 204));
        lblQuantity.setText("Food Quantity:");

        lblRequestStatusVal.setBackground(new java.awt.Color(204, 204, 204));
        lblRequestStatusVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestStatusVal.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestStatusVal.setText("<request_status>");

        lblRequestStatus.setBackground(new java.awt.Color(204, 204, 204));
        lblRequestStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestStatus.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestStatus.setText("Request status:");

        lblRequestDateVal.setBackground(new java.awt.Color(204, 204, 204));
        lblRequestDateVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestDateVal.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestDateVal.setText("<request_date>");

        lblRequestDate.setBackground(new java.awt.Color(204, 204, 204));
        lblRequestDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestDate.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestDate.setText("Request Date:");

        lblRequestFromVal.setBackground(new java.awt.Color(204, 204, 204));
        lblRequestFromVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestFromVal.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestFromVal.setText("<request_from>");

        lblRequestFrom.setBackground(new java.awt.Color(204, 204, 204));
        lblRequestFrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestFrom.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestFrom.setText("Request from:");

        tblRequestDetails.setBackground(new java.awt.Color(87, 92, 123));
        tblRequestDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblRequestDetails.setForeground(new java.awt.Color(255, 255, 255));
        tblRequestDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Type", "Hours to perish"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneRequestDetails.setViewportView(tblRequestDetails);

        lblQuantityVal.setBackground(new java.awt.Color(204, 204, 204));
        lblQuantityVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantityVal.setForeground(new java.awt.Color(204, 204, 204));
        lblQuantityVal.setText("<quantity>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(104, 104, 104)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblRequestFrom)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(lblRequestStatus)
                                                                .addGap(26, 26, 26))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblRequestDate)
                                                                .addGap(35, 35, 35)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(lblQuantity)
                                                            .addGap(33, 33, 33)))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblQuantityVal)
                                                        .addComponent(lblRequestDateVal)
                                                        .addComponent(lblRequestStatusVal)
                                                        .addComponent(lblRequestFromVal)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnBack)
                                                    .addGap(422, 422, 422)
                                                    .addComponent(btnAssign))))
                                        .addComponent(jScrollPaneRequestDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(92, 92, 92)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblHeader)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestFrom)
                    .addComponent(lblRequestFromVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestDate)
                    .addComponent(lblRequestDateVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestStatus)
                    .addComponent(lblRequestStatusVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(lblQuantityVal))
                .addGap(28, 28, 28)
                .addComponent(jScrollPaneRequestDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnAssign))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)))
                .addContainerGap(367, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainPanel.remove(this);
        CardLayout layout = (CardLayout) mainPanel.getLayout();

        int componentLength = mainPanel.getComponentCount();
        ConsumerSupplierRequestJPanel panel = (ConsumerSupplierRequestJPanel) mainPanel.getComponent(componentLength - 1);
        panel.populateTable();

        layout.previous(mainPanel);


    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = tblShortage.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a shortage request",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ShortageWorkRequest swr = (ShortageWorkRequest) tblShortage.getValueAt(selectedRow, 4);

        collectionWorkRequest.setDeliverTo(swr.getAssignToEmployee());
        collectionWorkRequest.setDeliverToConsumer(swr.getConsumerName());
        collectionWorkRequest.setMessage(message);
        collectionWorkRequest.setStatus(RequestStatus.getPickupStatusMessage(2));
        swr.setLinkedCollectionWorkRequest(collectionWorkRequest);
        swr.setStatus(RequestStatus.getShortageStatusMessage(2));

        // Adding to own queue
        account.getWorkQueue().getWorkRequestList().add(collectionWorkRequest);

        // Adding to Logistics Manager Organization queue
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof LogisticsManagerOrganization) {
                    o.getWorkQueue().getWorkRequestList().add(collectionWorkRequest);
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Request sucessfully redirected to another Consumer.", "Information", JOptionPane.INFORMATION_MESSAGE);
        btnAssign.setEnabled(false);
    }//GEN-LAST:event_btnAssignActionPerformed

    private void populateShortageTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblShortage.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr.getStatus().equals(RequestStatus.getShortageStatusMessage(1))) {
                if (wr instanceof ShortageWorkRequest) {
                    ShortageWorkRequest swr = (ShortageWorkRequest) wr;

                    Object row[] = new Object[5];
                    row[0] = swr.getRequestDate();
                    row[1] = swr.getSender().getEmployee().getName();
                    row[2] = swr.getConsumerName();
                    row[3] = swr.getAssignToEmployee();
                    row[4] = swr;

                    dtm.addRow(row);
                }
            }
        }
    }

    public void populateRequestDetails() {
        String status = collectionWorkRequest.getStatus();

        lblRequestStatusVal.setText(status);
        lblRequestFromVal.setText(collectionWorkRequest.getRaisedBySupplier());
        lblRequestDateVal.setText(collectionWorkRequest.getRequestDate() + "");
        lblQuantityVal.setText(collectionWorkRequest.getTotalQuantity() + " pounds");

        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblRequestDetails.getModel();
        dtm.setRowCount(0);

        for (RequestItem ri : collectionWorkRequest.getRequestItems()) {
            if (ri.getQuantity() > 0) {
                Object row[] = new Object[3];
                row[0] = ri;
                row[1] = ri.getQuantity();
                row[2] = ri.getDaysBeforeDisposal();

                dtm.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPaneRequestDetails;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityVal;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblRequestDateVal;
    private javax.swing.JLabel lblRequestFrom;
    private javax.swing.JLabel lblRequestFromVal;
    private javax.swing.JLabel lblRequestStatus;
    private javax.swing.JLabel lblRequestStatusVal;
    private javax.swing.JTable tblRequestDetails;
    private javax.swing.JTable tblShortage;
    // End of variables declaration//GEN-END:variables
}
