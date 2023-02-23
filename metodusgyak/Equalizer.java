
package metodusgyak;

import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        eq();
    }

    private static void eq() {
        Random rnd = new Random();
        
        for (int i = 0; i < 5; i++) {
            int szam = rnd.nextInt(3)+5;
            for (int j = 0; j < szam; j++) {
                System.out.print("\u001B[45m" + " ");
                
            }
            System.out.println("");
        }
        
    }
}
