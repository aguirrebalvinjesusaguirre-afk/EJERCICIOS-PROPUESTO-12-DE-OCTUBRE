import java.util.Scanner;

public class ControlPeso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = entrada.nextDouble();

        if (peso <= 50) {
            System.out.println("Paquete aceptado");
        } else {
            System.out.println("Paquete rechazado");
            System.out.println("Exceso de peso: " + (peso - 50) + " kg");
        }

        entrada.close();
    }
}