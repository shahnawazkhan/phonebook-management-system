
public class P {
    private String username;
    private String password;
    
    
     public P( String username, String password){
    
        
        this.username = username;
        this.password = password;

     
    }

    P() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public String getuser(){
        return username;
    }
    
    public void setuser(String Name){
        this.username = Name;
    }
     public String getpass(){
        return password;
    }
    
    public void setpass(String Name){
        this.password = Name;
    }

    
}

