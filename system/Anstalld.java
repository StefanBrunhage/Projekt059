package system;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public class Anstalld extends Person {

    public Anstalld(int pnr,
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
        roll = 1; //anställd
    }

    public Anstalld(int pnr,
            String fNamn,
            String eNamn,
            String teleNr,
            String epost) {
        this.pnr = pnr;
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.teleNr = teleNr;
        this.epost = epost;
        roll = 1; //anställd
    }

    @Override
    public String getVariableNames() {
        return "pnr, fNamn, eNamn, teleNr, epost, roll";
    }

    @Override
    public String toString() {
        String anstalld;
        anstalld = pnr + ", "
                + "'" + fNamn + "'" + ", "
                + "'" + eNamn + "'" + ", "
                + "'" + teleNr + "'" + ", "
                + "'" + epost + "'" + ", "
                + roll;

        return anstalld;
    }
}
