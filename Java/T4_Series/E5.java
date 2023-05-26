package Java.T4_Series;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=1, p=1, n, i;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
            {
                System.out.println(p+"\t");
                if (c==p)
                    {p=p+1;c=1;}
                else
                    {c=c+1;}
            }
    }
}