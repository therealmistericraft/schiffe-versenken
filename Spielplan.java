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
}
