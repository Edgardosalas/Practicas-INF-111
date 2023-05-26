package Java.T6_Lotes;
import java.util.Scanner;
public class E9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder composition = new StringBuilder();

        System.out.println("Ingrese los números (0 ≤ Ai ≤ 9). La lectura se detendrá cuando la composición sea múltiplo de 3:");

        while (true) {
            int number = scanner.nextInt();

            if (number < 0 || number > 9) {
                System.out.println("Número inválido. Por favor, ingrese un número entre 0 y 9.");
                continue;
            }

            composition.append(number);

            if (isMultipleOfThree(composition.toString())) {
                break;
            }
        }

        System.out.println("La composición de los dígitos es múltiplo de 3: " + composition.toString());
    }

    public static boolean isMultipleOfThree(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            char digitChar = number.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }

        return sum % 3 == 0;
    }
}
