package com.controller;

import com.actions.Actions;
import com.model.Invoice;
import com.model.Item;
import com.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controller extends Actions {

    public View v;
    public List<Invoice> list;

    public Controller(View v, List<Invoice> list) {
        this.v = v;
        this.list = list;
        this.v.frame.setVisible(true);
        this.v.frame.setLocationRelativeTo(null);
        this.v.loadFileBtn.addActionListener(this);
        this.v.jTInvice.addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.v.loadFileBtn) {
            JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(this.v.frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                if (file.toString().indexOf("Invoice") > 0) {
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new FileReader(file));
                        String st;
                        while ((st = br.readLine()) != null) {
                            String[] customers = st.split(",");
                            this.list.add(new Invoice(Integer.parseInt(customers[0]), new SimpleDateFormat("dd-MM-yyyy").parse(customers[1]), customers[2]));
                            DefaultTableModel df = (DefaultTableModel) this.v.jTInvice.getModel();
                            df.addRow(new String[]{customers[0], customers[1], customers[2]});
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (file.toString().indexOf("it") > 0) {
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new FileReader(file));
                        String st;
                        List<Item> item = new ArrayList<Item>();
                        while ((st = br.readLine()) != null) {
                            String[] items = st.split(",");
                            item.add(new Item(Integer.parseInt(items[0]), items[1], Double.parseDouble(items[2]), Integer.parseInt(items[3])));
                            DefaultTableModel df = (DefaultTableModel) this.v.jtableItem.getModel();
                            df.addRow(new String[]{items[0], items[1], items[2], items[3]});
                        }
                        for (Invoice en : this.list) {
                            for (Item it : item) {
                                if (en.getNumber() == it.getItemNum()) {
                                    en.addItem(it);
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == this.v.jTInvice) {
            JTable source = (JTable) me.getSource();
            int row = source.rowAtPoint(me.getPoint());
            int column = source.columnAtPoint(me.getPoint());
            String s = source.getModel().getValueAt(row, 0) + "";
            int val = Integer.parseInt(s);
            int sum = 0;
            for (Invoice en : this.list) {
                if (en.getNumber() == val) {
                    List<Item> list = en.getItem();
                    for (Item t : list) {
                        sum += (t.getCount() * t.getItemPrice());
                    }
                }
            }
            DefaultTableModel df = (DefaultTableModel) this.v.jTInvice.getModel();
            df.setValueAt(sum, row, 3);
        }

    }

}
