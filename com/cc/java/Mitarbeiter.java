package com.cc.java;

import java.time.Year;

public class Mitarbeiter extends Person {

    protected String workID;
    protected String department;
    protected String role;
    protected int hiredYear;

    public Mitarbeiter(String familyName, String firstName, int birthYear,
            String workID, String department, String role, int hiredYear) {

        super(familyName, firstName, birthYear);
        this.workID = workID;
        this.department = department;
        this.role = role;
        this.hiredYear = hiredYear;

    }

    protected String hasLunch() {
        return "Hi, I'm " + getFirstName() +
                " and I'm having Lunch!";
    }

    protected String startsWork() {
        return "Hi, I'm " + getFirstName() +
                " and I'm starting my work at the " +
                this.department + " department!";
    }

    protected String getEmployedTime() {
        int currentYear = Year.now().getValue();
        int employedTime = (currentYear - this.hiredYear);

        String preStr = "Hi, I'm ";
        String midStr = " and I've been working here for ";

        if (employedTime == 1) {
            return preStr + getFirstName() + midStr + "a year.";
        } else if (employedTime == 0) {
            return preStr + getFirstName() + " and I'm new here.";
        } else {
            return preStr + getFirstName() + midStr + employedTime + " years.";
        }
    }

    protected String doYourJob() {
        return "I'm doing my Job!";
    }

}
