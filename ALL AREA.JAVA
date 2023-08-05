import java.util.*;
class Finally
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int radius=sc.nextInt();
        float a=3.14f*(radius*radius);
        int c=l*b;
        int si=(p*r*t)/100;
        System.out.println("area of circle is"+a);
        System.out.println("area of rectangle is"+c);
        System.out.println("simple intrest is"+si);
    }
}
