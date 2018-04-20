/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;

public class Bai2 {
    public Bai2()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập các hệ số của phương trình ax2+bx+c=0\n");
        System.out.print("Nhập hệ số a: ");
        float a = input.nextFloat();
        System.out.print("Nhập hệ số b: ");
        float b = input.nextFloat();
        System.out.print("Nhập hệ số c: ");
        float c = input.nextFloat();
        if(a==0)
        {
            float x=-c/b;
            System.out.print("Nghiệm của phương trình là: "+x);
        }
        else
        {
            float delta = (float) (Math.pow(b,2) - 4*a*c);
            System.out.print("Căn delta "+delta+"\n");
            if(delta==0) 
            {
                float xk=-b/(2*a);
                System.out.print("Phương trình có nghiệm kép x1 = x2 = "+xk+"\n");
            }    
            if(delta<0) System.out.print("Phương trình vô nghiệm\n");
            else
            {
                if(delta>0)
                {
                float x1=(float) ((-b+Math.sqrt(delta))/(2*a));
                float x2=(float) ((-b-Math.sqrt(delta))/(2*a));
                System.out.print("Phương trình có 2 nghiệm x1= "+x1+"  x2= "+x2+"\n");
                }
            }
        }
    }
    public static void main(String[] args)
    {
        new Bai2();
    }
    
}
