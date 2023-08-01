package com.cc.java;

public class Person {

    private String familyName;
    private String firstName;
    private int birthYear;

    public Person(String familyName, String firstName, int birthYear) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

}