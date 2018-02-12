package Calculadora;

public class Calculadora {

    protected float x;
    private float y;
    private float r;

    void sumar() {
        r = x + y;
    }

    void restar() {

        r = x - y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getR() {
        return r;
    }
    
}
