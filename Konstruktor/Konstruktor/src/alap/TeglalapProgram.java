package alap;

public class TeglalapProgram {
    public static void main(String[] args) {
        Teglalap jo = new Teglalap(5, 3);
        Teglalap rossz = new Teglalap(-5, -2);
        
        System.out.println("jó: " + jo.allapot());
        System.out.println("rossz: " + rossz.allapot());
        
        /* nem elérhetõ csak osztályban a private: */
        //jo.hossz = -3;
        
        jo.beallitA(-3);
        jo.beallitB(-8);
        System.out.println("jó: " + jo.allapot());
        
        jo.beallitA(24);
        jo.beallitB(4);
        System.out.println("jó: " + jo.allapot());
    }
}
