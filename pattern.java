import java.util.Scanner;
class pattern1
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.println("x  ");
        
            }
            
        System.out.println();
    }
        
        
        
    }
}
