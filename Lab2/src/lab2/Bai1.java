/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;

public class Bai1 {
    public Bai1()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập các hệ số của phương trình ax+b=0\n");
        System.out.print("Nhập hệ số a: ");
        float a = input.nextFloat();
        System.out.print("Nhập hệ số b: ");
        float b = input.nextFloat();
        if(a==0)
        {
            if(b==0) System.out.print("Phương trình vô số nghiệm");
            else System.out.print("Phương trình vô nghiệm");
        }
        else
        {
            float x=-b/a;
            System.out.print("Nghiệm của phương trình là "+x+"\n");
        }
        
    } 
    public static void main(String[] args)
    {
        new Bai1();
    }
}
