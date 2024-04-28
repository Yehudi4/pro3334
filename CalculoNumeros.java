import java.util.Scanner;

public class CalculoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        int mayor, menor1, menor2, diferenciaMayorMenor;

        // Solicitar al usuario que ingrese tres números enteros diferentes
        System.out.println("Ingrese el primer número entero:");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número entero:");
        num3 = scanner.nextInt();

        // Determinar el número mayor
        mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        // Determinar los dos números menores
        if (num1 < num2) {
            menor1 = num1;
            menor2 = num2;
        } else {
            menor1 = num2;
            menor2 = num1;
        }
        if (num3 < menor1) {
            menor2 = menor1;
            menor1 = num3;
        } else if (num3 < menor2) {
            menor2 = num3;
        }

        // Calcular la suma de los dos números más pequeños
        int sumaMenores = menor1 + menor2;

        // Calcular la diferencia entre los dos números más grandes
        if (mayor == num1) {
            if (num2 > num3) {
                diferenciaMayorMenor = num1 - num2;
            } else {
                diferenciaMayorMenor = num1 - num3;
            }
        } else if (mayor == num2) {
            if (num1 > num3) {
                diferenciaMayorMenor = num2 - num1;
            } else {
                diferenciaMayorMenor = num2 - num3;
            }
        } else {
            if (num1 > num2) {
                diferenciaMayorMenor = num3 - num1;
            } else {
                diferenciaMayorMenor = num3 - num2;
            }
        }

        // Mostrar resultados
        System.out.println("La suma de los dos números más pequeños es: " + sumaMenores);
        System.out.println("La diferencia entre los dos números más grandes es: " + diferenciaMayorMenor);
        System.out.println("El número más grande es: " + mayor);
    }
}
