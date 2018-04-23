/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Vannghia
 */
public class Bai4 {
    public Bai4()
    {
        int sophantu,i;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của 2 mảng: ");
        sophantu = input.nextInt();
        String[] hoten = new String[sophantu] ;
        float[] diem = new float [sophantu];
        String[] hocluc = new String[sophantu];
        for(i=0;i<sophantu;i++)
        {
            System.out.printf("Nhập tên học sinh thứ %d: ",i);
            hoten[i] = input.nextLine();
            System.out.printf("Nhập điểm học sinh thứ %d:",i);
            diem[i] = input.nextFloat();
        }
        for(i=0;i<sophantu;i++)
        {
            if(diem[i]<5) hocluc[i] = "Yếu";
            else if(diem[i]<6.5) hocluc[i] = "Trung Bình";
            else if(diem[i]<7.5) hocluc[i] = "Khá";
            else if(diem[i]<9) hocluc[i] = "Giỏi";
            else  hocluc[i] = "Xuất sắc";
        }
        for(i =0 ;i<sophantu;i++)
            System.out.print("\n"+hoten[i]+"   "+diem[i]+"   "+hocluc[i]);
    }
    public static void main(String[] args) {
        new Bai4();
    }
}
