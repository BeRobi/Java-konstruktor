package alap;

/* EGYSÉGBEZÁRÁS: class */
public class Vonal {
    /* ADATTAGOK */
    // Adatrejtés: private
    private int hossz;
    
    /* TAGFÜGGVÉNYEK */
    //Konstruktorok
    public Vonal(int hossz) {
        beallitHossz(hossz);
    }
    
    //setter: a rejtett adattag beállítója
    public void beallitHossz(int hossz) {
        if(hossz < 1){
            hossz = 1;
        }
        this.hossz = hossz;
    }
    
    //getter: a rejtett adattag lekérdezõje
    public int lekerdezHossz() {
        return hossz;
    }
    
    //saját tagfüggvények:
    public String allapot(){
        return "Vonal{hossz=" + hossz + "}";
    }
}
