/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.*;
import DAL.*;
import PL.Hanghoa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.naming.spi.DirStateFactory;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Van Nghia
 */
public class Tuongtac {
    
    public static DefaultTableModel Loadchatlieu()
    {
        ArrayList<Chatlieu> chatlieu = new ArrayList<Chatlieu>();
        DefaultTableModel tablechatlieu = new DefaultTableModel
        (  new Object[][]
            {
            }
            , 
            new String [] 
            {
                "Mã chất liệu", "Tên chất liệu"
            }
        );
        
       chatlieu=ChatlieuDAL.getAll();
       for (int i = 0; i < chatlieu.size(); i++) {
                
              tablechatlieu.addRow(new Object[]{chatlieu.get(i).getmachatlieu(),chatlieu.get(i).gettenchatlieu()});
       }            
           return tablechatlieu;  
    }
    
    public static DefaultTableModel LoadHang()
    {
        ArrayList<Hang> hang = new ArrayList<Hang>();
        DefaultTableModel tablehang = new DefaultTableModel
        (  new Object[][]
            {
            }
            , 
            new String [] 
            {
                "Mã hàng", "Tên hàng","Mã chất liệu","Số lượng","Đơn giá nhập","Đơn giá bán","Ảnh","Ghi chú"
            }
        );
        
       hang=HangDAL.getAll();
       for (int i = 0; i < hang.size(); i++) {
                
              tablehang.addRow(new Object[]{hang.get(i).getmahang(),
                                            hang.get(i).gettenhang(),
                                            hang.get(i).getmachatlieu(),
                                            hang.get(i).getsoluong(),
                                            hang.get(i).getdongianhap(),
                                            hang.get(i).getdongiaban(),
                                            hang.get(i).getanh(),
                                            hang.get(i).getghichu()});
       }            
           return tablehang;  
    }
    public static void themchatlieu(JTextField machatlieu,JTextField tenchatlieu,JTable t){
        ChatlieuDAL.insert(machatlieu.getText(),tenchatlieu.getText());
        Loadchatlieu();
    }
    public static void xoachatlieu(JTextField machatlieu,JTable t){
        ChatlieuDAL.delete(machatlieu.getText());
        Loadchatlieu();
    }
    public static void suachatlieu(JTextField machatlieu,JTextField tenchatlieu,JTable t){
        ChatlieuDAL.update(machatlieu.getText(),tenchatlieu.getText());
        Loadchatlieu();
    }
    
    
}
