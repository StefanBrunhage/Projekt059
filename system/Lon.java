package system;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public class Lon {

    private int lonId;
    private ArrayList<Litteratur> litteratur = new ArrayList<>();
    private Person person;
    private String slutDatum;

    public Lon(ArrayList litteratur,
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

    public ArrayList getLitteratur() {
        return litteratur;
    }

    public void setLitteratur(ArrayList litteratur) {
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

    @Override
    public String toString() {
        String lon;
        lon = lonId + ", "
        + person.getPnr() + ", "
        + "'" + slutDatum + "'";

        return lon;

    }
}
