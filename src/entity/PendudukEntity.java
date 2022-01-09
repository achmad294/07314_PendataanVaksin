package entity;

public class PendudukEntity extends UserEntityAbstract{
    public String nik, dosis, jns_vaksin;
    
    public PendudukEntity(String nik, String nama, String alamat, String noTelp, String dosis, String jns_vaksin){
        super(nama, alamat, noTelp);
        this.nik = nik;
        this.dosis = dosis;
        this.jns_vaksin = jns_vaksin;
    }

    public PendudukEntity(int id, String nama, String alamat, String noTelp, String nik, String dosis, String jns_vaksin) {
        super(nama, alamat, noTelp, id);
        this.nik = nik;
        this.dosis = dosis;
        this.jns_vaksin = jns_vaksin;
    }
    public PendudukEntity(){}
    
    public String getNik(){
        return nik;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public String getDosis(){
        return dosis;
    }
    public void setDosis(String dosis){
        this.dosis = dosis;
    }
    public String getJns_vaksin(){
        return dosis;
    }
    public void setJns_vaksin(String jns_vaksin){
        this.jns_vaksin = jns_vaksin;
    }
}
