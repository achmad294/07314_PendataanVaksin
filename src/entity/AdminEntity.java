package entity;

public class AdminEntity extends UserEntityAbstract{
    private String nip, password;
    
    public AdminEntity(){};
    
    public AdminEntity(String nip, String nama, String alamat, String password, String noTelp){
        super(nama, alamat, noTelp);
        this.nip = nip;
        this.password = password;
    }
    
    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}    