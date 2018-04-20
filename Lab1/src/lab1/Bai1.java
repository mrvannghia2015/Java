
package lab1;

import java.util.Scanner;

public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        //System.out.printf("%s %f điểm",hoTen,diemTB);
        //System.out.println(hoTen+" "+diemTB+" điểm");
        System.out.print(hoTen+" "+diemTB+" điểm");
    }
    
}
