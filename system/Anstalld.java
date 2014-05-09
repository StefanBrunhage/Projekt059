package system;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public class Anstalld extends Person {

    public Anstalld(int personnummer,
            String fNamn,
            String eNamn,
            String telenr,
            String epost,
            ArrayList<String> behorigheter) {
        this.personnummer = personnummer;
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.telenr = telenr;
        this.epost = epost;
        this.behorigheter = behorigheter;
    }
}
