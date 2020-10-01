import java.util.Scanner;
class reversePalindrome
{
    void main()
    {
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = n;
        while(n>0)
        {   
            reverse = reverse * 10;
             reverse = reverse + n%10;
            n=n/10;
        }
        if else (reverse == y)
        {
            System.out.println("The number is palindrome");
        else{
            System.out.println("The number is not palindrome");
        }
    }
}