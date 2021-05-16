
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
    private int[] treffer;
    private Spielplan spielplan;
    private Spieler gegner;


    /**
     * Constructor for objects of class Spieler
     */
    public Spieler(Spieler pSpieler1, Spielplan pSpielplan)
    {
        // initialise instance variables
        this.spielplan = pSpielplan;
    }

    /**
     * Setze ein Schiff auf ein Feld in eine Richtung
     *
     * @param   spalte    Spalte, in die der Anfang des Schiffs gesetzt werden soll, int oder var
     * @param   reihe   Reihe, in die der Anfang des Schiffs gesetzt werden soll, int
     * @param   groesse   Art des Schiffes, 1, 2 oder 3
     * @param   richtung   Richtung, in die ausgehend vom Anfangsfeld das Schiff platziert werden soll, nord, ost, sued, west
     */
    public void platzieren(int spalte, int reihe, int groesse, String richtung) {
           
    }
    
    /**
     * Schiesse auf ein Feld, ueberpfuefe zunaechst ob dort bereits geschossen wurde
     *
     * @param   spalte    Spalte, in der das Feld liegt, auf das geschossen werden soll, int oder var
     * @param   reihe   Reihe, in der das Feld liegt, auf das geschossen werden soll, int
     */
    public void schiessen(int spalte, int reihe) {
        
    }
    
    // Get- und Setmethoden
    
    
    // get-Methoden

    /**
     * Die Anzahl der verfuegbaren Einer herausfinden
     *
     * @return    Anzahl der verfuegbaren Einer
     */
    public int getVerfuegbareEiner() {
        return verfuegbareEiner;
    }
    
     /**
     * Die Anzahl der verfuegbaren Zweier herausfinden
     *
     * @return    Anzahl der verfuegbaren Zweier
     */
    public int getVerfuegbareZweier() {
        return verfuegbareZweier;
    }
    
     /**
     * Die Anzahl der verfuegbaren Dreier herausfinden
     *
     * @return    Anzahl der verfuegbaren Dreier
     */
    public int getVerfuegbareDreier() {
        return verfuegbareDreier;
    }
    
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
    public Spielplan getSpielfeld() {
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
