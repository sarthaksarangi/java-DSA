import java.util.Scanner;
import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner (System.in);
        int a;
        int b;
        int x;
        int y;


       
        a= sc.nextInt();
        
        b= sc.nextInt();
        
        x= sc.nextInt();
        
        y= sc.nextInt();
        int totalcost=a*x+b*y;
        if (a>=1 && a<=1000){
            if(b>=1 && b<=1000){
                if(x>=1 && x<=1000){
                    if(y>=1 && y<=1000){
                        System.out.println(+totalcost);

                    }
                }

            }

        }

        sc.close();












    }
}
