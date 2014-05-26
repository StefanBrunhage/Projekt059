package System;

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
                + " tillganglighet, kopieringsbart, isbn";
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

    public ArrayList getLitt(int id) {
        String SQL = "SELECT * FROM litteratur WHERE id=" + id;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public int delLitt(int littId) {
        String SQL = "DELETE FROM litteratur WHERE id =" + littId;

        int numberOfChanges;
        numberOfChanges = sql.update(SQL);

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

    public ArrayList getPerson(int pnr) {
        String SQL = "SELECT * FROM person WHERE pnr LIKE '%" + pnr + "%'";
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

    public int delPerson(int pnr) {
        String SQL = "DELETE FROM person WHERE pnr=" + pnr;

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
        String columnNames = "skuldId, belopp, datum, lonId, pnr";
        String SQL = "INSERT INTO person (" + columnNames + ") VALUES (" + insertData + ")";

        numberOfChanges = sql.update(SQL);
        return numberOfChanges;
    }

    public int delSkuld(int skuldId) {
        String SQL = "DELETE FROM skuld WHERE skuldId=" + skuldId;

        int numberOfChanges;
        numberOfChanges = sql.update(SQL);

        return numberOfChanges;
    }

    public ArrayList getSkuld(int SkuldId) {
        String SQL = "SELECT * FROM skuld WHERE skuldId=" + SkuldId;
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
        for (int i = 0; i < lon.getlitterturId().size(); i++) {
            SQL2 = "INSERT INTO lonLitteratur (litterturId, lonId) VALUES (" + lon.getlitterturId().get(i) + ", " + lon.getLonId() + ")";
            numberOfChanges = numberOfChanges + sql.update(SQL2);
        }

        return numberOfChanges;
    }

    public int delLon(int lonId) {
        ArrayList<String> sl = new ArrayList<>();
        sl = getSkuldWithLonId(lonId);
        Skuld s = rowToSkuld(sl.get(1));

        String SQL1 = "DELETE FROM lon WHERE lonId=" + lonId;
        String SQL2 = "DELETE FROM skuld WHERE skuldId=" + s.getSkuldId();


        int numberOfChanges;
        numberOfChanges = sql.update(SQL1);
        numberOfChanges = numberOfChanges + sql.update(SQL2);

        return numberOfChanges;
    }

    public ArrayList getLon(int lonId) {
        String SQL = "SELECT * FROM lon WHERE lonId=" + lonId;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList getLonLitteratur(int littId) {
        String SQL = "SELECT * FROM lonLitteratur WHERE litterturId=" + littId;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList getLonWithPnr(int pnr) {
        String SQL = "SELECT * FROM lon WHERE pnr=" + pnr;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList getSkuldWithLonId(int lonId) {
        String SQL = "SELECT * FROM skuld WHERE lonId=" + lonId;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList getSkuldWithPnr(int pnr) {
        String SQL = "SELECT * FROM skuld WHERE pnr=" + pnr;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    //text strängar till olika objekt
    public Person rowToPerson(String row) {
        String[] rowArray;
        rowArray = row.split(" ");
        int pnr = Integer.parseInt(rowArray[0]);
        String eNamn = rowArray[1];
        String fNamn = rowArray[2];
        String teleNr = rowArray[3];
        String epost = rowArray[4];
        int roll = Integer.parseInt(rowArray[5]);
        if (roll == 1) {
            Anstalld a = new Anstalld(pnr,
                    eNamn,
                    fNamn,
                    teleNr,
                    epost);
            return a;

        } else {
            Kund k = new Kund(pnr,
                    fNamn,
                    eNamn,
                    teleNr,
                    epost);
            return k;
        }
    }

    public Skuld rowToSkuld(String row) {
        String[] rowArray;
        rowArray = row.split(" ");
        int skuldId = Integer.parseInt(rowArray[0]);
        int lonId = Integer.parseInt(rowArray[1]);
        int pnr = Integer.parseInt(rowArray[2]);
        int belopp = Integer.parseInt(rowArray[3]);
        String slutDatum = rowArray[4];
        Skuld s = new Skuld(
                skuldId,
                lonId,
                belopp,
                slutDatum,
                pnr);
        return s;
    }

    public Lon rowToLon(String row) {
        String[] rowArray;
        rowArray = row.split(" ");
        int lonId = Integer.parseInt(rowArray[0]);
        int pnr = Integer.parseInt(rowArray[1]);
        String slutDatum = rowArray[2];
        Lon l = new Lon(
                lonId,
                pnr,
                slutDatum);
        return l;
    }

    public Litteratur rowToLitt(String row) {
        String[] rowArray;
        rowArray = row.split(" ");
        int id = Integer.parseInt(rowArray[0]);
        String titel = rowArray[1];
        String forfattare = rowArray[2];
        String sprak = rowArray[3];
        int utgivningsar = Integer.parseInt(rowArray[4]);
        boolean tillganglig = Boolean.parseBoolean(rowArray[5]);
        boolean kopieringsbart = Boolean.parseBoolean(rowArray[6]);
        String isbn = rowArray[7];
        Litteratur l = new Litteratur(id,
                titel,
                forfattare,
                sprak,
                utgivningsar,
                tillganglig,
                kopieringsbart,
                isbn);
        return l;
    }
}
