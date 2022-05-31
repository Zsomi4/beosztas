/*
* File: MainFrame.java
* Author: Gubis Zsombor Dániel
* Copyright: 2022, Gubis Zsombor Dániel 
* Group: Szoft_I_N
* Date: 2022-05-31
* Github: https://github.com/Zsomi4/
* Licenc: GNU GPL
*/
package views;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    public DefaultComboBoxModel<String> groupModel;
    public JComboBox<String> groupCombo;

    public DefaultListModel employerModel;
    public JList<String> employerList;
    JScrollPane scrollPane;
    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {
        this.groupModel = new DefaultComboBoxModel<>();
        this.groupCombo = new JComboBox<>(this.groupModel);

        employerModel = new DefaultListModel<>();
        employerList = new JList<>(employerModel);
        scrollPane = new JScrollPane(employerList);
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(this.groupCombo, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setTitle("Gubis Zsombor Dániel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
}