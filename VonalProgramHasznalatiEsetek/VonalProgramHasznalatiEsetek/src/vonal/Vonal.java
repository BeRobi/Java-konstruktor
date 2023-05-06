package vonal;

public class Vonal {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
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

    public void rajzol() {
        //eltolás
        for (int i = 0; i < this.eltolas; i++) {
            System.out.print(" ");
        }
        
        //típus
        char jel;
        switch(this.tipus){
            default: jel = '_'; break;
            //case "szimpla": jel = '_'; break;
            case "dupla": jel = '='; break;
            case "pont": jel = '.'; break;
            case "szaggatott": jel = '-'; break;
        }
        
        //szín
        String sz;
        switch(this.szin){
            default: sz = Vonal.ANSI_BLACK; break;
            case "piros": sz = Vonal.ANSI_RED;break;
            case "sárga": sz = Vonal.ANSI_YELLOW;break;
            case "kék": sz = Vonal.ANSI_BLUE;break;
            case "zöld": sz = Vonal.ANSI_GREEN;break;
        }
        System.out.print(sz);
        
        //hossz
        for (int i = 0; i < this.hossz; i++) {
            System.out.print(jel);
        }
        System.out.println(Vonal.ANSI_RESET);
    }
    
}
