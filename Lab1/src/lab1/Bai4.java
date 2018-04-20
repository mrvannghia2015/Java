
package lab1;

import java.util.Scanner;

public class Bai4{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập các hệ số của phương trình ax2+bx+c ");
        System.out.print("\nNhập hệ số a: ");
        double a = input.nextDouble();
        System.out.print("\nNhập hệ số b: ");
        double b = input.nextDouble();
        System.out.print("\nNhập hệ số c: ");
        double c = input.nextDouble();
        double delta = Math.pow(b,2)-4*a*c;
        double candelta = Math.sqrt(delta);
        System.out.printf("\nCăn delta là: %f ",candelta);
    }
    
}
