/**
 * 10x10 Spielplan für das Schiffe-versenken-Spiel
 *
 * @version 0.1
 */
public class Spielplan
{
    // instance variables
    //Spielfeld
    private int[][] fields;
    //variable, die auf einen mit auskunftGeben() erlesenen Wert gesetzt werden kann
    private int zustand;
    //Spieler, der gewonnen hat (wird durch die Methode gewinner() festgelegt)
    private Spieler gewinner;
    //Counter für die Methode schiffeAufnehmen(), der Zählt, wie viele benachbarte Felder bereits belegt sind
    private int invalidCount;
    //temporärer Wahrheitswert, ob ein Schiff so gesetzt werden kann. Wird durch schiffeAufnehmen() festgelegt
    private boolean valid;
    //Spieler, dem der Spielplan gehört (der seine Schiffe hier platziert)
    private Spieler spieler;
    //Spieler, der die Schiffe auf diesem Plan abschießt
    private Spieler gegner;
    //Spaltennamen zu Zahlen-Übersetzer
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;





    /**
     * Constructor for objects of class Spielplan
     */
    public Spielplan()
    {
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = 6;
        g = 7;
        h = 8;
        i = 9;
        j = 10;
        invalidCount = 0;
        valid = true;
        fields = new int[10][10];
        for (int i = 9; i >= 0; i--) {
            for (int k = 9; i >= 0; i--) {
                fields[i][k] = 0;
                test++;
            }
        }
    }





    /**
     * Gibt zurück, welchen Zustand das Feld hat
     *
     * @param   spalte   Spalte, in der das gewuenschte Feld liegt
     * @param   reihe   Reihe, in der das gewuenschte Feld liegt
     * @return Wert des jeweiligen Feldes, 0=nichts, 1=schiff, 2=getroffen, 3=versucht
     */
    public int auskunftGeben(int spalte, int reihe)
    {
           return fields[spalte][reihe];
    }



    /**
     * Ermittelt alle 8 Felder, die um ein spezifiziertes Feld herum angeordnet sind
     *
     * @return 8 Felder mit Spalte und Reihe ([Index des Feldes][0: Spalte, 1: Reihe])
     */
    public int[][] benachbarteFelderErmitteln(int spalte, int reihe)
    {
        int[][] benachbarteFelder = new int[8][2];
        benachbarteFelder[0][0] = spalte+1;
        benachbarteFelder[0][1] = reihe;
        benachbarteFelder[1][0] = spalte-1;
        benachbarteFelder[1][1] = reihe;
        benachbarteFelder[2][0] = spalte;
        benachbarteFelder[2][1] = reihe+1;
        benachbarteFelder[3][0] = spalte;
        benachbarteFelder[3][1] = reihe+1;
        benachbarteFelder[4][0] = spalte+1;
        benachbarteFelder[4][1] = reihe+1;
        benachbarteFelder[5][0] = spalte+1;
        benachbarteFelder[5][1] = reihe-1;
        benachbarteFelder[6][0] = spalte-1;
        benachbarteFelder[6][1] = reihe+1;
        benachbarteFelder[7][0] = spalte-1;
        benachbarteFelder[7][1] = reihe-1;
        return benachbarteFelder;
    }



     /**
     * Setzt ein Schiff auf ein Anfangsfeld mit einer Orientierung
     *
     * @param   spalte   Spalte, in der das gewuenschte Feld liegt
     * @param   reihe   Reihe, in der das gewuenschte Feld liegt
     * @param   orientierung   nord, ost, sued und west, bei 1-er ist diese egal
     */
    public void schiffeAufnehmen(int spalte, int reihe, int groesse, String orientierung)
    {
        spalte--;
        reihe--;
        System.out.println(spalte + " " + reihe);
        this.valid = true;
        //erst pruefen, ob das Schiff so gesetzt werden kann
        if (groesse == 1) {
            if (spieler.getVerfuegbareEiner() <= 0) {
                this.valid = false;
            }
        } else if (groesse == 2) {
            if (spieler.getVerfuegbareZweier() <= 0) {
                this.valid = false;
            }
        } else if (groesse == 3) {
            if (spieler.getVerfuegbareDreier() <= 0) {
                this.valid = false;
            }
        } else {
            this.valid = false;
        }
        for (int i = 0; i<groesse; i++) {
            if (orientierung == "nord") {
                this.zustand = this.auskunftGeben(spalte, reihe-i);
                if (this.zustand == 0) {
                    if (validieren(spalte, reihe-i) != true) {
                        this.valid = false;
                    }
                } else {
                    this.valid = false;
                }
            }
            if (orientierung == "ost") {
                this.zustand = this.auskunftGeben(spalte+i, reihe);
                if (this.zustand == 0) {
                    if (validieren(spalte+i, reihe) != true) {
                        this.valid = false;
                    }
                } else {
                    this.valid = false;
                }
            }
            if (orientierung == "sued") {
                this.zustand = this.auskunftGeben(spalte, reihe+i);
                if (this.zustand == 0) {
                    if (validieren(spalte, reihe+i) != true) {
                        this.valid = false;
                    }
                } else {
                    this.valid = false;
                }
            }
            if (orientierung == "west") {
                this.zustand = this.auskunftGeben(spalte-i, reihe);
                if (this.zustand == 0) {
                    if (validieren(spalte-i, reihe) != true) {
                        this.valid = false;
                    }
                } else {
                    this.valid = false;
                }
            }
        }
        //Schiff setzen, wenn es gesetzt werden darf
        if (this.valid == true) {
            if (groesse == 1) {
                spieler.setVerfuegbareEiner(spieler.getVerfuegbareEiner()-1);
            }
            if (groesse == 2) {
                spieler.setVerfuegbareZweier(spieler.getVerfuegbareZweier()-1);
            }
            if (groesse == 3) {
                spieler.setVerfuegbareEiner(spieler.getVerfuegbareDreier()-1);
            }
            for (int i = 0; i<groesse; i++) {
                if (orientierung == "nord") {
                    this.zustand = this.auskunftGeben(spalte, reihe-i);
                    if (this.zustand == 0) {
                        this.fields[spalte][reihe-i] = 1;
                    }
                }
                if (orientierung == "ost") {
                    this.zustand = this.auskunftGeben(spalte+i, reihe);
                    if (this.zustand == 0) {
                        this.fields[spalte+i][reihe] = 1;
                    }
                }
                if (orientierung == "sued") {
                    this.zustand = this.auskunftGeben(spalte, reihe+i);
                    if (this.zustand == 0) {
                        this.fields[spalte][reihe+i] = 1;
                    }
                }
                if (orientierung == "west") {
                    this.zustand = this.auskunftGeben(spalte-i, reihe);
                    if (this.zustand == 0) {
                        this.fields[spalte-i][reihe] = 1;
                    }
                }
            }
        } else {
            System.out.println("Das Schiff kann so nicht gesetzt werden!");
        }
    }



