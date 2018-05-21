/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.HDBan;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Van Nghia
 */
public class HDBanDAL {
    public static ArrayList<HDBan> getAll()
    {
        ArrayList<HDBan> hdb = new ArrayList<HDBan>();
        Connection con = DBConnect.Moketnoi();
        try {
            Statement stm = con.createStatement();
            String sqlselect="select * from HDBan";
            ResultSet rs = stm.executeQuery(sqlselect);     
            while(true)
            {
                if(!rs.next()) break;
                String mahdban = rs.getString("MaHDBan");
                String manhanvien = rs.getString("Manhanvien");
                Date ngayban = rs.getDate("Ngayban");
                String makhach = rs.getString("Makhach");
                Float tongtien =rs.getFloat("Tongtien");
                HDBan hd = new HDBan(mahdban, manhanvien, ngayban, makhach, tongtien);
                hdb.add(hd);
            }
            return hdb;
        } 
        catch (SQLException e) {
        }
        return null;
    }   
    public static void insert (String mahdban,String manhanvien,String ngayban,String makhach,Double tongtien)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqlinsert="insert into HDBan(MaHDBan, Manhanvien, Ngayban, Makhach, Tongtien) "
                    + "values('"+mahdban+"','"+manhanvien+"','"+ngayban+"','"+makhach+"','"+tongtien+"')";
            ResultSet rs=stm.executeQuery(sqlinsert);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void update (String mahdban,String manhanvien,String ngayban,String makhach,Double tongtien)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            Statement stm = con.createStatement();
            String sqlupdate="update HDBan set Manhanvien ='"+manhanvien+"',Ngayban='"+ngayban+"',Makhach='"+makhach+"',Tongtien='"+tongtien+"' where MaHDBan='"+mahdban+"'";
            ResultSet rs=stm.executeQuery(sqlupdate);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void delete (String mahdban)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqldelete="delete from HDBan where MaHDBan="+mahdban+"'";
            ResultSet rs=stm.executeQuery(sqldelete);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        //insert("MHDB001","nv001","2018-05-19","kh001",900.0);
        //update("MHDB001","nv001","2018-05-29","kh001",900.0);
        //delete("MHDB001");
        
    }
}
