package Java.T6_Lotes;
import java.util.Scanner;
public class E7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Ingrese los números (ingrese -1 para finalizar):");

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number >= 0) {
                sum += sumDigits(number);
            }
        }

        System.out.println("La suma de los dígitos es: " + sum);
    }

    public static int sumDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}