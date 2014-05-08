/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.util.ArrayList;

/**
 *
 * @author Stefan
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
