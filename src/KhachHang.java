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
public class KhachHang {
    private String maKhachHang;
    private String password;
    private String name;
    private Date birth;
    private String diachi;
    private String phone;
    
    public KhachHang() {
        
    }
    
    public KhachHang (String maKhachHang, String password, String name, Date birth, String diachi, String phone){
        this.maKhachHang = maKhachHang;
        this.password = password;
        this.name =name; 
        this.birth = birth;
        this.diachi = diachi;
        this.phone = phone;
      
    }
    public String getmaKhachHang(){
        return maKhachHang;
    }
    public void setmaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang; 
    }
    
    public String getpassword(){
        return password;
    }
    public void setpassword(String password) {
        this.password = password; 
    }
    
    public String getname(){
        return name;
    }
    public void setname(String name1) {
        this.name = name1; 
    }
    
    public Date getBirth(){
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth; 
    }
    
    public String getdiachi(){
        return diachi;
    }
    public void setdiachi(String dc) {
        this.diachi = dc; 
    }
    
    public String getphone(){
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone; 
    }
}
