package Java.T6_Lotes;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Ingrese los números del lote (ingrese un número negativo para finalizar):");
        
        while (true) {
            int number = scanner.nextInt();
            
            if (number < 0) {
                break;
            }
            
            if (isPrime(number)) {
                sum += number;
            }
        }
        
        System.out.println("La suma de los números primos es: " + sum);
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}