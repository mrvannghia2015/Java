
package lab2;

import java.util.*;

public class Bai3 {
    public Bai3()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số điện đã sử dụng trong tháng: ");
        int sd = input.nextInt();
        if(sd<50)
        {
            long tien = sd*1000;
            System.out.print("Tiền điện là: "+tien);
        }
        else
        {
            long tien = 50*1000 +(sd-50)*1200;
            System.out.print("Tiền điện là: "+tien);
        }  
    }
    public static void main(String[] args)
    {
        new Bai3();
    }
}
