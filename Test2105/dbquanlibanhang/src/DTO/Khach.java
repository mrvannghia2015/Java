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
public class Khach {
    private String makhach;
    private String tenkhach;
    private String diachi;
    private String dienthoai;
     
     public Khach(String makhach,String tenkhach,String diachi,String dienthoai) 
     {
        this.makhach=makhach;
        this.tenkhach=tenkhach;
        this.diachi=diachi;
        this.dienthoai=dienthoai;
     }

    public String getmakhach() 
    {
        return makhach;
    }
    public void setmakhach(String makhach) 
    {
        this.makhach = makhach;
    }
    
    public String gettenkhach() 
    {
        return tenkhach;
    }
    public void settenkhach(String tenkhach) 
    {
        this.tenkhach = tenkhach;
    }
    
    public String getdiachi() 
    {
        return diachi;
    }
    public void setdiachi(String diachi) 
    {
        this.diachi = diachi;
    }
    
    public String getdienthoai() 
    {
        return dienthoai;
    }
    public void setdienthoai(String dienthoai) 
    {
        this.dienthoai = dienthoai ;
    }
    
    
}
