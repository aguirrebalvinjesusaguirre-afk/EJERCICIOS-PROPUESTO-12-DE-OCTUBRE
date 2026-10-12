import java.util.Scanner;

public class RendimientoAcademico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el promedio (0 a 20): ");
        double promedio = entrada.nextDouble();

        if (promedio < 0 || promedio > 20) {
            System.out.println("Promedio no valido");
        } else if (promedio < 11) {
            System.out.println("Desaprobado");
        } else if (promedio < 15) {
            System.out.println("Regular");
        } else if (promedio < 18) {
            System.out.println("Bueno");
        } else {
            System.out.println("Excelente");
        }

        entrada.close();
    }
}