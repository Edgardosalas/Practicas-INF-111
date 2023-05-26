package Java.T6_Lotes;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n, num, x=0, y=999999999, i, p;
        n=sc.nextInt();
        for (i=1;i<=n;i++)
            {
                num=sc.nextInt();
                if(num>x)
                    {
                        x=num;
                    }
                if(num<y)
                    {
                        y=num;
                    }
            }
            System.out.println("mayor: "+x);
            System.out.println("menor: "+y);
            while (x != 0) {
                p=x;
                x=y%x;
                y=p;
            }
            System.out.println("MCD: "+y);
    }
}