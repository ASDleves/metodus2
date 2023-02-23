package metodusgyak;

public class MetodusGyak {
    public static void main(String[] args) {
        kiir("Az első 10 szám összege: "+osszead(elso10szamosszeg(), 0));
        negyszamosszead();
        gyokvonas();
    }

    private static void negyszamosszead() {
        int osszeg;
        osszeg = osszead(1,2);
        osszeg = osszead(osszeg, 3);
        osszeg = osszead(osszeg, 4);
        kiir("1+2+3+4 ="+osszeg+"\n");
    }

    private static void gyokvonas() {
        String kimenet;
        int osszeg;
        int a = 3, b =4, c=2;
        osszeg = osszead(a,b);
        osszeg = osszead(osszeg, c);
        String s = "%d+%d+%d gyöke:".format(a,b,c);
        double gyok = Math.sqrt(osszeg);
        kimenet = String.format("%s %.4f\n", s, gyok);
        kiir(kimenet);
    }
    
    

    private static int elso10szamosszeg() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
        //kiir("Az első 10 szám összege:" + osszeg);
    }
    private static int osszead(int a, int b){
        //System.out.printf("%d + %d = %d\n", a, b, a+b);
        return a+b;
    }

    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
}
