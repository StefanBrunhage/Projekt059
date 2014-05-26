package System;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public class Kund extends Person {

    public Kund(int pnr,
            String fNamn,
            String eNamn,
            String teleNr,
            String epost,
            ArrayList<Integer> behorigheter) {
        this.pnr = pnr;
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.teleNr = teleNr;
        this.epost = epost;
        this.behorigheter = behorigheter;
        roll = 2; //kund
    }
        public Kund(int pnr,
            String fNamn,
            String eNamn,
            String teleNr,
            String epost) {
        this.pnr = pnr;
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.teleNr = teleNr;
        this.epost = epost;
        roll = 2; //kund
    }

    @Override
    public String getVariableNames() {
        return "pnr, fNamn, eNamn, teleNr, epost, roll";
    }

    @Override
    public String toString() {
        String kund;
        kund = pnr + ", "
                + "'" + fNamn + "'" + ", "
                + "'" + eNamn + "'" + ", "
                + "'" + teleNr + "'" + ", "
                + "'" + epost + "'" + ", "
                + roll;

        return kund;
    }
}
