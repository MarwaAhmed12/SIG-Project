/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class View {

    public JFrame frame = new JFrame();
    public JButton btnCancel = new JButton();
    public JButton btnSave = new JButton();
    public JButton delIn = new JButton();
    public JButton inBtn = new JButton();
    public JLabel jLabel1 = new JLabel();
    public JLabel jLabel2 = new JLabel();
    public JLabel jLabel3 = new JLabel();
    public JLabel jLabel4 = new JLabel();
    public JLabel jLabel5 = new JLabel();
    public JMenu jMenu = new JMenu();
    public JMenuBar jMenuBar1 = new JMenuBar();
    public JScrollPane jScrollPane1 = new JScrollPane();
    public JScrollPane jScrollPane2 = new JScrollPane();
    public JTable jTInvice = new JTable(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "No.", "Date", "Customer", "Total"
            }
    ));
    public JTextField jTextField1 = new JTextField();
    public JTextField jTextField2 = new JTextField();
    public JTable jtableItem = new JTable(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "No.", "Item Name", "Item Price", "Count"
            }
    ));
    public JLabel labNum = new JLabel();
    public JLabel labTotal = new JLabel();
    public JMenuItem loadFileBtn = new JMenuItem();
    public JMenuItem saveFileBtn = new JMenuItem();

    public View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new java.awt.Dimension(900, 620));

        jLabel1.setText("Invoice");

        jScrollPane1.setViewportView(jTInvice);

        inBtn.setText("Create New Invoice");

        delIn.setText("Delete Invoice");
        delIn.setToolTipText("");

        jLabel2.setText("Invoice Number :");

        jLabel3.setText("Invoice Date");

        jLabel4.setText("Customer Number");

        jLabel5.setText("Invoice Total");

        jScrollPane2.setViewportView(jtableItem);

        btnSave.setText("Save");

        btnCancel.setText("Cancel");

        jMenu.setText("File");

        loadFileBtn.setText("Load File");
        jMenu.add(loadFileBtn);

        saveFileBtn.setText("Save File");
        jMenu.add(saveFileBtn);

        jMenuBar1.add(jMenu);

        frame.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5))
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(labTotal)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(labNum))
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 142, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(inBtn)
                                .addGap(56, 56, 56)
                                .addComponent(delIn)
                                .addGap(159, 159, 159)
                                .addComponent(btnSave)
                                .addGap(114, 114, 114)
                                .addComponent(btnCancel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(labNum))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(labTotal))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(delIn)
                                        .addComponent(inBtn)
                                        .addComponent(btnSave)
                                        .addComponent(btnCancel))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        frame.pack();
    }

}
