package com.cc.java;

import java.time.Year;

public class Mitarbeiter {

    private String familyName;
    private String firstName;
    private int birthYear;
    protected final String workID;
    protected String department;
    protected String role;
    protected final int hiredYear;

    public Mitarbeiter(String familyName, String firstName, int birthYear,
            String workID, String department, String role, int hiredYear) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.workID = workID;
        this.department = department;
        this.role = role;
        this.hiredYear = hiredYear;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    protected void hasLunch() {
        output("Hi, I'm " + getFirstName() +
                " and I'm having Lunch!");
    }

    protected void startsWork() {
        output("Hi, I'm " + getFirstName() +
                " and I'm starting my work at the " +
                this.department + " department!");
    }

    protected String getEmployedTime() {
        int currentYear = Year.now().getValue();
        int employedTime = (currentYear - this.hiredYear);

        String preStr = "Hi, I'm ";
        String midStr = " and I've been working here since ";

        if (employedTime == 1) {
            return preStr + getFirstName() + midStr + "a year.";
        } else if (employedTime == 0) {
            return preStr + getFirstName() + " and I'm new here.";
        } else {
            return preStr + getFirstName() + midStr + employedTime + " years.";
        }
    }

    protected static void output(String outStr) {
        System.out.println(outStr);
    }

}
