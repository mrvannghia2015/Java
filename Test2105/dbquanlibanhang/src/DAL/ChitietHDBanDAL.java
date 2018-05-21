/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChitietHDBan;
import java.sql.Connection;
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
public class ChitietHDBanDAL {
    public static ArrayList<ChitietHDBan> getAll()
    {
        ArrayList<ChitietHDBan> cthdb = new ArrayList<ChitietHDBan>();
        Connection con = DBConnect.Moketnoi();
        try {
            Statement stm = con.createStatement();
            String sqlselect="select * from ChitietHDBan";
            ResultSet rs = stm.executeQuery(sqlselect);     
            while(true)
            {
                if(!rs.next()) break;
                String mahdban = rs.getString("MaHDBan");
                String mahang = rs.getString("Mahang");
                Float soluong =rs.getFloat("Soluong");
                Float dongia = rs.getFloat("Dongia");
                Float giamgia = rs.getFloat("Giamgia");
                Float thanhtien =rs.getFloat("Thanhtien");
                ChitietHDBan ct = new ChitietHDBan(mahdban, mahang, soluong, dongia, giamgia, thanhtien);
                cthdb.add(ct);
            }
            return cthdb;
        } 
        catch (SQLException e) {
        }
        return null;
    }   
    public static void insert (String mahdban,String mahang,Double soluong,Double dongia,Double giamgia,Double thanhtien)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqlinsert="insert into ChitietHDBan(Mahdban, Mahang, Soluong, Dongia, Giamgia, Thanhtien) "
                    + "values('"+mahdban+"','"+mahang+"','"+soluong+"','"+dongia+"','"+giamgia+"','"+thanhtien+"')";
            ResultSet rs=stm.executeQuery(sqlinsert);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void update (String mahdban,String mahang,Double soluong,Double dongia,Double giamgia,Double thanhtien)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            Statement stm = con.createStatement();
            String sqlupdate="update ChitietHDBan set  Mahang='"+mahang+"',Soluong='"+soluong+"',Dongia='"+dongia+"',Giamgia='"+giamgia+"',Thanhtien='"+thanhtien+"' where MaHDBan='"+mahdban+"'";
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
            String sqldelete="delete from ChitietHDBan where MaHDBan="+mahdban+"'";
            ResultSet rs=stm.executeQuery(sqldelete);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        //insert("MHDB001","mh001",1.0,900.0,0.0,900.0);
        //update("MHDB001","mh001",1.0,700.0,0.0,700.0);
        //delete("MHDB001");
        
    }
}
