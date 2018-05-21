/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Van Nghia
 */
public class HDBan {
    private String mahdban;
    private String manhanvien;
    private Date ngayban;
    private String makhach;
    private Float tongtien;
     
     public HDBan(String mahdban,String manhanvien,Date ngayban,String makhach,Float tongtien) 
     {
        this.mahdban=mahdban;
        this.manhanvien=manhanvien;
        this.ngayban=ngayban;
        this.makhach=makhach;
        this.tongtien=tongtien;
     }

    public String getmahdban() 
    {
        return mahdban;
    }
    public void setmahdban(String mahdban) 
    {
        this.mahdban= mahdban;
    }
    
    public String getmanhanvien() 
    {
        return manhanvien;
    }
    public void setmanhanvien(String manhanvien) 
    {
        this.manhanvien= manhanvien;
    }    
    
    public Date getngayban() 
    {
        return ngayban;
    }
    public void setngayban(Date ngayban) 
    {
        this.ngayban= ngayban;
    }
    
    public String getmakhach() 
    {
        return makhach;
    }
    public void setmakhach(String makhach) 
    {
        this.makhach= makhach;
    }
    
    public Float gettongtien() 
    {
        return tongtien;
    }
    public void settongtien(Float tongtien) 
    {
        this.tongtien=tongtien;
    }
    

}
