package lab01;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Size: ");
        int size = scanner.nextInt();
        
        System.out.print("Value of x: ");
        int x = scanner.nextInt();
        
        Polynomial p = new Polynomial(size);
        p.createPolynomial();
        
        System.out.print("\nP(x) = ");
        p.printPolynomial();
        
        System.out.println("\nP("+ p.getValueOfX() +") = " + p.calculate());
    }
}
