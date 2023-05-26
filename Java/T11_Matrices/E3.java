package Java.T11_Matrices;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        char[][] matriz = generarMatriz(cadena);

        System.out.println("La matriz generada es:");
        imprimirMatriz(matriz);
    }

    public static char[][] generarMatriz(String cadena) {
        int n = cadena.length();
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = cadena.charAt(i);
                } else {
                    matriz[i][j] = '-';
                    matriz[j][i] = '-';
                }
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(char[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
