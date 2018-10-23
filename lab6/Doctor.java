package com.vitalik;

public class Doctor extends OperationsStaff {

    public String[] specialty;
    public String[] locations;

    public String[] getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String[] specialty) {
        this.specialty = specialty;
    }

    public String[] getLocations() {
        return locations;
    }

    public void setLocations(String[] locations) {
        this.locations = locations;
    }
}
