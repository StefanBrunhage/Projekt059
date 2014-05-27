package system;

/**
 *
 * @author Projekt059
 */
public class ObjektSkapare {

    
    public static Person rowToPerson(String row) {
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

    public static Skuld rowToSkuld(String row) {
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

    public static Lon rowToLon(String row) {
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

    public static Litteratur rowToLitt(String row) {
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
