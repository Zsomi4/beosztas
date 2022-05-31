/*
* File: Employer.java
* Author: Gubis Zsombor Dániel
* Copyright: 2022, Gubis Zsombor Dániel 
* Group: Szoft_I_N
* Date: 2022-05-31
* Github: https://github.com/Zsomi4/
* Licenc: GNU GPL
*/
package models;

public class Employer {
    public int id;
    public String name;
    public int groupId;
    public Employer(int id, String name, int groupId) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
    }
 
}
