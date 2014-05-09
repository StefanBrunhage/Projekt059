package system;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public abstract class Person {

    int personnummer;
    String fNamn;
    String eNamn;
    String telenr;
    String epost;
    ArrayList<String> behorigheter;

    public int getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(int personnummer) {
        this.personnummer = personnummer;
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

    public String getTelenr() {
        return telenr;
    }

    public void setTelenr(String telenr) {
        this.telenr = telenr;
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
}
