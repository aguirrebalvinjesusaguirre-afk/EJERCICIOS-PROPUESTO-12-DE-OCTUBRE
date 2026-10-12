import java.util.Scanner;

public class TarifaTaxi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la distancia en km: ");
        double km = entrada.nextDouble();

        double tarifa;

        if (km <= 3) {
            tarifa = 8;
        } else {
            tarifa = 8 + (km - 3) * 2.50;
        }

        if (km < 0) {
            System.out.println("Distancia no valida");
        } else {
            System.out.println("Tarifa total: S/ " + tarifa);
        }

        entrada.close();
    }
}