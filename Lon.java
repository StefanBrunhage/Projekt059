/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt059;

/**
 *
 * @author Stefan
 */
public class Lon {

    private int lonId;
    private Litteratur litteratur;
    private Person person;
    private String slutDatum;

    public Lon(Litteratur litteratur,
            Lon lon,
            Person person,
            String slutDatum) {
        this.litteratur = litteratur;
        this.person = person;
        this.slutDatum = slutDatum;
    }

    public int getLonId() {
        return lonId;
    }

    public void setLonId(int lonId) {
        this.lonId = lonId;
    }

    public Litteratur getLitteratur() {
        return litteratur;
    }

    public void setLitteratur(Litteratur litteratur) {
        this.litteratur = litteratur;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getSlutDatum() {
        return slutDatum;
    }

    public void setSlutDatum(String slutDatum) {
        this.slutDatum = slutDatum;
    }
}
