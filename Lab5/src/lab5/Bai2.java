/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Vannghia
 */
public class Bai2 {

    
    public static void main(String[] args) {
        ArrayList<String> a  = new ArrayList<String>();
        Nhap(a);
        menu(a);

    }
    
    public static void menu(ArrayList<String> a)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nNhập chức năng cần làm");
        System.out.print("\nNhập 1 để xuất: ");
        System.out.print("\nNhập 2 để xuất dãy ngẫu nhiên: ");
        System.out.print("\nNhập 3 để xuất dãy sắp xếp giảm dần: ");
        System.out.print("\nNhập 4 để xoá 1 họ tên: ");
        System.out.print("\nMời nhập chức năng: ");
        int i = input.nextInt();
        switch(i)
        {
            case 1: 
                Xuat(a);
                break;
                
            case 2: 
                ngaunhien(a);
                break;
            case 3: 
                sapxep(a);
                break;
            case 4: 
                xoa(a);
                break;
            default: 
            {
                System.out.print("Nhập lại:");
                break;
            }
            
        } 
    }   
    
    public static void Nhap(ArrayList<String> a)
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.print("Nhập họ và tên: ");
            String x =  input.nextLine();
            a.add(x);
            System.out.print("Nhập thêm (Y/N)? :");
            if(input.nextLine().equals("N"))
            {
                break;
            }
        } 
        
    }
    public static void Xuat(ArrayList<String> a)
    {
        for(Object x:a)
        {
            System.out.print(x+"   ");
        }
    }

    public static void ngaunhien(ArrayList<String> a)
    {
        System.out.println("\nDãy sau khi hoán đổi ngẫu nhiên:");
        Collections.shuffle(a);
        for(Object x:a)
        {
            System.out.print(x +"   ");
        }
    }
    
    public static void sapxep(ArrayList<String> a)
    {
        System.out.println("\nDãy sau khi sắp xếp giảm dần:");
        Collections.sort(a);
        Collections.reverse(a);
        for(Object x:a)
        {
            System.out.print(x +"   ");
        }
    }
    
    public static void xoa(ArrayList<String> a)
    {
        Scanner t = new Scanner(System.in);
        System.out.println("\nNhập tên cần xoá:");
        String tam = t.nextLine();
        for(int i=0;i<a.size();i++)
            if(a.get(i).equals(tam)) 
            {
                a.remove(i);
                break;
            }
        System.out.println("\nDãy sau khi xoá phần tử:");
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i) +"   ");
        }
    }
}
