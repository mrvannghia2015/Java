/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;


import java.util.*;

/**
 *
 * @author Vannghia
 */
public class Bai3 {
    public Bai3()
    {
    int a,i,dem=0;    
    float min,sum=0,tbc=0;
    Scanner input = new Scanner(System.in);
    System.out.print("Nhập số phần tử của mảng: ");
    a = input.nextInt();
    float[] n = new float[a];
    for(i=0;i<a;i++)
    {
        System.out.printf("n[%d] = ",i);
        n[i] = input.nextFloat();
    }
    Arrays.sort(n);
    System.out.println("\nCác phần tử của mảng sau khi sắp xếp: ");
    for(i=0;i<a;i++)
            System.out.printf(" %f ",n[i]);
    min=n[0];
    for(i=0;i<a;i++)
    min = Math.min(min, n[i]);
    System.out.println("\nSố nhỏ nhất là: "+min);
    System.out.println("\nCác số chia hết cho 3:");
    for(i=0;i<a;i++)
        if(n[i]%3==0) 
        {
            sum+=n[i];
            System.out.printf(" %f ",n[i]);
            dem++;
        }
    tbc = sum/dem;
    System.out.printf("\nTrung bình cộng các phần tử chia hết cho 3: %f",tbc);
     
    }
    
    public static void main(String[] args) {
        new Bai3();
        
    }
}
