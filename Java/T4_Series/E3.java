package Java.T4_Series;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i, c2=2, n, conta=0;
        int x=-1, y=1, t=x+y;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
                {        
                    System.out.println(t+" ");
                    x=y;
                    y=t;
                    t=x+y;
                }
            else
                {
                    if (c2%2==0)
                        {
                            System.out.println(c2+" ");
                            c2=1;
                            conta=conta+1;
                        }
                    else
                        {
                            if (conta==4)
                                {
                                    c2=c2+4;
                                    System.out.println(c2);
                                    conta=0;
                                }
                            else
                                {                                    
                                    c2=c2+2;
                                    System.out.println(c2);
                                    conta=conta+1;
                                }
                        }
                }
        }
    }
}