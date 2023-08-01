package com.cc.java;

public class MA_Production extends Mitarbeiter {

    public MA_Production(String familyName, String firstName, int birthYear,
            String workID, String department, String role, int hiredYear) {
        super(familyName, firstName, birthYear, workID, department, role, hiredYear);

    }

    @Override
    protected String doYourJob() {
        return getFirstName() + " assembled the products.";
    }

}
