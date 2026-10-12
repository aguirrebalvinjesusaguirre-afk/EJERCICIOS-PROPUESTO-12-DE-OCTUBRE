import java.util.Scanner;

public class PrestamoBancario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su sueldo: S/ ");
        double sueldo = entrada.nextDouble();

        double prestamo;

        if (sueldo >= 3000) {
            prestamo = sueldo * 5;
        } else {
            prestamo = sueldo * 2;
        }

        System.out.println("Prestamo maximo: S/ " + prestamo);
        entrada.close();
    }
}