import java.util.*;
class Divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("yes divisible");
        }
        else{
           System.out.println("no not divisible");
        }
    }
}
