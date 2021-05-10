/**
 * 10x10 Spielplan für das Schiffe-versenken-Spiel
 *
 * @version 0.1
 */
public class Spielplan
{
    // instance variables - replace the example below with your own
    private int[][] fields;
    private int test;
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
        fields = new int[10][10];
        System.out.println("1");
        for (int i = 10; i>0; i--) {
            System.out.println("2");
            for (int k = 10; i>0; i--) {
                fields[i][k] = 0;
                test++;
                System.out.println("3");
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
     * @param   orientierung   nord, ost, sued und west
     */
    public void schiffeAufnehmen(int spalte, int reihe, int groesse, String orientierung)
    {
        for (int i = 0, i=groesse, i++) {
            if (orientierung == "nord") {
                zustand = this.auskunftGeben(spalte, reihe-i);
                if (zustand == 0) {
                    fields[spalte][reihe-i] = 1;   
                }
            }
            if (orientierung == "ost") {
                zustand = this.auskunftGeben(spalte+i, reihe);
                if (zustand == 0) {
                    fields[spalte][reihe+i] = 1;   
                }
            }
            if (orientierung == "sued") {
                zustand = this.auskunftGeben(spalte, reihe+i);
                if (zustand == 0) {
                    fields[spalte][reihe+i] = 1;   
                }
            }
            if (orientierung == "west") {
                zustand = this.auskunftGeben(spalte-i, reihe);
                if (zustand == 0) {
                    fields[spalte-i][reihe] = 1;   
                }
            }
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
           
    }
}
