/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Van Nghia
 */
public class ChitietHDBan {
    private String mahdban;
    private String mahang;
    private Float soluong;
    private Float dongia;
    private Float giamgia;
    private Float thanhtien;
            
     
     public ChitietHDBan(String mahdban,String mahang,Float soluong,Float dongia,Float giamgia,Float thanhtien) 
     {
        this.mahdban=mahdban;
        this.mahang=mahang;
        this.soluong=soluong;
        this.dongia=dongia;
        this.giamgia=giamgia;
        this.thanhtien=thanhtien;
     }

    public String getmahdban() 
    {
        return mahdban;
    }
    public void setmahdban(String mahdban) 
    {
        this.mahdban=mahdban;
    }
    
    public String getmahang() 
    {
        return mahang;
    }
    public void setmahang(String mahang) 
    {
        this.mahang=mahang;
    }
    
    public Float getsoluong() 
    {
        return soluong;
    }
    public void setsoluong(Float soluong) 
    {
        this.soluong=soluong;
    }
    
    public Float getdongia() 
    {
        return dongia;
    }
    public void setdongia(Float dongia) 
    {
        this.dongia=dongia;
    }
    
    public Float getgiamgia() 
    {
        return giamgia;
    }
    public void setgiamgia(Float giamgia) 
    {
        this.giamgia=giamgia;
    }
    
    public Float getthanhtien() 
    {
        return thanhtien;
    }

    public void setthanhtien(Float thanhtien) 
    {
        this.thanhtien=thanhtien;
    }
    
    
    
}
