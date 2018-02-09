package micalculadora;

public class Calculadora {

    int x;
    int y;
    int r;

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
}
