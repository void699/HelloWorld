

import java.util.Scanner;
public class Electricbill
{
    private String s;
    private int units;
    private double bill;
    void accept()
    {
        Scanner ap=new Scanner(System.in);
        System.out.println("Enter your name:");
        s=ap.next();
        System.out.println("Enter number of units consumed:");
        units=ap.nextInt();
    }
    void calculate()
    {
        if(units<=100){
            bill=2.0*units;
        }
        else if(units>100 && units<=200){
            bill=100 * 2.0 + (units-100) * 3.0;
        }
        else{
            bill=100 * 2.0 + (units - 100) * 3.0 + (units - 200) * 5.0;
            double surcharge = bill * 2.5/100;
            bill = bill+surcharge;
        }
    }     
    void print()
    {
        System.out.println("Name of Customer:" + s);
        System.out.println("Number of Units consumed are:" + units);
        System.out.println("Total Bill:"+" "+ bill);
    }
    public static void main(String[]args)
    {
        Electricbill elecbill=new Electricbill();
        elecbill.accept();
        elecbill.calculate();
        elecbill.print();
    }
}
    