    /**
     * Testet, ob ein Schiff dort platzizert werden darf
     *
     * @param   pSpalte   Spalte des Feldes, auf das ein Schiff gesetzt werden soll
     * @param   pReihe   Reihe des Feldes, auf das ein Schiff gesetzt werden soll
     *
     * @return Wahrheitswert, ob das Feld mit einem Schiff belegt werden darf
     */
    public boolean validieren(int pSpalte, int pReihe)
    {
        for (int i = 0; i <= 7; i++) {
            this.zustand = this.auskunftGeben(this.benachbarteFelderErmitteln(pSpalte, pReihe)[i][0], this.benachbarteFelderErmitteln(pSpalte, pReihe)[i][1]);
            if (this.zustand != 0) {
                this.invalidCount++;
            }
        }
        if (pSpalte <=9 && pSpalte >= 0 && pReihe <=9 && pReihe >= 0 ) {
            if (this.invalidCount == 0) {
                return true;
            } else {
                return false;
                System.out.println("Das Schiff ist zu nah an einem anderen Schiff.");
            }
        } else {
            return false;
            System.out.println("Mindestens ein Feld des Schiffes ist außerhalb des Spielplans.");
        }
    }



    /**
     * Prueft, ob ein Spieler gewonnen hat und gibt ggf. das Spielerobjekt zurueck
     * Moegliche Loesung: Anzahl der Felder, auf denen ein Schiff ist, bestimmen und mit der Anzahl der Felder, bei denen "2" ist, abgleichen
     *
     * @return Objekt des Spielers, der gewonnen hat
     */
    public Spieler gewinner()
    {
        int anzahlSchiffe = spieler.getAnzahlSchiffe();
        int getroffen = 0;
        for (int i = 0; i <= 9; i++) {
            for (int k = 0; k <= 9; k++) {
                if (fields[k][i] == 2) {
                    getroffen++;
                }
            }
        }
        if (anzahlSchiffe == getroffen) {
            System.out.println(gegner.getName()+" hat alle Schiffe getroffen!")
        }
    }



    /**
     * Gibt das Spielfeld als 10x10 Matrix mit jeweligen Feldwerten (int) in die Konsole aus
     */
    public void grafikAusgeben()
    {
        for (int i = 0; i <= 9; i++) {
            for (int k = 0; k <= 9; k++) {
                System.out.print(fields[k][i]);
            }
            System.out.println("\n");
        }
    }



    //Set-Methoden

    /**
     * Setzt den Spieler, dem dieser Spielplan gehört (der hier seine Schiffe platziert)
     */
    public void setSpieler(Spieler pSpieler)
    {
        this.spieler = pSpieler;
    }



    /**
     * Setzt den Spieler, der die Schiffe auf diesem Spielplan abschießt
     */
    public void setGegner(Spieler pGegner)
    {
        this.gegner = pGegner;
    }



    /**
     * Setzt den Wert eines Feldes
     *
     * @param   spalte   Spalte des Feldes (0<splate<11)
     * @param   reihe   Reihe des Feldes (0<splate<11)
     * @param   wert   Zustand des Feldes (0<=wert<5)
     */
    public void setField(int spalte, int reihe, int wert)
    {
        this.fields[spalte-1][reihe-1] = wert;
    }



    //get-Methoden

    /**
     * @return Spielerobjekt des Spielers, der die Schiffe auf diesem Plan abschießt
     */
    public Spieler getSpieler()
    {
        return this.spieler;
    }



    /**
     * @return Spielerobjekt des Spielers, der die Schiffe auf diesem Plan abschießt
     */
    public Spieler getGegner()
    {
        return this.gegner;
    }
}
