/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.*;


/**
 *
 * @author Vannghia
 */
public class Bai1 {
    
    public static void main(String[] args) {
        ArrayList<Double> a  = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        while(true)
        {
            double x = input.nextDouble();
            a.add(x);
            String c = input.nextLine();
            System.out.print("Nhập thêm (Y/N)? :");
            if(input.nextLine().equals("N"))
            {
                break;
            }
        }
        for(Object x:a)
        {
            System.out.print(x +"   ");
        }

    }
}
