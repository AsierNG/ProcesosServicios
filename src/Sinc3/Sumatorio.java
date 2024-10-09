package Sinc3;

/**
 *
 * @author Asier N. G
 */
public class Sumatorio extends Thread {

    private double n;
    private double resultado;

    public Sumatorio(double n) {
        this.n = n;
    }

    @Override
    public void run() {
        resultado = sumaImpar(n);
    }

    public double getResult() {
        return resultado;
    }

    private double sumaImpar(double n) {
        if (n % 2 == 0) {
            n = n - 1;
        }
        double acumulador = 0;
        for (int i = (int) n; i >= 1; i = i-2) {
            acumulador += i;
        }
        return acumulador;
    }
}
