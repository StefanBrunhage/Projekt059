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
        System.out.println(SQL);
        numberOfChanges = sql.update(SQL);

        return numberOfChanges;
    }

    public ArrayList listLitt() {
        String SQL = "SELECT * FROM litteratur";
        ArrayList<String> resultat = new ArrayList<>();
        System.out.println(SQL);
        resultat = sql.query(SQL);

        return resultat;
    }

    public int regPerson(Person person) {
        String insertData = person.toString();
        String SQL1 = "INSERT INTO person";
        String SQL2 = "INSERT INTO personBehorighet";
        return 0;
    }

}
