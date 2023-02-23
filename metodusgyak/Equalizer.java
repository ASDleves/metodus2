
package metodusgyak;

import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        eq();
    }

    private static void eq() {
        Random rnd = new Random();
        int min = 3, max= 7;
        
        for (int i = 0; i < 5; i++) {
            int szam = rnd.nextInt(3)+4;
            for (int j = 0; j < szam; j++) {
                System.out.print("\u001B[45m" + " ");
                
            }
            System.out.println("");
        }
        
    }
}
