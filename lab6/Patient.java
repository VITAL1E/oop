package com.vitalik;

public class Patient extends Person {
    public String id;
    public Fullname name;
    public Gender gender;
    public Date birthDate;
    public Integer age;
    public Date accepted;
    public History sickness;
    public String[] prescriptions;
    public String[] allergies;
    public String[] specialReqs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Fullname getName() {
        return name;
    }

    @Override
    public void setName(Fullname name) {
        this.name = name;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getAccepted() {
        return accepted;
    }

    public void setAccepted(Date accepted) {
        this.accepted = accepted;
    }

    public History getSickness() {
        return sickness;
    }

    public void setSickness(History sickness) {
        this.sickness = sickness;
    }

    public String[] getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String[] prescriptions) {
        this.prescriptions = prescriptions;
    }

    public String[] getAllergies() {
        return allergies;
    }

    public void setAllergies(String[] allergies) {
        this.allergies = allergies;
    }

    public String[] getSpecialReqs() {
        return specialReqs;
    }

    public void setSpecialReqs(String[] specialReqs) {
        this.specialReqs = specialReqs;
    }
}


