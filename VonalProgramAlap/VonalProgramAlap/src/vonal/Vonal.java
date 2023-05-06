package vonal;

public class Vonal {
    private int hossz;
    private String szin;
    private String tipus;
    private int eltolas;

    public Vonal() {
        this(1);
    }

    public Vonal(int hossz) {
        this(hossz, "fekete");
    }

    public Vonal(int hossz, String szin) {
        this(hossz, szin, "szimpla");
    }

    public Vonal(int hossz, String szin, String tipus) {
        this(hossz, szin, tipus, 0);
    }

    public Vonal(int hossz, String szin, String tipus, int eltolas) {
        this.hossz = hossz;
        this.szin = szin;
        this.tipus = tipus;
        this.eltolas = eltolas;
    }

    @Override
    public String toString() {
        return "Vonal{" + "hossz=" + hossz + ", szin=" + szin + ", tipus=" + tipus + ", eltolas=" + eltolas + '}';
    }
    
}
