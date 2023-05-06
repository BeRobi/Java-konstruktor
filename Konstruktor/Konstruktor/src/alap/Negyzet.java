package alap;

/* EGYSÉGBEZÁRÁS: class */
public class Negyzet {
     /* ADATTAGOK */
    // Adatrejtés: private
    private int a;
    
    /* TAGFÜGGVÉNYEK */
    //Konstruktorok
    public Negyzet(int a) {
        beallitA(a);
    }
    
    //setter: a rejtett adattag beállítója
    public void beallitA(int a) {
        if(a < 1){
            a = 1;
        }
        this.a = a;
    }
    
    //getter: a rejtett adattag lekérdezõje
    public int lekerdezA() {
        return a;
    }
    
    //saját tagfüggvények:
    public String allapot(){
        return "Negyzet{a=" + a + "}";
    }
}
