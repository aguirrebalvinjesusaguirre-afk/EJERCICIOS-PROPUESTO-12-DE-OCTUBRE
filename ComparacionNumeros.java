import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double a = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double b = entrada.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        double c = entrada.nextDouble();

        double mayor;
        double menor;

        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }

        if (a <= b && a <= c) {
            menor = a;
        } else if (b <= a && b <= c) {
            menor = b;
        } else {
            menor = c;
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Diferencia: " + (mayor - menor));

        entrada.close();
    }
}