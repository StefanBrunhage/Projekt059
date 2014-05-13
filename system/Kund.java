package system;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public class Kund extends Person {

    public Kund(int personnummer,
            String fNamn,
            String eNamn,
            String teleNr,
            String epost,
            ArrayList<String> behorigheter) {
        this.pnr = personnummer;
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.teleNr = teleNr;
        this.epost = epost;
        this.behorigheter = behorigheter;
        roll = "kund";
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
                + "'" + epost + "'" + ", ";

        return kund;
    }
}
