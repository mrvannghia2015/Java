/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai89;

/**
 *
 * @author Van Nghia
 */
public class NhanVien {
    String Manv;
    String phanxuong;
    int Sosp;
    
    public NhanVien()
    {
        Manv="";
        phanxuong="";
        Sosp=0;
    }
    
    public void setManv(String manv)
    {
        Manv = manv;
    }
    
    public String getManv()
    {
        return Manv;
    }
    
    public void setPx(String px)
    {
        phanxuong = px;
    }
    
    public String getPx()
    {
        return phanxuong;
    }
    
    public void setSosp(int sosp)
    {
        Sosp = sosp;
    }
    
    public int getSosp()
    {
        return Sosp;
    }
    
    public int getChuan()
    {
        if(phanxuong.equals("A")) return 300;
        else return 500;
    }
    
    public boolean VuotChuan()
    {
        if(Sosp > getChuan()) return true;
        else return false;
    }
    
    public long TinhLuong()
    {
        if(VuotChuan() == true ) return Sosp*30000;
        else return Sosp*20000;
    }
    
    public String toString()
    {
        return Manv;
    }
    
    
}
