package system;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public class Lon {

    private int lonId;
    private ArrayList<Integer> litterturId = new ArrayList<>();
    private int pnr;
    private String slutDatum;

    public Lon(ArrayList litterturId,
            int pnr,
            String slutDatum) {
        this.litterturId = litterturId;
        this.pnr = pnr;
        this.slutDatum = slutDatum;
    }

    public Lon(int lonId,
            ArrayList litterturId,
            int pnr,
            String slutDatum) {
        this.lonId = lonId;
        this.litterturId = litterturId;
        this.pnr = pnr;
        this.slutDatum = slutDatum;
    }

    public int getLonId() {
        return lonId;
    }

    public void setLonId(int lonId) {
        this.lonId = lonId;
    }

    public ArrayList getLitteratur() {
        return litterturId;
    }

    public void setLitteratur(ArrayList litteratur) {
        this.litterturId = litteratur;
    }

    public int getPerson() {
        return pnr;
    }

    public void setPerson(int pnr) {
        this.pnr = pnr;
    }

    public String getSlutDatum() {
        return slutDatum;
    }

    public void setSlutDatum(String slutDatum) {
        this.slutDatum = slutDatum;
    }

    @Override
    public String toString() {
        String lon;
        lon = lonId + ", "
                + pnr + ", "
                + "'" + slutDatum + "'";

        return lon;

    }
}
