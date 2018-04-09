/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh2;

/**
 *
 * @author Vannghia
 */
public class StudentInfo {
    int STT;
    String Hoten;
    String Namsinh;
    String Gioitinh;
    public void setSTT(int stt)
    {
        STT=stt;
    }
    public int getSTT()
    {
      return STT;
    }
    public void setHoten(String hoten)
    {
        Hoten=hoten;
    }
    public String getHoten()
    {
      return Hoten;
    }
    public void setNamsinh(String namsinh)
    {
        Namsinh=namsinh;
    }
    public String getNamsinh()
    {
      return Namsinh;
    }
    
    public void setGioitinh (String gioitinh)
    {
        Gioitinh=gioitinh;
    }
    public String getGioitinh()
    {
        return Gioitinh;
    }
}
