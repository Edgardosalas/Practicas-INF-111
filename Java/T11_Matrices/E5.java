package Java.T11_Matrices;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo (n): ");
        int n = scanner.nextInt();

        int[][] matriz = generarMatriz(n);

        System.out.println("La matriz generada es:");
        imprimirMatriz(matriz);
    }

    public static int[][] generarMatriz(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                matriz[i][j] = n - i;
                matriz[n - i - 1][j] = n - i;
                matriz[j][i] = n - i;
                matriz[j][n - i - 1] = n - i;
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
