package metodusgyak;

public class MetodusGyak {
    public static void main(String[] args) {
        int szam1, szam2, szam3, szam4;
        szam1 = 4;
        szam2 = 7;
        szam3= 8;
        szam4 = 0;
        kiir("Az első 10 szám összege: "+osszead(elso10szamosszeg(), 0));
        kiir("A "+szam1+"+"+szam2+"+"+szam3+"+"+szam4+"összege = "+osszead(szam1,
                szam2)+osszead(szam3, szam4));
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
