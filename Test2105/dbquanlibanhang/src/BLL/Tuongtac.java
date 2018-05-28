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
import javax.swing.JTextArea;
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
    
    public static DefaultTableModel LoadNhanvien()
    {
        ArrayList<Nhanvien> nhanvien = new ArrayList<Nhanvien>();
        DefaultTableModel tablenhanvien = new DefaultTableModel
        (  new Object[][]
            {
            }
            , 
            new String [] 
            {
                "Mã nhân viên", "Tên nhân viên", "Giới tính", "Địa chỉ", "Điện thoại", "Ngày sinh"
            }
        );
        
       nhanvien=NhanvienDAL.getAll();
       for (int i = 0; i < nhanvien.size(); i++) {
                
              tablenhanvien.addRow(new Object[]{nhanvien.get(i).getmanhanvien(),
                  nhanvien.get(i).gettennhanvien(),
                  nhanvien.get(i).getgioitinh(),
                  nhanvien.get(i).getdiachi(),
                  nhanvien.get(i).getdienthoai(),
                  nhanvien.get(i).getngaysinh()});
       }            
           return tablenhanvien;  
    }
    
    public static DefaultTableModel LoadKhach()
    {
        ArrayList<Khach> khach = new ArrayList<Khach>();
        DefaultTableModel tablekhach = new DefaultTableModel
        (  new Object[][]
            {
            }
            , 
            new String [] 
            {
                "Mã khách", "Tên khách", "Địa chỉ", "Điện thoại"
            }
        );
        
       khach=KhachDAL.getAll();
       for (int i = 0; i < khach.size(); i++) {
                
              tablekhach.addRow(new Object[]{khach.get(i).getmakhach(),
                  khach.get(i).gettenkhach(),
                  khach.get(i).getdiachi(),
                  khach.get(i).getdienthoai()});
       }            
           return tablekhach;  
    }
    
    public static DefaultTableModel LoadCTHDBan()
    {
        ArrayList<ChitietHDBan> cthdb = new ArrayList<ChitietHDBan>();
        DefaultTableModel tablecthdb = new DefaultTableModel
        (  new Object[][]
            {
            }
            , 
            new String [] 
            {
                "Mã HĐ bán", "Mã hàng" ,"Số lượng","Đơn giá","Giảm giá","Thành tiền"
            }
        );
        
       cthdb=ChitietHDBanDAL.getAll();
       for (int i = 0; i < cthdb.size(); i++) {
                
              tablecthdb.addRow(new Object[]{cthdb.get(i).getmahdban(),
                  cthdb.get(i).getmahang(),
                  cthdb.get(i).getsoluong(),
                  cthdb.get(i).getdongia(),
                  cthdb.get(i).getgiamgia(),
                  cthdb.get(i).getthanhtien()});
       }            
           return tablecthdb;  
    }
    
    public static DefaultTableModel LoadHDBan()
    {
        ArrayList<HDBan> hdb = new ArrayList<HDBan>();
        DefaultTableModel tablehdb = new DefaultTableModel
        (  new Object[][]
            {
            }
            , 
            new String [] 
            {
                "Mã HĐ Bán", "Mã nhân viên", "Ngày bán", "Mã khách", "Tổng tiền"
            }
        );
        
       hdb=HDBanDAL.getAll();
       for (int i = 0; i < hdb.size(); i++) {
                
              tablehdb.addRow(new Object[]{hdb.get(i).getmahdban(),
                  hdb.get(i).getmanhanvien(),
                  hdb.get(i).getngayban(),
                  hdb.get(i).getmakhach(),
                  hdb.get(i).gettongtien()});
       }            
           return tablehdb;  
    }
    
     
    public static void themchatlieu(JTextField machatlieu,JTextField tenchatlieu,JTable t){
        ChatlieuDAL.insert(machatlieu.getText(),tenchatlieu.getText());
    }
    public static void xoachatlieu(JTextField machatlieu,JTable t){
        ChatlieuDAL.delete(machatlieu.getText());
    }
    public static void suachatlieu(JTextField machatlieu,JTextField tenchatlieu,JTable t){
        ChatlieuDAL.update(machatlieu.getText(),tenchatlieu.getText());
    }
    
    public static void themHang(JTextField mahang, JTextField tenhang, JTextField machatlieu, JTextField soluong, JTextField dongianhap, JTextField dongiaban, JTextField anh, JTextArea ghichu, JTable t){
        HangDAL.insert(mahang.getText(), tenhang.getText(), machatlieu.getText(), Double.parseDouble(soluong.getText()), Double.parseDouble(dongianhap.getText()), Double.parseDouble(dongiaban.getText()), anh.getText(), ghichu.getText());
    }
    public static void xoaHang(JTextField mahang, JTable t){
        HangDAL.delete(mahang.getText());
    }
    public static void suaHang(JTextField mahang, JTextField tenhang, JTextField machatlieu, JTextField soluong, JTextField dongianhap, JTextField dongiaban, JTextField anh, JTextArea ghichu, JTable t){
        HangDAL.update(mahang.getText(), tenhang.getText(), machatlieu.getText(),Double.parseDouble(soluong.getText()),Double.parseDouble(dongianhap.getText()),Double.parseDouble(dongiaban.getText()), anh.getText(), ghichu.getText());
    }
    
    
}
