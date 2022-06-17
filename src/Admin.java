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
    
    public String getmaAdmin (){
        return maAdmin;
    }
    
    public void setmaAdmin (String maAdmin){
        this.maAdmin = maAdmin;
    }
    
    public String getpassword (){
        return password;
    }
    
    public void setpassword (String password){
        this.password = password;
    }
    
}
