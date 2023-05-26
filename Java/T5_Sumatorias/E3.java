package Java.T5_Sumatorias;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n, i, num1=0, num2=0, num3=0, num4=0, num5=1, num6=0, s=0;
        n=sc.nextInt();
        for(i=1;i<n;i++)
            {
                s=s+num6;
                num6=num5+num4+num3+num2+num1;
                num1=num2;
                num2=num3;
                num3=num4;
                num4=num5;
                num5=num6;
            }
            System.out.println(s+1);
    }
}
