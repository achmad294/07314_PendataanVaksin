package entity;

public class UserEntityAbstract {
    protected String nama, alamat,noTelp;
    protected int id;

    public UserEntityAbstract(){
    }
    public UserEntityAbstract(String nama, String alamat, String noTelp, int id) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public UserEntityAbstract(String nama, String alamat, String noTelp){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public  void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public  void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public  void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}