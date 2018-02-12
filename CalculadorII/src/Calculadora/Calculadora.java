package Calculadora;

public class Calculadora {

    protected int x;
    protected int y;
    protected int r;

    void sumar() {
        r = x + y;
    }

    void restar() {
        if (x < y) {
            int a;

            a = x;
            x = y;
            y = a;
        }

        if (x < 0) {
            x = -x;
            y = -y;
        }
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

  
    
}
