package ciclooperacionesbasicas;

import java.util.Scanner;

public class CicloOperacionesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    realizarMultiplicacion();
                    break;
                case 4:
                    realizarDivision();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
    }

    public static void realizarSuma() {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros;

        System.out.print("Ingresa la cantidad de números a sumar: ");
        cantidadNumeros = scanner.nextInt();

        int resultado = 0;
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            resultado += numero;
        }

        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void realizarResta() {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros;

        System.out.print("Ingresa la cantidad de números a restar: ");
        cantidadNumeros = scanner.nextInt();

        System.out.print("Ingresa el número 1: ");
        int resultado = scanner.nextInt();

        for (int i = 1; i < cantidadNumeros; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            resultado -= numero;
        }

        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void realizarMultiplicacion() {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros;

        System.out.print("Ingresa la cantidad de números a multiplicar: ");
        cantidadNumeros = scanner.nextInt();

        int resultado = 1;
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            resultado *= numero;
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void realizarDivision() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingresa el divisor: ");
        int divisor = scanner.nextInt();

        if (divisor != 0) {
            double resultado = (double) dividendo / divisor;
                        System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}


