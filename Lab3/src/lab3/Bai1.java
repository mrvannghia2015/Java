/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;
import javax.swing.text.html.HTML;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Vannghia
 */
public class Bai1 {
    public Bai1()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = input.nextInt();
        if(laSNT(n)==true)
            System.out.print(n+" Là số nguyên tố");
        else  System.out.print(n+" Không là số nguyên tố");
    }
    
    public boolean laSNT(int n)
    {
        boolean kt = true;
        int i;
        for(i=2;i<n-1;i++)
            if(n%i==0)
            {
                kt=false;
                break;
            }
        i++;
        return kt;
    }
    public static void main(String [] args)
    {
        new Bai1();
    }
}
