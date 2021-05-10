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

    /**
     * Constructor for objects of class Spielplan
     */
    public Spielplan()
    {
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
           
    }
    
     /**
     * Setzt ein Schiff auf ein Anfangsfeld mit einer Orientierung
     *
     * @param   spalte   Spalte, in der das gewuenschte Feld liegt
     * @param   reihe   Reihe, in der das gewuenschte Feld liegt
     * @param   orientierung   nord, ost, sued und west
     */
    public void schiffeAufnehmen(int spalte, int reihe, String orientierung)
    {
           
    }
    
    /**
     * Prueft, ob ein Spieler gewonnen hat und gibt ggf. das Spielerobjekt zurueck
     *
     * @return Objekt des Spielers, der gewonnen hat
     */
    public Spieler gewinner()
    {
           
    }
}
