import java.util.Scanner;

public class CalculadoraSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la Calculadora Simple");

        while (true) {
            System.out.println("\nElige una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            if (opcion == 0) {
                System.out.println("Gracias por usar la Calculadora Simple. ¡Adiós!");
                break;
            }

            double num1, num2;
            System.out.println("Ingresa dos números:");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();

            switch (opcion) {
                case 1: // Suma
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2: // Resta
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3: // Multiplicación
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4: // División
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta nuevamente.");
                    break;
            }
        }
        scanner.close();
    }
}}