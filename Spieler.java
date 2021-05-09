
/**
 * Write a description of class Spieler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spieler
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Spieler
     */
    public Spieler()
    {
        // initialise instance variables
        x = 0;
    }

    
    
    // Get- und Setmethoden
    
    
    // get-Methoden

    
    /**
     * Gibt einen Array mit Feldern, die bereits getroffen wurden, zurück.
     *
     * @return    Array mit getroffenen Feldern
     */
    public int[] getTreffer() {
        return treffer;
    }
    
    /**
     * Das Gegnerobjekt herausfinden
     *
     * @return    Spielerobjekt des Gegners
     */
    public Spieler getGegner() {
        return gegner;
    }
    
    /**
     * Das Spielfeldobjekt herausfinden
     *
     * @return    Objekt der Klasse Spielfeld
     */
    public Spielfeld getSpielfeld() {
        return spielplan;
    }
    
    
    // Set-Methoden
    
    
    /**
     * Festlegen, aus wie vielen Einern die Flotte besteht
     * 
     * @param   pEiner   Anzahl der Einer in der Soll-Flotte
     */
    public void setVerfuegbareEiner(int pEiner) {
        this.verfuegbareEiner = pEiner;
    }
    
    /**
     * Festlegen, aus wie vielen Zweiern die Flotte besteht
     * 
     * @param   pEiner   Anzahl der Zweier in der Soll-Flotte
     */
    public void setVerfuegbareZweier(int pZweier) {
        this.verfuegbareZweier = pZweier;
    }
    
    /**
     * Festlegen, aus wie vielen Dreiern die Flotte besteht
     * 
     * @param   pEiner   Anzahl der Dreier in der Soll-Flotte
     */
    public void setVerfuegbareDreier(int pDreier) {
        this.verfuegbareDreier = pDreier;
    }
    
    /**
     * Gegnerobjekt zuweisen
     *
     * @param   pGegner   gegnerisches Spielerobjekt
     */
    public void setGegner(Spieler pGegner) {
        this.gegner = pGegner;
    }
}
