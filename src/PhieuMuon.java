/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlithuvien;
import java.sql.Date;
/**
 *
 * @author Trung's PC
 */
public class PhieuMuon {
    private String maMuon;
    private String maKhach;
    private String maSach;
    private Date ngayMuon;
    private Date hanTra;
    
    public PhieuMuon(){
        
    }
    
    public PhieuMuon (String maMuon, String maKhach, String maSach, Date ngayMuon, Date hanTra){
        this.maMuon = maMuon;
        this.maKhach = maKhach;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
    }
    
    public String getmaMuon(){
        return maMuon;
    }
    
    public void setmaMuon(String mm){
        this.maMuon = mm;
    }
    
    public String getmaKhach(){
        return maKhach;
    }
    
    public void setmaKhach(String mk){
        this.maKhach = mk;
    }
    
    public String getmaSach(){
        return maSach;
    }
    
    public void setSKhach(String ms){
        this.maSach = ms;
    }
    
    public Date getNgayMuon(){
        return ngayMuon;
    }
    
    public void setngayMuon(Date nm){
        this.ngayMuon = nm;
    }
    
    public Date gethanTra(){
        return hanTra;
    }
    
    public void gethanTra(Date ht){
        this.hanTra = ht;
    }
    
}
