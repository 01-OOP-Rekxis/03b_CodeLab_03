package com.cc.java;

public class MA_Advertising extends Mitarbeiter {

    public MA_Advertising(String familyName, String firstName, int birthYear,
            String workID, String department, String role, int hiredYear) {
        super(familyName, firstName, birthYear, workID, department, role, hiredYear);

    }

    public void createAdCampaign() {
        output("Ad campaign created successfully! by " + getFirstName() + ".");
    }

}
