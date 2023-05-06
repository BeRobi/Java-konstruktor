package vonal;

public class VonalProgram {

    public static void main(String[] args) {
        new VonalProgram().feladat(); 
    }

    private void feladat() {
        hasznalatiEsetek();
        tesztEsetek();
    }

    private void hasznalatiEsetek() {
        Vonal v0 = new Vonal();
        Vonal v1 = new Vonal(7);
        Vonal v2 = new Vonal(10, "sárga");
        //Vonal v3 = new Vonal(6, "kék", "pont");
        Vonal v3 = new Vonal(6, "kék", Vonal.VonalStilus.Pont);
        //Vonal v4 = new Vonal(3, "piros", "dupla", 5);
        Vonal v4 = new Vonal(3, "piros", Vonal.VonalStilus.Dupla, 5);
        
        System.out.println(v0);
        v0.rajzol();
        
        System.out.println(v1);
        v1.rajzol();
        
        System.out.println(v2);
        v2.rajzol();
        
        System.out.println(v3);
        v3.rajzol();
        
        System.out.println(v4);
        v4.rajzol();
    }
    
    private void tesztEsetek() {
        /* a színek a String típus miatt még lehetnek hibásak: 
         * azt is enum típussal kell megoldani
         */
        Vonal h0 = new Vonal(); //0 nem lehet a hossz
        Vonal h1 = new Vonal(-5); //- nem lehet a hossz
        Vonal h2 = new Vonal(5, ""); //üres nem lehet a szín
        Vonal h3 = new Vonal(5, "red"); //csak magyar szín
        //Vonal h4 = new Vonal(5, "piros", "dotted");//csak m. t.
        Vonal h4 = new Vonal(5, "piros", Vonal.VonalStilus.Pont);//csak m. t.
        //Vonal h5 = new Vonal(5, "red", ""); //angol és üres
        Vonal h5 = new Vonal(5, "red", Vonal.VonalStilus.Szaggatott); //angol és üres
        //Vonal h6 = new Vonal(5, "pont", "kék"); //felcserélt
        Vonal h6 = new Vonal(5, "pont", Vonal.VonalStilus.Pont); //felcserélt
        Vonal h7 = new Vonal(5, null, null, 2); //nem lehet null

        //eltolás - lehet??? specifikáció szerint kell leprogramozni
        //Vonal h8 = new Vonal(5, "sárga", "szaggatott", -3);
        Vonal h8 = new Vonal(5, "sárga", Vonal.VonalStilus.Szaggatott, -3);
        
        System.out.println(h0);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);
    }

    

}
