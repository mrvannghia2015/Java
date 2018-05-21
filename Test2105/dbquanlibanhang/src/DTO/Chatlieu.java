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
public class Chatlieu {
    private String machatlieu;
    private String tenchatlieu;
     
     public Chatlieu(String machatlieu, String tenchatlieu) 
     {
         this.machatlieu=machatlieu;
         this.tenchatlieu = tenchatlieu;
     }

    public String getmachatlieu() 
    {
        return machatlieu;
    }

    public void setmachatlieu(String machatlieu) 
    {
        this.machatlieu = machatlieu;
    }
    
    public String gettenchatlieu() 
    {
        return tenchatlieu;
    }

    public void settenchatlieu(String machatlieu) 
    {
        this.tenchatlieu = tenchatlieu;
    }
}
