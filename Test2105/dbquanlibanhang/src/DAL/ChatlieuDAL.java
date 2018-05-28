/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.Chatlieu;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Van Nghia
 */
public class ChatlieuDAL {
    
    public static ArrayList<Chatlieu> getAll()
    {
        ArrayList<Chatlieu> cl = new ArrayList<Chatlieu>();
        Connection con = DBConnect.Moketnoi();
        try {
            Statement stm = con.createStatement();
            String sqlselect="select * from Chatlieu";
            ResultSet rs = stm.executeQuery(sqlselect);     
            while(true)
            {
                if(!rs.next()) break;
                String machatlieu = rs.getString("Machatlieu");
                String tenchatlieu = rs.getString("Tenchatlieu");
                Chatlieu c = new Chatlieu(machatlieu,tenchatlieu);
                cl.add(c);
            }
            return cl;
        } 
        catch (SQLException e) {
        }
        return null;
    }   
    public static int insert (String machatlieu,String tenchatlieu)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqlinsert="insert into ChatLieu(Machatlieu,Tenchatlieu) values('"+machatlieu+"','"+tenchatlieu+"')";
            int rs=stm.executeUpdate(sqlinsert);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public static int update (String machatlieu,String tenchatlieu)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            Statement stm = con.createStatement();
            String sqlupdate="update Chatlieu set Tenchatlieu= '"+tenchatlieu+"' where Machatlieu='"+machatlieu+"'";
            int rs=stm.executeUpdate(sqlupdate);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public static int delete (String machatlieu)
    {
        Connection con = DBConnect.Moketnoi();
        try {
            
            Statement stm = con.createStatement();
            String sqldelete="delete from Chatlieu where Machatlieu = '"+machatlieu+"'";
            int rs=stm.executeUpdate(sqldelete);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ChatlieuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
        
    public static void main(String[] args) {
        /*
        ArrayList<Chatlieu> kq= getAll();
        for(int i=0;i<kq.size();i++)
        {
            System.out.println(kq.get(i).getmachatlieu()+"\t"+kq.get(i).gettenchatlieu());
        }
        */
        //insert("MCL009","alumium");
        //update("MCL005","TITAN");
        //delete("MCL009");
        
    }
}
