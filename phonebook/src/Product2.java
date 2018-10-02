public class Product2 {

    private int id;
    private String name;
    private String lastname;
    private String city;
    private String phone;
    private byte[] image;
    
    public Product2(){}
    
    public Product2(int Id, String firstname, String lastname, String city, String phone,byte[] image){
    
        this.id = Id;
        this.name = firstname;
        this.lastname = lastname;
        this.city = city;
        this.phone = phone;
        this.image = image;
     
    }

    
    
    public int getID(){
      return id;
    }
    
    public void setID(int ID){
        this.id = ID;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String Name){
        this.name = Name;
    }
    
    public String getlastname(){
        return lastname;
    }
    
    public void setQte(String lastname){
        this.lastname=lastname;
    }
    
    public String getcity(){
        return city;
    }
    
    public void setPrice(String city){
        this.city = city;
    }
    
    public String getphone(){
        return phone;
    }
    
    public void setphone(String phone){
        this.phone=phone;
    }
    
    public byte[] getMyImage(){
        return image;
    }
    /* public String getphone2(){
        return phone2;
    }
    
    public void setphone2(String phone2){
        this.phone2=phone2;
    }*/
}
