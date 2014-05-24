package system;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public class Logik {

    Sql sql = new Sql();

    //litteratur
    //litteratur
    //litteratur
    public int regLitt(Litteratur litteratur) {
        String insertData = litteratur.toString();
        String columnNames = "id, titel, forfattare, sprak, utgivningsar,"
                + " tillganglig, kopieringsbart, isbn";
        String SQL = "INSERT INTO litteratur (" + columnNames + ") VALUES (" + insertData + ")";

        int numberOfChanges;
        numberOfChanges = sql.update(SQL);

        return numberOfChanges;
    }

    public ArrayList listLitt() {
        String SQL = "SELECT * FROM litteratur";
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList getLitt(Litteratur litteratur) {
        int id = litteratur.getId();
        String SQL = "SELECT * FROM litteratur WHERE id=" + id;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public int delLitt(Litteratur litteratur) {
        int id = litteratur.getId();
        String SQL1 = "DELETE FROM litteratur WHERE id=" + id;
        String SQL2 = "DELETE FROM lonLitteratur WHERE litterturId=" + id;
        String SQL3 = "DELETE FROM "
        int numberOfChanges;
        numberOfChanges = sql.update(SQL1);

        return numberOfChanges;
    }

    //person
    //person
    //person
    public ArrayList listPerson() {
        String SQL = "SELECT * FROM person";
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList getPerson(Person person) {
        int personnummer = person.getPnr();
        String SQL = "SELECT * FROM person WHERE pnr=" + personnummer;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public int regPerson(Person person) {
        String insertData = person.toString();
        String columnNames = person.getVariableNames();
        String SQL1 = "INSERT INTO person (" + columnNames + ") VALUES (" + insertData + ")";
        String SQL2;
        int numberOfChanges;

        numberOfChanges = sql.update(SQL1);
        for (int i = 0; i < person.getBehorigheter().size(); i++) {
            SQL2 = "INSERT INTO personBehorighet (pnr, behorighet) VALUES (" + person.getPnr() + ", " + person.getBehorigheter().get(i) + ")";
            numberOfChanges = numberOfChanges + sql.update(SQL2);
        }

        return numberOfChanges;
    }

    public int delPerson(Person person) {
        String SQL = "DELETE FROM person WHERE pnr=" + person.getPnr();

        int numberOfChanges;
        numberOfChanges = sql.update(SQL);

        return numberOfChanges;
    }

    //skuld
    //skuld
    //skuld
    public ArrayList listSkuld() {
        String SQL = "SELECT * FROM skuld";
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public int regSkuld(Skuld skuld) {
        int numberOfChanges;
        String insertData = skuld.toString();
        String columnNames = "skuldId, belopp, datum, lonId";
        String SQL = "INSERT INTO person (" + columnNames + ") VALUES (" + insertData + ")";

        numberOfChanges = sql.update(SQL);
        return numberOfChanges;
    }

    public int delSkuld(Skuld skuld) {
        String SQL = "DELETE FROM skuld WHERE skuldId=" + skuld.getSkuldId();

        int numberOfChanges;
        numberOfChanges = sql.update(SQL);

        return numberOfChanges;
    }

    public ArrayList getSkuld(Skuld skuld) {
        int id = skuld.getSkuldId();
        String SQL = "SELECT * FROM skuld WHERE skuldId=" + id;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    //lån
    //lån
    //lån
    public ArrayList listLon() {
        String SQL = "SELECT * FROM lon";
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList listLonBok() {
        String SQL = "SELECT lon.lonId,"
                + " lon.pnr,"
                + " lonLitteratur.titel,"
                + " lonLitteratur.bokId FROM lon "
                + "JOIN lonLitteratur ON lon.lonId=lonLitteratur.lonId "
                + "JOIN litteratur ON litteratur.litterturId=lonLitteratur.lonId";
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public int regLon(Lon lon) {
        String insertData = lon.toString();
        String columnNames = "lonId, pnr, datum";
        String SQL1 = "INSERT INTO lon (" + columnNames + ") VALUES (" + insertData + ")";
        String SQL2;

        int numberOfChanges;

        numberOfChanges = sql.update(SQL1);
        for (int i = 0; i < lon.getLitteratur().size(); i++) {
            SQL2 = "INSERT INTO lonLitteratur (litterturId, lonId) VALUES (" + lon.getLitteratur().get(i) + ", " + lon.getLonId() + ")";
            numberOfChanges = numberOfChanges + sql.update(SQL2);
        }

        return numberOfChanges;
    }

    public int delLon(Lon lon) {
        String SQL = "DELETE FROM lon WHERE lonId=" + lon.getLonId();

        int numberOfChanges;
        numberOfChanges = sql.update(SQL);

        return numberOfChanges;
    }
    
        public ArrayList getLon(Lon lon) {
        int id = lon.getLonId();
        String SQL = "SELECT * FROM lon WHERE lonId=" + id;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }
}
