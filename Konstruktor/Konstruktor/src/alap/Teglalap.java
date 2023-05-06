package alap;

/* EGYSÉGBEZÁRÁS: class */
public class Teglalap {
    /* ADATTAGOK */
    // Adatrejtés: private
    private int a, b;
    
    /* TAGFÜGGVÉNYEK */
    //Konstruktorok
    public Teglalap(int a, int b) {
        beallitA(a);
        beallitB(b);
    }
    
    //setter: a rejtett adattag beállítója
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
    
    //getter: a rejtett adattag lekérdezõje
    public int lekerdezA() {
        return a;
    }
    
    public int lekerdezB() {
        return b;
    }
    
    //saját tagfüggvények:
    public String allapot(){
        return "Teglalap{a=" + a 
                + ", b=" + b
                + "}";
    }
}
