package alap;

/* EGYS�GBEZ�R�S: class */
public class Negyzet {
     /* ADATTAGOK */
    // Adatrejt�s: private
    private int a;
    
    /* TAGF�GGV�NYEK */
    //Konstruktorok
    public Negyzet(int a) {
        beallitA(a);
    }
    
    //setter: a rejtett adattag be�ll�t�ja
    public void beallitA(int a) {
        if(a < 1){
            a = 1;
        }
        this.a = a;
    }
    
    //getter: a rejtett adattag lek�rdez�je
    public int lekerdezA() {
        return a;
    }
    
    //saj�t tagf�ggv�nyek:
    public String allapot(){
        return "Negyzet{a=" + a + "}";
    }
}
