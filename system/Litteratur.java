package system;

/**
 *
 * @author Projekt059
 */
public class Litteratur {

    private int id;
    private String titel;
    private String forfattare;
    private String sprak;
    private int utgivningsar;
    private boolean tillganglig;
    private boolean kopieringsbart;
    private String isbn;

    public Litteratur(
            int id,
            String titel,
            String forfattare,
            String sprak,
            int utgivningsar,
            boolean tillganglig,
            boolean kopieringsbart,
            String isbn) {

        this.id = id;
        this.titel = titel;
        this.forfattare = forfattare;
        this.sprak = sprak;
        this.utgivningsar = utgivningsar;
        this.tillganglig = tillganglig;
        this.kopieringsbart = kopieringsbart;
        this.isbn = isbn;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getForfattare() {
        return forfattare;
    }

    public void setForfattare(String forfattare) {
        this.forfattare = forfattare;
    }

    public String getSprak() {
        return sprak;
    }

    public void setSprak(String sprak) {
        this.sprak = sprak;
    }

    public int getUtgivningsar() {
        return utgivningsar;
    }

    public void setUtgivningsar(int utgivningsar) {
        this.utgivningsar = utgivningsar;
    }

    public boolean getTillganglig() {
        return tillganglig;
    }

    public void setTillganglig(boolean tillganglig) {
        this.tillganglig = tillganglig;
    }

    public boolean getKopieringsbart() {
        return kopieringsbart;
    }

    public void setKopieringsbart(boolean kopieringsbart) {
        this.kopieringsbart = kopieringsbart;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }
    


    @Override
    public String toString() {
        String litt;
        litt = id + ", "
                + "'" + titel + "'" + ", "
                + "'" + forfattare + "'" + ", "
                + "'" + sprak + "'" + ", "
                + utgivningsar + ", "
                + "'" + tillganglig + "'" + ", "
                + "'" + kopieringsbart + "'" + ", "
                + "'" + isbn + "'";



        return litt;

    }
}
