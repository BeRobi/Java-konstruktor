package alap;

public class NegyzetProgram {
    public static void main(String[] args) {
        Negyzet jo = new Negyzet(5);
        Negyzet rossz = new Negyzet(-5);
        
        System.out.println("jó: " + jo.lekerdezA());
        System.out.println("rossz: " + rossz.lekerdezA());
        
        /* nem elérhetõ csak osztályban a private: */
        //jo.hossz = -3;
        
        jo.beallitA(-3);
        System.out.println("jó: " + jo.lekerdezA());
        
        jo.beallitA(24);
        System.out.println("jó: " + jo.allapot());
    }
}
