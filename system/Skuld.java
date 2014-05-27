package system;

/**
 *
 * @author Projekt059
 */
public class Skuld {

    private int skuldId;
    private int lonId;
    private int pnr;
    private int belopp;
    private String slutDatum;

    public Skuld(
            int skuldId,
            int lonId,
            int belopp,
            String slutDatum,
            int pnr) {
        this.lonId = lonId;
        this.belopp = belopp;
        this.slutDatum = slutDatum;
        this.pnr = pnr;
    }

    public Skuld(
            int lonId,
            int belopp,
            String slutDatum,
            int pnr) {
        this.lonId = lonId;
        this.belopp = belopp;
        this.slutDatum = slutDatum;
        this.pnr = pnr;
    }

    public int getLonId() {
        return lonId;
    }

    public void setLonId(int lonId) {
        this.lonId = lonId;
    }

    public int getSkuldId() {
        return skuldId;
    }

    public void setSkuldId(int skuldId) {
        this.skuldId = skuldId;
    }

    public int getBelopp() {
        return belopp;
    }

    public void setBelopp(int belopp) {
        this.belopp = belopp;
    }

    public String getSlutDatum() {
        return slutDatum;
    }

    public void setSlutDatum(String slutDatum) {
        this.slutDatum = slutDatum;
    }

    @Override
    public String toString() {
        String skuld;
        skuld = skuldId + ", "
                +  belopp + ", "
                + "'" + slutDatum + "'" + ", "
                + "'" + lonId + "'" + ", "
                + pnr;

        return skuld;

    }
}
