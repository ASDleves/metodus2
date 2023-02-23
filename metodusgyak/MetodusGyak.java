package metodusgyak;

public class MetodusGyak {
    public static void main(String[] args) {
        int osszeg, gyok;
        kiir("Az első 10 szám összege: "+osszead(elso10szamosszeg(), 0));
        osszeg = osszead(1,2);
        osszeg = osszead(osszeg, 3);
        osszeg = osszead(osszeg, 4);
        kiir("1+2+3+4 ="+osszeg+"\n");
        gyok = osszead(1, 2);
        gyok = osszead(gyok, 3);
        gyok = (gyok**(0.5);
        kiir("1+2+3 gyöke = "+gyok);
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
