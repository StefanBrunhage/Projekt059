package system;

import java.sql.*;


/**
 *
 * @author Stefan Brunhage
 */
public class Sql {

    Connection c;
    Statement s;
    ResultSet rs;
    
    public Sql(){
        c = createConnection();
        s = myCreateStatement(c);
    }

    //connect
    public Connection createConnection() {
        Connection localConn = null;

        try {
            //kollar om drivrutin finns
            Class.forName("org.sqlite.JDBC"); //Sqlite-drivrutin
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Couldn't find driver class:");
            cnfe.printStackTrace();
            System.exit(1);
        }
        System.out.println("Driver found");

        try {
            //skapar uppkoppling
            localConn = DriverManager.getConnection("jdbc:sqlite:Databas");
        } catch (SQLException se) {
            System.out.println("Couldn't connect:"
                    + " print out a stack trace and exit.");
            se.printStackTrace();
            System.exit(1);
        }
        //om allt gick som det ska
        if (localConn != null) {
            System.out.println("Successfully connected to the database!");
        } else {
            System.out.println("This should be impossible.");
        }

        return localConn;
    }

    //sql sats
    public Statement myCreateStatement(Connection c) {
        Statement s = null;

        try {
            //skapar statement med hjälp av uppkopplingen till databasen
            s = c.createStatement();
        } catch (SQLException se) {
            System.out.println("We got an exception while creating a statement:"
                    + "that probably means we're no longer connected.");
            System.out.println(se.getMessage());
            System.exit(1);
        }
        return s;
    }

    /*
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
    public ResultSet query(String query) {
        ResultSet rs = null;

        try {

            rs = s.executeQuery(query);

        } catch (SQLException se) {
            System.out.println("We got an exception while executing our query:"
                    + "that probably means our SQL is invalid");
            System.out.println(se.getMessage());
            System.exit(1);
        }
        return rs;
    }

    /*
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
    public int update(String query) {
        int antal = 0;
        try {
            antal = s.executeUpdate(query);

        } catch (SQLException se) {
            System.out.println("We got an exception while executing our query: "
                    + "that probably means our SQL is invalid");
            System.out.println(se.getMessage());
            System.exit(1);
        }
        return antal;
    }

    /*
    * 
    * 
    * 
    * 
    * 
    * 
    * 
    */
    
    //Gör resultset till en sträng
    public String ResultSetToString(ResultSet rs) {
        String temp;
        String resultat = "";
        try {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            //forloop som tar ut columnerna från resultset och lägger in dom
            //i strängen resultat
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                resultat = resultat + rsMetaData.getColumnName(i);
            }
            //while loop som lägger in alla tupler i strängen resultat 
            //om värdet av den andra columnen är null läggs 0 in i strängen
            //istället
            while (rs.next()) {
                temp = rs.getString(2);
                if (null == temp) {
                    temp = "0";
                } else {
                }


                resultat = resultat + "\n " + resultat.format("%-12s\t %-11s\t",
                        rs.getString(1), temp);

            }
        } catch (SQLException se) {
            System.out.println("We got an exception while getting a result:this"
                    + " shouldn't happen: we've done something really bad.");
            System.out.println(se.getMessage());
            System.exit(1);
        }
        return resultat;
    }
}
