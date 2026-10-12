import java.util.Scanner;

public class SistemaPagoEmpleados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        double horas = entrada.nextDouble();

        System.out.print("Ingrese el pago por hora: S/ ");
        double pagoHora = entrada.nextDouble();

        double salarioBruto = horas * pagoHora;
        double impuesto;
        double bono = 0;

        if (salarioBruto > 2500) {
            impuesto = salarioBruto * 0.12;
        } else {
            impuesto = salarioBruto * 0.07;
        }

        if (horas > 48) {
            bono = 300;
        }

        double salarioNeto = salarioBruto - impuesto + bono;

        System.out.println("\n--- BOLETA DE PAGO ---");
        System.out.println("Salario bruto: S/ " + salarioBruto);
        System.out.println("Impuesto: S/ " + impuesto);
        System.out.println("Bono: S/ " + bono);
        System.out.println("Salario neto: S/ " + salarioNeto);

        entrada.close();
    }
}