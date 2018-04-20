
package lab1;

import java.util.Scanner;

public class Bai2 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double dai = input.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = input.nextDouble();
        double CV = (dai+rong)*2;
        System.out.printf("\nChu vi hình chữ nhật: %f ",CV);
        double DT = dai*rong;
        System.out.printf("\nDiện tích hình chữ nhật: %f ",DT);
        double cnn = Math.min(dai, rong);
        System.out.printf("\nCạnh nhỏ nhât là %f",cnn );
    }
    
}
