import java.util.*;
class Digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        String s=sc.nextLine();
        int l=0;
        for(int i=0;i<=s.length();i++)
        {
            l++;
        }
        System.out.println(l);
    }
}
