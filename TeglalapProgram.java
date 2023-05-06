package generalt;
public class TeglalapProgram {
    public static void main(String[] args) {
        Teglalap t = new Teglalap(3, 5);
        
        System.out.println(t);
        System.out.println(t.toString());
        System.out.println(t.allapot());
        
        /* Mindenki az Object-ből származik
           ezért megörökli pl a toString metódust
        */
        Object obj = new Object();
        obj.toString();
    }
}
