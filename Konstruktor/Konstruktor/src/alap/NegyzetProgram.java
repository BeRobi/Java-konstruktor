package alap;

public class NegyzetProgram {
    public static void main(String[] args) {
        Negyzet jo = new Negyzet(5);
        Negyzet rossz = new Negyzet(-5);
        
        System.out.println("j�: " + jo.lekerdezA());
        System.out.println("rossz: " + rossz.lekerdezA());
        
        /* nem el�rhet� csak oszt�lyban a private: */
        //jo.hossz = -3;
        
        jo.beallitA(-3);
        System.out.println("j�: " + jo.lekerdezA());
        
        jo.beallitA(24);
        System.out.println("j�: " + jo.allapot());
    }
}
