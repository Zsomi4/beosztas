/*
* File: MainModel.java
* Author: Gubis Zsombor Dániel
* Copyright: 2022, Gubis Zsombor Dániel 
* Group: Szoft_I_N
* Date: 2022-05-31
* Github: https://github.com/Zsomi4/
* Licenc: GNU GPL
*/
package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    
    Group[] groupArray = {
        new Group(1, "Takarító"),
        new Group(2, "Backend Fejlesztő"),
        new Group(3, "Rendszergazda"),
        new Group(4, "Frontend Fejlesztő"),
        new Group(5, "Karbantartó"),
        new Group(6, "Projektvezető"),
        new Group(7, "Ügyintéző"),
        new Group(8, "Műszerész"),
        new Group(9, "Marketinges"),
        new Group(10, "Igazgató"),
    };
    public Vector<Group> groupList = new Vector<>(Arrays.asList(groupArray));

    public Employer[] employerArray = {
        new Employer(1, "Kis Pista", 1),
        new Employer(2, "Cékla Mária", 2),
        new Employer(3, "Molnár Levente", 3),
        new Employer(4, "Buzta József", 4),
        new Employer(5, "Nagy Béla", 5),
        new Employer(6, "Szom Zsuzsanna", 6),
        new Employer(7, "Pikar Attila", 7),
        new Employer(8, "Nagy Zsombor", 8),
        new Employer(9, "Pincés Gábor", 9),
        new Employer(10, "Boros Laci", 10),
    };
    public Vector<Employer> employerList =
    new Vector<>(Arrays.asList(employerArray));
}
