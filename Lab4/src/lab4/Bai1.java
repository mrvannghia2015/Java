/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Vannghia
 */
public class Bai1 {
    private String tenSp ="";
    private double donGia,giamGia;

    Bai1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getTenSp()
    {
        return this.tenSp;
    }
    public void setTenSp(String tenSp)
    {
        this.tenSp = tenSp;
    }
    
    public double getDonGia()
    {
        return this.donGia;
    }
    public void setTenSp(double donGia)
    {
        this.donGia = donGia;
    }
    
    public double getgiamGia()
    {
        return this.giamGia;
    }
    public void setGiamGia(double giamGia)
    {
        this.giamGia = giamGia;
    }
       
    public Bai1(String tenSp,double donGia,double giamGia)
    {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public Bai1(String tenSp,double donGia)
    {
        this(tenSp,donGia,0);
    }
    public void Nhap()
    {
        Scanner input = new Scanner(System.in); 
        System.out.println("Nhập tên sản phẩm: ");
        tenSp = input.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = input.nextDouble();
        System.out.println("Nhập giảm giá: ");
        giamGia = input.nextDouble();
    }
    private double getThueNhapKhau(double dongia)
    {
        return (dongia*10/100);
    }
    public void Xuat()
    {
        System.out.print(tenSp+"   "+donGia+"   "+"   "+giamGia+"   "+getThueNhapKhau(donGia));
    }
    public static void main(String[] args) {
        Bai1 t = new Bai1("", 0, 0);
        t.Nhap();
        t.Xuat();
    }
            
    

}
