package system;

/**
 *
 * @author Projekt059
 */
public class Skuld {

    private int skuldId;
    private Lon lon;
    private int belopp;
    private String slutDatum;

    public Skuld(
            Lon lon,
            int skuldId,
            int belopp,
            String slutDatum) {
        this.lon = lon;
        this.belopp = belopp;
        this.slutDatum = slutDatum;
    }

    public Lon getLon() {
        return lon;
    }

    public void setLon(Lon lon) {
        this.lon = lon;
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
                + "'" + belopp + "'" + ", "
                + "'" + slutDatum + "'" + ", "
                + "'" + lon.getLonId() + "'";

        return skuld;

    }
}
