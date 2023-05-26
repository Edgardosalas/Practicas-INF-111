package Java.T5_Sumatorias;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n, i, num=6, s=0, maceta;
        n=sc.nextInt();
        if(n>=4)
            {
            for (i=1;i<=n-3;i++)
                {
                    if(i%2==0)
                    {
                        s=s+((num+num+1+num+2)/(num+3));
                        num=num+4;
                    }
                    else
                    {
                        s=s+(num/(num+1));
                        num=num+2;
                    }
                }
                s=s+0.8;
            }
        else
            {
                if(n==3)
                    {
                        s=4/5;
                    }
            }
        maceta=Math.round(s*100);
        maceta=maceta/100;
        System.out.println(maceta);
    }
}
