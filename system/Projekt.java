package system;

import java.util.ArrayList;

/**
 *
 * @author Projekt059
 */
public class Projekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logik logik = new Logik();
        /*
        Litteratur l = new Litteratur(1, "asd", "d", "d", 2011, true, true, "FHRUTI487O");        
        //logik.regLitt(l);
        
        ArrayList<String> resultat = logik.listLitt();
        for(int i = 0; i < resultat.size(); i++){
            System.out.println(resultat.get(i));
        }
        
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        Kund k = new Kund(123, "Glenn", "Björk", "121212", "hej@gmail.com", b);
        logik.regPerson(k);
        */
        System.out.println(logik.listLitt());
        System.out.println(logik.listPerson());
        System.out.println(logik.listSkuld());
        System.out.println(logik.listLon());
        
    }
}
