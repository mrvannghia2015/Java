/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Nhanvien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;

/**
 *
 * @author Van Nghia
 */
public class NhanvienDAL {
    public static ArrayList<Nhanvien> getAll()
    {
        ArrayList<Nhanvien> nhanvien = new ArrayList<Nhanvien>();
        Connection con = DBConnect.Moketnoi();
        try {
            Statement stm = con.createStatement();
            String sqlselect="select * from Nhanvien";
            ResultSet rs = stm.executeQuery(sqlselect);     
            while(true)
            {
                if(!rs.next()) break;
                String manhanvien = rs.getString("Manhanvien");
                String tennhanvien = rs.getString("Tennhanvien");
                Byte gioitinh = rs.getByte("Gioitinh");
                String diachi = rs.getString("Diachi");
                String dienthoai= rs.getString("Dienthoai");
                Date ngaysinh = rs.getDate("Ngaysinh");
                Nhanvien NV = new Nhanvien(manhanvien, tennhanvien, gioitinh, diachi, dienthoai,ngaysinh);
                nhanvien.add(NV);
            }
            return nhanvien;
        } 
        catch (SQLException e) {
        }
        return null;
    }   
    
    public static void insert (String manhanvien, String tennhanvien, Integer gioitinh, String diachi, String dienthoai, String ngaysinh)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqlinsert="insert into Nhanvien(Manhanvien,Tennhanvien,Gioitinh,Diachi,Dienthoai,Ngaysinh) "
                    + "values('"+manhanvien+"','"+tennhanvien+"','"+gioitinh+"','"+diachi+"','"+dienthoai+"','"+ngaysinh+"')";
            
            ResultSet rs=stm.executeQuery(sqlinsert);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update (String manhanvien, String tennhanvien, Integer gioitinh, String diachi, String dienthoai, String ngaysinh)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqlupdate="update Nhanvien set Tennhanvien='"+tennhanvien+"',Gioitinh='"+gioitinh+"',Diachi='"+diachi+"',Dienthoai='"+dienthoai+"',Ngaysinh='"+ngaysinh+"' where Manhanvien ='"+manhanvien+"'";     
            ResultSet rs=stm.executeQuery(sqlupdate);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void delete(String manhanvien)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqldelete="delete from Nhanvien where Manhanvien ='"+manhanvien+"'";          
            ResultSet rs=stm.executeQuery(sqldelete);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    


    
        
    //public static void main(String[] args) {
        
        /*ArrayList<Nhanvien> kq = getAll();
        for(int i=0;i<kq.size();i++)
        {
            System.out.println(kq.get(i).getmanhanvien()+"\t"+
                    kq.get(i).gettennhanvien()+"\t"+
                    kq.get(i).getgioitinh()+"\t"+
                    kq.get(i).getdiachi()+"\t"+
                    kq.get(i).getdienthoai()+"\t"+
                    kq.get(i).getngaysinh());
        }
        */
        //insert("NV004","F",0,"344lpp","02344","1997-05-06");
        //update("NV004","ABCHC",1,"344lpp","02344","1997-05-06");
        //delete("NV004");
        
    //}
}
