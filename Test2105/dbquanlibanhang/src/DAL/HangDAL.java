/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Hang;
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
public class HangDAL {
    public static ArrayList<Hang> getAll()
    {
        ArrayList<Hang> hang = new ArrayList<Hang>();
        Connection con = DBConnect.Moketnoi();
        try {
            Statement stm = con.createStatement();
            String sqlselect="select * from Hang";
            ResultSet rs = stm.executeQuery(sqlselect);     
            while(true)
            {
                if(!rs.next()) break;
                String mahang = rs.getString("Mahang");
                String tenhang = rs.getString("Tenhang");
                String machatlieu = rs.getString("Machatlieu");
                Float soluong = rs.getFloat("Soluong");
                Float dongianhap = rs.getFloat("Dongianhap");
                Float dongiaban = rs.getFloat("Dongiaban");
                String anh = rs.getString("Anh");
                String ghichu = rs.getString("Ghichu");
                Hang h = new Hang(mahang, tenhang, machatlieu, soluong, dongianhap, dongiaban, anh, ghichu);
                hang.add(h);
            }
            return hang;
        } 
        catch (SQLException e) {
        }
        return null;
    }   
    public static int insert (String mahang, String tenhang, String machatlieu, Double soluong, Double dongianhap, Double dongiaban, String anh, String ghichu)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqlinsert="insert into Hang(Mahang, Tenhang, Machatlieu, Soluong, Dongianhap, Dongiaban, Anh, Ghichu)"
                    + " values('"+mahang+"','"+tenhang+"','"+machatlieu+"','"+soluong+"','"+dongianhap+"','"+dongiaban+"','"+anh+"','"+ghichu+"')";
            int rs=stm.executeUpdate(sqlinsert);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public static int update (String mahang, String tenhang, String machatlieu, Double soluong, Double dongianhap, Double dongiaban, String anh, String ghichu)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            Statement stm = con.createStatement();
            String sqlupdate="update Hang set Tenhang='"+tenhang+"',Machatlieu='"+machatlieu+"',Soluong = '"+soluong+"',Dongianhap = '"+dongianhap+"',Dongiaban = '"+dongiaban+"',Anh= '"+anh+"',Ghichu= '"+ghichu+"'where Mahang='"+mahang+"'";
            int rs=stm.executeUpdate(sqlupdate);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public static int delete (String mahang)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqldelete="delete from Hang where Mahang = '"+mahang+"'";
            int rs=stm.executeUpdate(sqldelete);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public static void main(String[] args) {
        
        
        /*ArrayList<Hang> kq= getAll();
        for(int i=0;i<kq.size();i++)
        {
            System.out.println( kq.get(i).getmahang()+"\t"+
                                kq.get(i).gettenhang()+"\t"+
                                kq.get(i).getmachatlieu()+"\t"+
                                kq.get(i).getsoluong()+"\t"+
                                kq.get(i).getdongianhap()+"\t"+
                                kq.get(i).getdongiaban()+"\t"+
                                kq.get(i).getanh()+"\t"+
                                kq.get(i).getghichu());
        }
        */
        //insert("mh003","But","MCL002",2.0,300.0,900.0,"ABC.jpg","ABC");
        //update("mh003","But","MCL002",2.0,700.0,900.0,"	ABC.jpg","ABC");
        //delete("mh003");
    }
}
