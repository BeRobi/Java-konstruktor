package alap;

/* EGYS�GBEZ�R�S: class */
public class Teglalap {
    /* ADATTAGOK */
    // Adatrejt�s: private
    private int a, b;
    
    /* TAGF�GGV�NYEK */
    //Konstruktorok
    public Teglalap(int a, int b) {
        beallitA(a);
        beallitB(b);
    }
    
    //setter: a rejtett adattag be�ll�t�ja
    public void beallitA(int a) {
        if(a < 1){
            a = 1;
        }
        this.a = a;
    }
    
    public void beallitB(int b) {
        if(b < 1){
            b = 1;
        }
        this.b = b;
    }
    
    //getter: a rejtett adattag lek�rdez�je
    public int lekerdezA() {
        return a;
    }
    
    public int lekerdezB() {
        return b;
    }
    
    //saj�t tagf�ggv�nyek:
    public String allapot(){
        return "Teglalap{a=" + a 
                + ", b=" + b
                + "}";
    }
}
