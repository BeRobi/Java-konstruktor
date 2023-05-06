package tesztelt;

/* TESZELÉS SZEMPONTJÁBÓL HIBÁS:
 * a különböző teszt metódusok egymástól 
 * NEM FÜGGHETNEK!
*/

public class TeglalpProgram {

    //a többi metódusban is kell:
    private Teglalap t0;

    public static void main(String[] args) {
        TeglalpProgram prg =  new TeglalpProgram();
        prg.helyesHasznalatTeszt();
        prg.hibasHasznalatTeszt();
        prg.darabTeszt();
        prg.oldalakBeallitasaTeszt(); 
    }

    private void helyesHasznalatTeszt() {
        System.out.println("HELYES használat:");
        t0 = new Teglalap();
        System.out.println("jó Teglalap():" + t0);
        Teglalap t1 = new Teglalap(4);
        System.out.println("jó Teglalap(4):" + t1);
        Teglalap t2 = new Teglalap(3, 5);
        System.out.println("jó Teglalap(3, 5):" + t2);
        System.out.println("------------------");
    }

    private void hibasHasznalatTeszt() {
        System.out.println("HIBÁS használat:");
        t0.setA(0);
        System.out.println("rossz setA(0): " + t0);
        Teglalap h1 = new Teglalap(-4);
        System.out.println("rossz Teglalap(-4):" + h1);
        Teglalap h2 = new Teglalap(-3, 0);
        System.out.println("rossz Teglalap(-3, 0):" + h2);
        System.out.println("------------------");
    }

    private void darabTeszt() {
        System.out.println("DARAB ténylegesen: " + Teglalap.getDb());
        //File / Project Properties / Run / VM Option: -ea
        assert Teglalap.getDb() == 5 : "hibás db!";
        System.out.println("------------------");
    }

    private void oldalakBeallitasaTeszt() {
        System.out.println("OLDAL ellenőrzések: ");
        
        t0.setB(0);
        System.out.println("setB(0): " + t0);
        
        t0.setA(2);
        System.out.println("setA(2): " + t0);
        
        t0.setB(2);
        System.out.println("setB(2): " + t0);
        
        t0.setA(0);
        t0.setB(0);
        System.out.println("setA(0), setB(0): " + t0);
        
        t0.setA(3);
        t0.setB(2);
        System.out.println("setA(3), setB(2): " + t0);
        System.out.println("------------------");
    }
    
}
