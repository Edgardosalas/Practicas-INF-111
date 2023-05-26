package Java.T4_Series;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
public class E7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n, c3=1, e=2, conta1=3, conta2=1,a;
        int c23=0, e2=1, conta12=3, conta22=1,a2,sw=0,e22=4;
        n=sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            if (i%2==0)
            {
                {
                    if(sw==0)
                        {
                            {
                                System.out.println(e2+" ");
                                e2=e2+4;
                                sw=1;
                            }
                        }
                    else
                        {
                            System.out.println(e22+" ");
                            c23=c23+1;
                            if(c23==2)
                                {
                                    sw=0;
                                    e22=e22+4;
                                    c23=0;
                                }  
                        }
                }
            }
            else
            {
                if(c3==3)
                    {
                        {
                            e=e+conta1;
                            System.out.println(e+" ");
                            e=e+conta2;
                            a=conta1;
                            conta1=conta2;
                            conta2=a;
                            c3=1;
                        }
                    }
                else
                    {
                        System.out.println(e+" ");
                        c3=c3+1;  
                    }
            }
        }
    }
}