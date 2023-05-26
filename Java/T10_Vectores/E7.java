package Java.T10_Vectores;
import java.util.Scanner;
public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número n mayor que 0: ");
        int n = scanner.nextInt();

        int[] vector = generarVector(n);

        System.out.println("El vector generado es:");
        imprimirVector(vector);
    }

    public static int[] generarVector(int n) {
        int[] vector = new int[2 * n];

        for (int i = 0; i < n; i++) {
            vector[i] = n - i;
            vector[2 * n - 1 - i] = n - i;
        }

        return vector;
    }

    public static void imprimirVector(int[] vector) {
        int n = vector.length;

        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println();
    }
}
