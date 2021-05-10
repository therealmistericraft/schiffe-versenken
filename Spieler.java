
/**
 * Write a description of class Spieler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spieler
{
    // instance variables
    private int verfuegbareEiner;
    private int verfuegbareZweier;
    private int verfuegbareDreier;
    private int treffer;
    private Spielplan spielplan1;
    private Gegner spieler1;


    /**
     * Constructor for objects of class Spieler
     */
    public Spieler(Spieler pSpieler1, Spielplan pSpielplan1)
    {
        // initialise instance variables
        this.spieler1 = pSpieler1;
        this.spielplan1 = pSpielplan1;
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
