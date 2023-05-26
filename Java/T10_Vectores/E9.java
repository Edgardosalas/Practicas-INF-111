package Java.T10_Vectores;
import java.util.Scanner;
public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        llenarVector(vector);
        imprimirVector(vector);

        double promedioPrimos = calcularPromedioPrimos(vector);
        System.out.println("El promedio de los números primos es: " + promedioPrimos);

        if (existeValorEntero(vector, promedioPrimos)) {
            System.out.println("El valor entero del promedio existe en el vector.");
        } else {
            System.out.println("El valor entero del promedio no existe en el vector.");
        }
    }

    public static void llenarVector(int[] vector) {
        int n = vector.length;

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public static void imprimirVector(int[] vector) {
        int n = vector.length;

        System.out.print("Vector: ");

        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calcularPromedioPrimos(int[] vector) {
        int n = vector.length;
        int sumaPrimos = 0;
        int cantidadPrimos = 0;

        for (int i = 0; i < n; i++) {
            if (esPrimo(vector[i])) {
                sumaPrimos += vector[i];
                cantidadPrimos++;
            }
        }

        return (double) sumaPrimos / cantidadPrimos;
    }

    public static boolean existeValorEntero(int[] vector, double valor) {
        int n = vector.length;
        int valorEntero = (int) valor;

        for (int i = 0; i < n; i++) {
            if (vector[i] == valorEntero) {
                return true;
            }
        }

        return false;
    }

}
