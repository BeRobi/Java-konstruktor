package alap;

/* EGYS�GBEZ�R�S: class */
public class Vonal {
    /* ADATTAGOK */
    // Adatrejt�s: private
    private int hossz;
    
    /* TAGF�GGV�NYEK */
    //Konstruktorok
    public Vonal(int hossz) {
        beallitHossz(hossz);
    }
    
    //setter: a rejtett adattag be�ll�t�ja
    public void beallitHossz(int hossz) {
        if(hossz < 1){
            hossz = 1;
        }
        this.hossz = hossz;
    }
    
    //getter: a rejtett adattag lek�rdez�je
    public int lekerdezHossz() {
        return hossz;
    }
    
    //saj�t tagf�ggv�nyek:
    public String allapot(){
        return "Vonal{hossz=" + hossz + "}";
    }
}
