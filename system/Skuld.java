/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

/**
 *
 * @author Stefan
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
}