package Java.T4_Series;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=-1, y=1, t=x+y, n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
            {
                System.out.println(t+" ");
                x=y;
                y=t;
                t=x+y;
            }
    }
}
