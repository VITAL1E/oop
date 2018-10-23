package com.vitalik;
import java.util.ArrayList;

public class Hospital {
    private String name;
    private Address address;
    private Phone phone;

    private ArrayList<Department> departments = new ArrayList<>();

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }
}
