package AccessModifier;

public class TryOut {
    private int a;
    public int b;
    protected int c;
    int d;

    public TryOut(int b, int c, int d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
