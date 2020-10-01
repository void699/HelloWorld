import java.util.Scanner;
class factorial
{
    public static void main(String [] args)
    {
        int x;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        x=scn.nextInt();
        int f=1;
        for(int i=x; i>=1; i--)
        {
            f=i*i;
        }
        System.out.println(f);
    }
}
   