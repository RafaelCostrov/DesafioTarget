package ExericioDois;

public class MontandoSequencia {

    static long sequencia(int n) {
        if (n < 2) {
            return n;
        } else {
            return sequencia(n - 1) + sequencia(n - 2);
        }
    }
}
