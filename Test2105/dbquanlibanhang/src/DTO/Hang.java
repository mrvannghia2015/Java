
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
public class Hang {
    private String mahang;
    private String tenhang;
    private String machatlieu;
    private Float soluong;
    private Float dongianhap;
    private Float dongiaban;
    private String anh;
    private String ghichu;
    
     
     public Hang(String mahang,String tenhang,String machatlieu,Float soluong,Float dongianhap,Float dongiaban,String anh,String ghichu) 
     {
        this.mahang=mahang;
        this.tenhang=tenhang;
        this.machatlieu=machatlieu;
        this.soluong=soluong;
        this.dongianhap=dongianhap;
        this.dongiaban=dongiaban;
        this.anh=anh;
        this.ghichu=ghichu;
     }

    public String getmahang() 
    {
        return mahang;
    }
    public void setmahang(String mahang) 
    {
        this.mahang=mahang ;
    }
    
    public String gettenhang() 
    {
        return tenhang ;
    }
    public void settenhang(String tenhang) 
    {
        this.tenhang=tenhang ;
    }
    
    public String getmachatlieu() 
    {
        return machatlieu;
    }
    public void setmachatlieu(String machatlieu) 
    {
        this.machatlieu=machatlieu ;
    }
    
    public Float getsoluong() 
    {
        return soluong ;
    }
    public void setsoluong(Float soluong ) 
    {
        this.soluong=soluong;
    }
    
    public Float getdongianhap() 
    {
        return dongianhap;
    }
    public void setdongianhap(Float dongianhap ) 
    {
        this.dongianhap=dongianhap ;
    }
    
    public Float getdongiaban() 
    {
        return dongiaban;
    }
    public void setdongiaban(Float dongiaban ) 
    {
        this.dongiaban=dongiaban ;
    }
    
    public String getanh() 
    {
        return anh;
    }
    public void setanh(String anh) 
    {
        this.anh=anh;
    }
    
    public String getghichu() 
    {
        return ghichu;
    }
    public void setghichu(String ghichu) 
    {
        this.ghichu=ghichu;
    }
}
