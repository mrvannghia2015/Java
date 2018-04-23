/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Vannghia
 */
public class Bai2 {
    public Bai2()
    {
       int i,j;
       for(i=1;i<=9;i++)
           for(j=1;j<=10;j++)
               System.out.print("\n"+i+" x "+j+" = "+i*j );
        System.out.println("  ");
    }
    public static void main(String[] args) {
        new Bai2();
    }
}
