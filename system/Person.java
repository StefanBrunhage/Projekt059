package System;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public abstract class Person {

    int pnr;
    String fNamn;
    String eNamn;
    String teleNr;
    String epost;
    ArrayList<Integer> behorigheter;
    int roll;

    public abstract String getVariableNames();

    @Override
    public abstract String toString();

    public int getPnr() {
        return pnr;
    }

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }

    public String getfNamn() {
        return fNamn;
    }

    public void setfNamn(String fNamn) {
        this.fNamn = fNamn;
    }

    public String geteNamn() {
        return eNamn;
    }

    public void seteNamn(String eNamn) {
        this.eNamn = eNamn;
    }

    public String getTeleNr() {
        return teleNr;
    }

    public void setTeleNr(String teleNr) {
        this.teleNr = teleNr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public ArrayList getBehorigheter() {
        return behorigheter;
    }

    public void setBehorigheter(ArrayList behorigheter) {
        this.behorigheter = behorigheter;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.pnr = roll;
    }
}
