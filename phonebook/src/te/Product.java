/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te;

/**
 *
 * @author shahnawaz
 */
public class Product {
    
  
            int id;
    private String nickname,firstname,lastname,address ,phone,phone2;
 byte[] picture;
    
    public Product( int id,String firstname,String lastname,String address, String phone,byte[] img,String phone2)
    {
       
    
       this.id=id;
        this.firstname = firstname;
        this. lastname = lastname;
        this.address = address;
        this.phone =phone;
        this.picture = img;
        this.phone2=phone2;
    }
    
   
    public int getid()
    {
        return id;
    }
    public String getfirstname()
    {
        return firstname;
    }
    
    public String getlastname()
    {
        return lastname;
    }
    
    public String getaddress()
    {
        return  address;
    }
    

    public String getphone(){
        
        return phone;
    }
       public byte[] getimage()
    {
        return picture;
    }
        public String getphone2(){
        
        return phone2;
    }
}
