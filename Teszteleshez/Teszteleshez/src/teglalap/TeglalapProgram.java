package teglalap;

public class TeglalapProgram {

    public static void main(String[] args) {
        Teglalap t0 = new Teglalap();
        System.out.println(t0);
        Teglalap t1 = new Teglalap(4);
        System.out.println(t1);
        Teglalap t2 = new Teglalap(3, 5);
        System.out.println(t2);
        
        t0.setA(0);
        System.out.println(t0);
        Teglalap h1 = new Teglalap(-4);
        System.out.println(h1);
        Teglalap h2 = new Teglalap(-3, 0);
        System.out.println(h2);
        
        assert Teglalap.getDb() == 5 : "hibás db!";
    }
    
}
