package Java.T10_Vectores;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");

        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        int max = encontrarMaximo(vector);
        int min = encontrarMinimo(vector);
        double promedio = calcularPromedio(vector);

        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
        System.out.println("El promedio es: " + promedio);
    }

    public static int encontrarMaximo(int[] vector) {
        int max = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }

        return max;
    }

    public static int encontrarMinimo(int[] vector) {
        int min = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
        }

        return min;
    }

    public static double calcularPromedio(int[] vector) {
        int sum = 0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }

        return (double) sum / vector.length;
    }
}
