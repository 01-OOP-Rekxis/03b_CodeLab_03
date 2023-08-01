package com.cc.java;

public class App {

    public static void main(String[] args) {
        MA_Advertising m001 = new MA_Advertising("Schmidt", "Julia", 1987, "74391", "Advertising", "CMO", 2017);
        MA_Accounting m002 = new MA_Accounting("Wagner", "Peter", 1990, "85412", "Accounting", "CFO", 2022);
        MA_Production m003 = new MA_Production("Müller", "Anna", 1995, "91847", "Production", "Production Manager",
                2023);

        getInfos(m001);
        getInfos(m002);
        getInfos(m003);

    }

    private static void output(String outStr) {
        System.out.println(outStr);
    }

    private static void getInfos(Mitarbeiter worker) {
        output("------------------------------");
        output(worker.getPersonalData());
        output(worker.getEmployedTime());
        output(worker.hasLunch());
        output(worker.startsWork());
        output(worker.doYourJob());
    }
}
