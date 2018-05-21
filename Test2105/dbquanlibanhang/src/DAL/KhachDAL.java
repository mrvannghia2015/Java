/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Khach;
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
public class KhachDAL {
    public static ArrayList<Khach> getAll()
    {
        ArrayList<Khach> k = new ArrayList<Khach>();
        Connection con = DBConnect.Moketnoi();
        try {
            Statement stm = con.createStatement();
            String sqlselect="select * from Khach";
            ResultSet rs = stm.executeQuery(sqlselect);     
            while(true)
            {
                if(!rs.next()) break;
                String makhach = rs.getString("Makhach");
                String tenkhach = rs.getString("Tenkhach");
                String diachi = rs.getString("Diachi");
                String dienthoai= rs.getString("Dienthoai");
                Khach kha = new Khach(makhach, tenkhach, diachi, dienthoai);
                k.add(kha);
            }
            return k;
        } 
        catch (SQLException e) {
        }
        return null;
    }   
    
    public static void insert (String makhach, String tenkhach, String diachi, String dienthoai)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqlinsert="insert into Khach(Makhach,Tenkhach,Diachi,Dienthoai) "
                    + "values('"+makhach+"','"+tenkhach+"','"+diachi+"','"+dienthoai+"')"; 
            ResultSet rs=stm.executeQuery(sqlinsert);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update (String makhach, String tenkhach, String diachi, String dienthoai)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqlupdate="update Khach set Tenkhach='"+tenkhach+"',Diachi='"+diachi+"',Dienthoai='"+dienthoai+"' where Makhach ='"+makhach+"'";     
            ResultSet rs=stm.executeQuery(sqlupdate);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void delete(String makhach)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqldelete="delete from Khach where Makhach ='"+makhach+"'";          
            ResultSet rs=stm.executeQuery(sqldelete);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public static void main(String[] args) {
        
        /*ArrayList<Khach> kq = getAll();
        for(int i=0;i<kq.size();i++)
        {
            System.out.println(kq.get(i).getmakhach()+"\t"+
                    kq.get(i).getmakhach()+"\t"+
                    kq.get(i).getdiachi()+"\t"+
                    kq.get(i).getdienthoai());
        }
        */
        //insert("kh002","F","344lpp","02344");
        //update("kh002","Fadwadwad","344lpp","02344");
        //delete("kh002");
        
    }
}
