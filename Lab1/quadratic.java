import java.util.*;
class quadratic
{
            public static void main(String args[])
            {
                        int a,b,c,d,f=0;
                        Scanner scr=new Scanner(System.in);
                        System.out.println("\nEnter the values of a ,b ,c : ");
                        a=scr.nextInt();
                        b=scr.nextInt();
                        c=scr.nextInt();
                        d=(b*b)-(4*a*c);
                        if(d>=0)
                        {       
                                    System.out.println("Roots are real");
                                    f=1;
                        }
                        else
                        System.out.println("No real solutions");
                        if(f==1)
                        {
                                    float r1=(float)(-b+Math.sqrt(d))/(2*a);
                                    float r2=(float)(-b-Math.sqrt(d))/(2*a);
                                    System.out.println("Roots are :   "+r1+" ,"+r2);
                        }
            }
}