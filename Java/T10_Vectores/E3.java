package Java.T10_Vectores;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");

        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        double promedio = calcularPromedio(vector);
        int mayores = contarMayores(vector, promedio);
        int menoresIguales = contarMenoresIguales(vector, promedio);

        System.out.println("El promedio de los datos es: " + promedio);
        System.out.println("Cantidad de elementos mayores al promedio: " + mayores);
        System.out.println("Cantidad de elementos menores o iguales al promedio: " + menoresIguales);
    }

    public static double calcularPromedio(int[] vector) {
        int sum = 0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }

        return (double) sum / vector.length;
    }

    public static int contarMayores(int[] vector, double promedio) {
        int count = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > promedio) {
                count++;
            }
        }

        return count;
    }

    public static int contarMenoresIguales(int[] vector, double promedio) {
        int count = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] <= promedio) {
                count++;
            }
        }

        return count;
    }
}
