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
public class Nhanvien {
    private String manhanvien;
    private String tennhanvien;
    private Byte gioitinh;
    private String diachi;
    private String dienthoai;
    private Date ngaysinh;
    
    public Nhanvien(String manhanvien,String tennhanvien,Byte gioitinh,String diachi,String dienthoai,Date ngaysinh) 
     {
        this.manhanvien=manhanvien;
        this.tennhanvien=tennhanvien;
        this.gioitinh=gioitinh;
        this.diachi=diachi;
        this.dienthoai=dienthoai;
        this.ngaysinh=ngaysinh;
     }

    public String getmanhanvien() 
    {
        return manhanvien;
    }
    public void setmanhanvien(String manhanvien) 
    {
        this.manhanvien=manhanvien;
    }
    
    public String gettennhanvien() 
    {
        return tennhanvien;
    }
    public void settennhanvien(String tennhanvien) 
    {
        this.tennhanvien=tennhanvien;
    }
    
    public String getdiachi() 
    {
        return diachi;
    }
    public void setdiachi(String diachi) 
    {
        this.diachi=diachi;
    }
    
    public String getdienthoai() 
    {
        return dienthoai;
    }
    public void setdienthoai(String dienthoai) 
    {
        this.dienthoai=dienthoai;
    }
    
    public Byte getgioitinh() 
    {
        return gioitinh;
    }
    public void setgioitinh(Byte gioitinh) 
    {
        this.gioitinh=gioitinh;
    }
    
    public Date getngaysinh() 
    {
        return ngaysinh;
    }
    public void setngaysinh(Date ngaysinh) 
    {
        this.ngaysinh=ngaysinh;
    }
}
