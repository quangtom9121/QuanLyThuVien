/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlithuvien;

/**
 *
 * @author Trung's PC
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXB;
    private int giaTien;
    private int soLuong;
    
    public Sach(){
        
    }
    
    public Sach (String maSach, String tenSach,String tenTacGia,String nhaXB, int giaTien, int soLuong){
        this.maSach = maSach;
        this.maSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXB = nhaXB ;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        
    }
    
    public String getmaSach(){
        return maSach;
    }
    
    public void setmaSach(String ms){
        this.maSach = ms;
    }
    
    public String gettenSach(){
        return tenSach;
    }
    
    public void settenSach(String ts){
        this.tenSach = ts;
    }
    
    public String gettenTacGia(){
        return tenTacGia;
    }
    
    public void settenTacGia(String tg){
        this.tenTacGia = tg;
    }
    
    public String getnhaXb(){
        return nhaXB ;
    }
    
    public void getnhaXB(String xb){
        this.nhaXB = xb;
    }
    
    public int getgiaTien(){
        return giaTien;
    }
    
    public void setgiaTien(int gt){
        this.giaTien = gt;
    }
    
    public int getsoLuong(){
        return soLuong;
    }
    
    public void setsoLuong(int sl){
        this.soLuong = sl;
    }
    
    
}
