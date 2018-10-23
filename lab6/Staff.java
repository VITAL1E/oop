package com.vitalik;

public class Staff extends Person {

    public Date joined;
    public String[] education;
    public String[] certification;
    public String[] languages;

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }

    public String[] getCertification() {
        return certification;
    }

    public void setCertification(String[] certification) {
        this.certification = certification;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
