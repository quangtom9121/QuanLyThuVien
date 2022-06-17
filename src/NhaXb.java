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
public class NhaXb {
    private String maNXB;
    private String tenNXB;
    
    public NhaXb(){
        
    }
    
    public NhaXb(String maNXB, String tenNXB){
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
    }
    
    public String getmaNXB(){
        return maNXB;
    }
    
    public void setmaNXB(String m){
        this.maNXB = m;
    }
    
    public String gettenNXB(){
        return tenNXB;
    }
    
    public void settenNXB(String t){
        this.tenNXB = t;
}
}
