/*
* File: MainController.java
* Author: Gubis Zsombor Dániel
* Copyright: 2022, Gubis Zsombor Dániel 
* Group: Szoft_I_N
* Date: 2022-05-31
* Github: https://github.com/Zsomi4/
* Licenc: GNU GPL
*/
package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainModel.groupList.forEach(group ->{
            this.mainFrame.groupModel.addElement(group.post);            
        });
        this.setEvents();
    }
    private void setEvents() {
        this.mainFrame.groupCombo.addActionListener(e -> onActionGroupCombo());
    }
    private void onActionGroupCombo() {
        int index = this.mainFrame.groupCombo.getSelectedIndex();
        int selectedGroupId = index + 1;
        int groupId = index + 1;
        mainFrame.employerModel.clear();
        mainModel.employerList.forEach(employer -> {
            if(selectedGroupId == employer.groupId) {
                mainFrame.employerModel.addElement(employer.name);
            }
        });
    }
    
}