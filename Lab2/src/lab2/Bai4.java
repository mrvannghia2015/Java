/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;

public class Bai4 {
   public Bai4()
   {
       Scanner input = new Scanner (System.in);
       System.out.print("+---------------------------+\n");
       System.out.print("1.Giải phương trình bậc nhất, nhập giaiPTB1\n");
       System.out.print("2.Giải phương trình bậc hai, nhập giaiPTB2\n");
       System.out.print("3.Tính tiền điện, nhập tinhtiendien\n");
       System.out.print("4.Kết thúc, nhập 4\n");
       System.out.print("+---------------------------+\n");
       System.out.print("Nhập chức năng: ");
       String n = input.nextLine();
       switch(n)
       {
           case "giaiPTB1":
           {
               new Bai1();
               break;
           }               
           case "giaiPTB2":
           {
               new Bai2();
               break;
           }               
           case "tinhtiendien":
           {
               new Bai3();
               break;
           }              
           case "4": 
               System.exit(0);
           default:
               System.out.print("Nhập lại");
       } 
   }
   public static void main(String[] args)
   {
       new Bai4();
   }
}
