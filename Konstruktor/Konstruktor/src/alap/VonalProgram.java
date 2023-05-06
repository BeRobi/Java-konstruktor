package alap;

public class VonalProgram {

    public static void main(String[] args) {
        Vonal jo = new Vonal(5);
        Vonal rossz = new Vonal(-5);
        
        System.out.println("j�: " + jo.lekerdezHossz());
        System.out.println("rossz: " + rossz.lekerdezHossz());
        
        /* nem el�rhet� csak oszt�lyban a private: */
        //jo.hossz = -3;
        
        jo.beallitHossz(-3);
        System.out.println("j�: " + jo.lekerdezHossz());
        
        jo.beallitHossz(24);
        System.out.println("j�: " + jo.allapot());
    }
    
}
