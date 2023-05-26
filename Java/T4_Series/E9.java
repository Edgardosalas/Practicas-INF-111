package Java.T4_Series;
import java.util.Scanner;
public class E9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n, p, num;
        n=sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            p=i;
            num=p*p;
            System.out.println(num+" ");
        }
    }
}