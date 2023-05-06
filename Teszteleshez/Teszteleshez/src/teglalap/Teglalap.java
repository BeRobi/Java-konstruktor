package teglalap;

public class Teglalap {
    private int a, b;
    private static int db;

    public Teglalap() {
        this(1);
    }

    public Teglalap(int a) {
        this(a, a + 1);
    }

    public Teglalap(int a, int b) {
        this.setA(a);
        this.setB(b);
        Teglalap.db++;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a <= 0) {
            a = 1;
        }
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b <= 0) {
            b = 1;
        }
        this.b = b;
    }

    public static int getDb() {
        return db;
    }

    @Override
    public String toString() {
        return "Teglalap{" + "a=" + a + ", b=" + b + '}';
    }
}
