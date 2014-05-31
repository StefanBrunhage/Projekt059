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
    public ArrayList listLitt() {
        String SQL = "SELECT * FROM litteratur";
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList getLittId(int id) {
        String SQL = "SELECT * FROM litteratur WHERE id == " + id;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList getLittTitel(String titel) {
        String SQL = "SELECT * FROM litteratur WHERE titel LIKE '%" + titel + "%'";
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public int regLitt(Litteratur litteratur) {
        String insertData = litteratur.toString();
        String columnNames = "id, titel, forfattare, sprak, utgivningsar,"
                + " tillganglighet, kopieringsbart, isbn";
        String SQL = "INSERT INTO litteratur (" + columnNames + ") VALUES (" + insertData + ")";

        int numberOfChanges;
        numberOfChanges = sql.update(SQL);

        return numberOfChanges;
    }

    public int delLitt(int littId) {
        ArrayList<String> lonList = new ArrayList<>();
        int numberOfChanges = 0;

        lonList = getLonWithLittId(littId);
        
        for (int i = 1; i < lonList.size(); i++) {
            Lon l = ObjektSkapare.rowToLon(lonList.get(1));
            String SQL2 = "DELETE FROM skuld WHERE lonId=" + l.getLonId();
            numberOfChanges = numberOfChanges + sql.update(SQL2);
            String SQL3 = "DELETE FROM lon WHERE lonId=" + l.getLonId();
            numberOfChanges = numberOfChanges + sql.update(SQL3);
        }

        String SQL = "DELETE FROM litteratur WHERE id=" + littId;

        numberOfChanges = numberOfChanges + sql.update(SQL);

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
        ArrayList<String> lonList = new ArrayList<>();
        int numberOfChanges = 0;
        lonList = getLonWithPnr(pnr);
        for (int i = 1; i < lonList.size(); i++) {
            Lon l = ObjektSkapare.rowToLon(lonList.get(i));
            String SQL2 = "DELETE FROM skuld WHERE lonId=" + l.getLonId();
            numberOfChanges = numberOfChanges + sql.update(SQL2);
            String SQL3 = "DELETE FROM lon WHERE lonId=" + l.getLonId();
            numberOfChanges = numberOfChanges + sql.update(SQL3);

        }

        String SQL = "DELETE FROM person WHERE pnr=" + pnr;

        numberOfChanges = numberOfChanges + sql.update(SQL);

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

    public ArrayList getSkuld(int SkuldId) {
        String SQL = "SELECT * FROM skuld WHERE skuldId=" + SkuldId;
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

    public int regSkuld(Skuld skuld) {
        int numberOfChanges;
        String insertData = skuld.toString();
        String columnNames = "skuldId, belopp, datum, lonId, pnr";
        String SQL = "INSERT INTO skuld (" + columnNames + ") VALUES (" + insertData + ")";

        numberOfChanges = sql.update(SQL);
        return numberOfChanges;
    }

    public int delSkuld(int skuldId) {
        String SQL = "DELETE FROM skuld WHERE skuldId=" + skuldId;

        int numberOfChanges;
        numberOfChanges = sql.update(SQL);

        return numberOfChanges;
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

    public ArrayList getLon(int lonId) {
        String SQL = "SELECT * FROM lon WHERE lonId=" + lonId;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);
        return resultat;
    }

    public ArrayList getLonWithLittId(int littId) {
        String SQL = "SELECT lonId FROM lonLitteratur WHERE litterturId=" + littId;
        ArrayList<String> lonIdList = new ArrayList<>();
        lonIdList = sql.query(SQL);

        ArrayList<String> lonList = new ArrayList<>();
        int lonId = Integer.parseInt(lonIdList.get(1));
        lonList = getLon(lonId);

        return lonList;
    }

    public ArrayList getLonWithPnr(int pnr) {
        String SQL = "SELECT * FROM lon WHERE pnr=" + pnr;
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

        String SQL1 = "DELETE FROM skuld WHERE lonId=" + lonId;
        String SQL2 = "DELETE FROM lon WHERE lonId=" + lonId;
        String SQL3 = "DELETE FROM lonLitteratur WHERE lonId=" + lonId;

        int numberOfChanges;
        numberOfChanges = sql.update(SQL1);
        numberOfChanges = numberOfChanges + sql.update(SQL2);
        numberOfChanges = numberOfChanges + sql.update(SQL3);

        return numberOfChanges;
    }

    //lån och vilken litteratur som hör till
    //lån och vilken litteratur som hör till
    //lån och vilken litteratur som hör till
    public ArrayList getLonLitteratur(int littId) {
        String SQL = "SELECT * FROM lonLitteratur WHERE litterturId=" + littId;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList getLonLitteraturWithLonId(int lonId) {
        String SQL = "SELECT * FROM lonLitteratur WHERE lonId=" + lonId;
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

    public ArrayList listLonBok() {
        String SQL = "SELECT lon.lonId,"
                + " lon.pnr,"
                + " litteratur.titel,"
                + " litteratur.id AS litteraturId FROM lon "
                + "JOIN lonLitteratur ON lon.lonId=lonLitteratur.lonId "
                + "JOIN litteratur ON litteratur.id=lonLitteratur.litterturId";
        ArrayList<String> resultat = new ArrayList<>();
        resultat = sql.query(SQL);

        return resultat;
    }

}
