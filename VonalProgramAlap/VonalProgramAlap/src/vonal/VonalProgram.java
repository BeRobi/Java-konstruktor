package vonal;

public class VonalProgram {

    public static void main(String[] args) {
        Vonal v0 = new Vonal();
        Vonal v1 = new Vonal(7);
        Vonal v2 = new Vonal(10, "sárga");
        Vonal v3 = new Vonal(6, "kék", "pont");
        Vonal v4 = new Vonal(3, "piros", "dupla", 5);

        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);

        Vonal h0 = new Vonal(); //0 nem lehet a hossz
        Vonal h1 = new Vonal(-5); //- nem lehet a hossz
        Vonal h2 = new Vonal(5, ""); //üres nem lehet a szín
        Vonal h3 = new Vonal(5, "red"); //csak magyar szín
        Vonal h4 = new Vonal(5, "piros", "dotted");//csak m. t.
        Vonal h5 = new Vonal(5, "red", ""); //angol és üres
        Vonal h6 = new Vonal(5, "pont", "kék"); //felcserélt
        Vonal h7 = new Vonal(5, null, null, 2); //nem lehet null

        //eltolás - lehet??? specifikáció szerint kell leprogramozni
        Vonal h8 = new Vonal(5, "sárga", "szaggatott", -3);
        
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
