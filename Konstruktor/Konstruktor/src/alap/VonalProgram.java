package alap;

public class VonalProgram {

    public static void main(String[] args) {
        Vonal jo = new Vonal(5);
        Vonal rossz = new Vonal(-5);
        
        System.out.println("jó: " + jo.lekerdezHossz());
        System.out.println("rossz: " + rossz.lekerdezHossz());
        
        /* nem elérhetõ csak osztályban a private: */
        //jo.hossz = -3;
        
        jo.beallitHossz(-3);
        System.out.println("jó: " + jo.lekerdezHossz());
        
        jo.beallitHossz(24);
        System.out.println("jó: " + jo.allapot());
    }
    
}
