
package lab1;

import java.util.Scanner;

public class Bai3{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập 1 cạnh của lập phương: ");
        double canh = input.nextDouble();
        double thetich = Math.pow(canh, 3);
        System.out.printf("Thể tích của khối lập phương: %f",thetich);
    }
    
}
