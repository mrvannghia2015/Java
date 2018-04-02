/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh1;


import java.awt.*;
import java.awt.event.*;

public class Thuchanh1{

    public Thuchanh1()
    {
        Frame f = new Frame("Bài 1");
        f.setSize(400,300);
        f.setLayout(new GridLayout(4,2));
        
        lblA = new Label("a");
        f.add(lblA);
        txtA = new TextField(20);
        f.add(txtA);
        
        lblB = new Label("b");
        f.add(lblB);
        txtB = new TextField(20);
        f.add(txtB);
        
        Label lbl = new Label("");
        f.add(lbl);
        
        Panel p = new Panel();
        p.setSize(20,100);
        p.setLayout(new FlowLayout());
        btnTong = new Button("+");
        btnTong.addActionListener(new ListenTong());
        p.add(btnTong);
        btnHieu = new Button("-");
        btnHieu.addActionListener(new ListenHieu());
        p.add(btnHieu);
        btnTich = new Button("*");
        btnTich.addActionListener(new ListenTich());
        p.add(btnTich);
        btnPhan = new Button("/");
        btnPhan.addActionListener(new ListenPhan());
        p.add(btnPhan);
        
        f.add(p);
        
        lblkq = new Label("Kết quả");
        f.add(lblkq);
        txtkq = new TextField(20);
        f.add(txtkq);
  
        XuLySuKienCuaSo boLangNge = new XuLySuKienCuaSo();
        f.addWindowListener( boLangNge);
        
        f.setVisible(true);
     
    
    }
    public static void main(String[] args) {
        new Thuchanh1();
    }
    class ListenTong implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float Tong=a+b;
            txtkq.setText(String.valueOf(Tong));      
        }
    }
    class ListenHieu implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float Hieu=a-b;
            txtkq.setText(String.valueOf(Hieu));      
        }
    }
    class ListenTich implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float Tich=a*b;
            txtkq.setText(String.valueOf(Tich));      
        }
    }
    class ListenPhan implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float Phan=a/b;
            txtkq.setText(String.valueOf(Phan));      
        }
    }
    static class XuLySuKienCuaSo implements WindowListener {
        public void windowOpened(WindowEvent e) {
        }
        public void windowClosing(WindowEvent e) {
            System.exit(0);  // Kết thúc chương trình
        }
        public void windowClosed(WindowEvent e) {
        }
        public void windowIconified(WindowEvent e) {
        }
        public void windowDeiconified(WindowEvent e) {
        }
        public void windowActivated(WindowEvent e) {
        }
        public void windowDeactivated(WindowEvent e) {
        }
    }
    Label lblA,lblB,lblkq;
    TextField txtA,txtB,txtkq;
    Button btnTong,btnHieu,btnTich,btnPhan;
    
}
