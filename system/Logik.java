package system;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public class Logik {

    Sql sql = new Sql();

    public int regLitt(Litteratur litteratur) {
        String insertData = litteratur.toString();
        String columnNames = litteratur.getVariableNames();
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

    public int regPerson(Person person) {
        String insertData = person.toString();
        String columnNames = person.getVariableNames();
        String SQL1 = "INSERT INTO person (" + columnNames + ") VALUES (" + insertData + ")";
        String SQL2 = "INSERT INTO personBehorighet";

        int numberOfChanges;
        numberOfChanges = sql.update(SQL1);
        numberOfChanges = numberOfChanges + sql.update(SQL2);
        return numberOfChanges;
    }

}
