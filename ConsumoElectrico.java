import java.util.Scanner;

public class ConsumoElectrico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el consumo en kWh: ");
        double consumo = entrada.nextDouble();

        double monto;

        if (consumo <= 100) {
            monto = consumo * 0.80;
        } else {
            monto = consumo * 1.20;
        }

        System.out.println("Monto a pagar: S/ " + monto);
        entrada.close();
    }
}