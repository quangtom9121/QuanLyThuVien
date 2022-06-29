package Quanlithuvien;

/**
 *
 * @author Trung's PC
 */
public class Admin {
    private String maAdmin;
    private String password;
    
    public Admin() {
        
    }
    public Admin(String maAdmin,String password ){
        this.maAdmin = maAdmin;
        this.password = password;
        
    }
    
    public String getMaAdmin (){
        return maAdmin;
    }
    
    public void setMaAdmin (String maAdmin){
        this.maAdmin = maAdmin;
    }
    
    public String getPassword (){
        return password;
    }
    
    public void setPassword (String password){
        this.password = password;
    }
  
}
