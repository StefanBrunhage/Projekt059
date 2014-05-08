/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt059;

/**
 *
 * @author lol
 */
public class Logik {

    Sql sql = new Sql();

    public int regLitt(Litteratur litteratur) {
        String insertData = litteratur.toString();
        String SQL = "INSERT INTO litteratur (id, titel, forfattare, "
                + "sprak, utgivningsar, tillganglighet, kopieringsbart, isbn) VALUES (" + insertData + ")";
        int numberOfChanges;
        System.out.println(SQL);
        numberOfChanges = sql.update(SQL);


        return numberOfChanges;
    }
}
