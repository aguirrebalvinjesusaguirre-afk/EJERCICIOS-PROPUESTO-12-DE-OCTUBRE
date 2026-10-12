import java.util.Scanner;

public class SalarioHorasExtras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        double horas = entrada.nextDouble();

        double salario;

        if (horas > 40) {
            salario = 40 * 20 + (horas - 40) * 40;
        } else {
            salario = horas * 20;
        }

        System.out.println("Salario total: S/ " + salario);
        entrada.close();
    }
}