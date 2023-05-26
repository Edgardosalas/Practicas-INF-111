package Java.T10_Vectores;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = scanner.nextInt();

        int[] u = new int[n];
        int[] v = new int[n];

        System.out.println("Ingrese los elementos del vector u:");

        for (int i = 0; i < n; i++) {
            u[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los elementos del vector v:");

        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }

        int[] diferencia = calcularDiferencia(u, v);

        System.out.println("El vector de diferencias es:");
        imprimirVector(diferencia);
    }

    public static int[] calcularDiferencia(int[] u, int[] v) {
        int n = u.length;
        int[] diferencia = new int[n];

        for (int i = 0; i < n; i++) {
            diferencia[i] = u[i] - v[i];
        }

        return diferencia;
    }

    public static void imprimirVector(int[] vector) {
        int n = vector.length;

        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println();
    }
}
