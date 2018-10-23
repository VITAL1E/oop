package com.vitalik;

import java.util.ArrayList;

public class Department {

    private ArrayList<Staff> staffList = new ArrayList<Staff>();

    public void addStaff(Staff s) {
        staffList.add(s);
    }
}
