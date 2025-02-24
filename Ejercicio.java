import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de Calculadora y Ejercicios");

        while (true) {
            System.out.println("\nElige una opción:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Ejercicio día jueves");
            System.out.println("6. Ejercicio día lunes");
            System.out.println("7. Imprimir día de descanso");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            if (opcion == 0) {
                System.out.println("Gracias por usar el programa. ¡Adiós!");
                break;
            }

            double num1, num2;
            switch (opcion) {
                case 1: // Suma
                    System.out.println("Ingresa dos números:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2: // Resta
                    System.out.println("Ingresa dos números:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3: // Multiplicación
                    System.out.println("Ingresa dos números:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4: // División
                    System.out.println("Ingresa dos números:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero.");
                    }
                    break;
                case 5: // Ejercicio día jueves
                    System.out.println("¡Hoy es día de ejercicio de jueves! Asegúrate de hacer una rutina completa.");
                    break;
                case 6: // Ejercicio día lunes
                    System.out.println("¡Hoy es día de ejercicio de lunes! Empieza la semana con energía.");
                    break;
                case 7: // Día de descanso
                    System.out.println("¡Hoy es tu día de descanso! Relájate y disfruta.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta nuevamente.");
                    break;
            }
        }
        scanner.close();
    }
}
