package generalt;

public class Teglalap {
    private int a, b;

    public Teglalap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Teglalap{" + "a=" + a + ", b=" + b + '}';
    }
    
    //saját tagfüggvények:
    public String allapot(){
        return "Teglalap{a=" + a 
                + ", b=" + b
                + "}";
    }
    
}
