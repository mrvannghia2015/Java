/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Vannghia
 */
public class Bai2 {
    public static void main(String[] args) {
        Bai1 sp1 = new Bai1("",0,0);
        Bai1 sp2 = new Bai1("",0,0);
        sp1.Nhap();
        sp2.Nhap();     
        sp1.Xuat();
        System.out.println("\n");
        sp2.Xuat();
    }
}
