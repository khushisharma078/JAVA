import java.util.*;
class Marks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter maths marks:");
        float m=sc.nextFloat();
        System.out.println("Enter physics marks:");
        float ph=sc.nextFloat();
        Float q=m+ph;
        float p=q/2;
        System.out.println("Your final percentage is"+p+"%");
    }
}
