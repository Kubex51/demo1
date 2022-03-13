package com.example.demo;

import java.util.Date;

public class Person {
    private String Name;
    private String Surname;
    private Date dateOfBirth;
    private Qualifications qualifications;

    public Person(String name, Qualifications qualifications) {
        Name = name;
        this.qualifications = qualifications;
    }

    public Person(String name, String surname, Qualifications qualifications) {
        Name = name;
        Surname = surname;
        this.qualifications = qualifications;
    }

    public Person(String name, String surname, Date dateOfBirth, Qualifications qualifications) {
        Name = name;
        Surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.qualifications = qualifications;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Qualifications getQualifications() {
        return qualifications;
    }

    public void setQualifications(Qualifications qualifications) {
        this.qualifications = qualifications;
    }
}
