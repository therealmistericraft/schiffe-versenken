
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
    private int anzahlSchiffe;
    private int[] treffer;
    private Spielplan spielplan;
    private Spieler gegner;


    /**
     * Constructor for objects of class Spieler
     *
     * @param   pSpielplan   Objekt des Spielplans, auf dem dieser Spieler seine Schiffe Setzt
     * @param   pEiner   Anzahl der Schiffe der Größe 1, die verwendet werden sollen
     * @param   pZweier   Anzahl der Schiffe der Größe 2, die verwendet werden sollen
     * @param   pDreier   Anzahl der Schiffe der Größe 3, die verwendet werden sollen
     */
    public Spieler(Spielplan pSpielplan, int pEiner, int pZweier, int pDreier)
    {
        // initialise instance variables
        this.spielplan = pSpielplan;
        this.verfuegbareEiner = pEiner;
        this.verfuegbareZweier = pZweier;
        this.verfuegbareDreier = pDreier;
        this.anzahlSchiffe = this.verfuegbareEiner + (this.verfuegbareZweier*2) + (this.verfuegbareDreier*3);
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



    /**
     * Gibt das Spielfeld, auf das dieser Spieler schießt als 10x10 Matrix mit jeweligen Feldwerten (int) in die Konsole aus
     * 0: Weder versucht noch getroffen
     * 1: versucht, aber nicht getroffen
     * 2: getroffen
     */
    public void grafikAusgeben()
    {
        for (int i = 0; i <= 9; i++) {
            for (int k = 0; k <= 9; k++) {
                if (gegner.spielfeld.auskunftGeben(k,i) <= 1) {
                    int decoded = 0;
                }
                if (gegner.spielfeld.auskunftGeben(k,i) == 2) {
                    int decoded = 2;
                }
                if (gegner.spielfeld.auskunftGeben(k,i) == 3) {
                    int decoded = 1;
                }
                System.out.print(decoded);
            }
            System.out.println("\n");
        }
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
        if (gegner.verfuegbareEiner != this.verfuegbareEiner || gegner.verfuegbareZweier != this.verfuegbareZweier || gegner.verfuegbareDreier != this.verfuegbareDreier) {
            System.out.println("Ihr spielt mit einer unterschiedlichen Anzahl an Schiffen.");
        }
    }
}
