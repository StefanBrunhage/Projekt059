/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt059;

/**
 *
 * @author Stefan
 */
public class Projekt {
    static Logik logik = new Logik();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Litteratur l = new Litteratur(1, "asd", "d", "d", 2011, true, true, "FHRUTI487O");
        logik.regLitt(l);
    }
}
