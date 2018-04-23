/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Vannghia
 */
import java.util.*;
import lab5.SanPham;
public class Bai3 {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<SanPham>();
        Nhap(ds);
        menu(ds);
        
    }
    
    public static void menu(ArrayList<SanPham> ds)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nNhập chức năng cần làm");
        System.out.print("\nNhập 1 để xuất danh sách sản phẩm giảm dần theo giá: ");
        System.out.print("\nNhập 2 để tìm và xoá sản phẩm: ");
        System.out.print("\nNhập 3 để xuẩt giá trung bình các sản phẩm: ");
        System.out.print("\nMời nhập chức năng: ");
        int i = input.nextInt();
        switch(i)
        {
            case 1: 
                sapxep(ds);
                break;
                
            case 2: 
                xoa(ds);
                break;
            case 3: 
                giatrungbinh(ds);
                break;
            default: 
            {
                System.out.print("Nhập lại:");
                break;
            }
            
        } 
    }   

    public static void Nhap(ArrayList<SanPham> ds)
    {
        while(true)
        {
            SanPham s = new SanPham();
            System.out.print("Nhập tên sản phẩm ");
            String tensp=(new Scanner(System.in)).nextLine();
            s.settensp(tensp);
            System.out.print("Nhập giá sản phẩm ");
            int gia =  (new Scanner(System.in)).nextInt();
            s.setgia(gia);
            ds.add(s);
            
            
            System.out.print("Nhập thêm (Y/N)? :");
            if((new Scanner(System.in)).nextLine().equals("N"))
            {
                break;
            }
        } 
    }
    
    public static void Xuat(ArrayList<SanPham> ds)
    {
        for(int i=0;i<ds.size();i++)
        {
            System.out.print("\n"+ds.get(i).gettensp()+"   "+ds.get(i).getgia());
        }
    }
    
    public static void sapxep(ArrayList<SanPham> ds)
    {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham t, SanPham t1) {
                return Double.compare(t.getgia(),t1.getgia());
            }
        };
        
        Collections.sort(ds,comp);
        Collections.reverse(ds);
        System.out.println("\nDanh sách các sản phẩm sau khi sắp xếp: ");
        Xuat(ds);
    }
    
    public static void xoa(ArrayList<SanPham> ds)
    {
        System.out.println("\nNhập tên sản phẩm cần xoá:");
        String tam = (new Scanner(System.in)).nextLine();
        for(int i=0;i<ds.size();i++)
            if(ds.get(i).gettensp().equals(tam)) 
            {
                ds.remove(i);
                break;
            }
        
        System.out.print("\nDanh sách sản phẩm sau khi xoá:");
        Xuat(ds);
    }
    
    public static void giatrungbinh(ArrayList<SanPham> ds)
    {
        int s=0;
        for(int i=0;i<ds.size();i++)
            s+=ds.get(i).getgia();
        System.out.print("\nGía trung bình các sản phẩm là "+s/ds.size());
    }
            
}
