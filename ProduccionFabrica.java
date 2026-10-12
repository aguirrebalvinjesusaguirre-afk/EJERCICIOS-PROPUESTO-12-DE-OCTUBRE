import java.util.Scanner;

public class ProduccionFabrica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de piezas: ");
        int piezas = entrada.nextInt();

        double valor = piezas * 5;
        double incentivo;

        if (piezas > 1000) {
            incentivo = valor * 0.15;
        } else {
            incentivo = valor * 0.08;
        }

        double total = valor + incentivo;

        System.out.println("Valor de produccion: S/ " + valor);
        System.out.println("Incentivo: S/ " + incentivo);
        System.out.println("Total con incentivo: S/ " + total);

        entrada.close();
    }
}