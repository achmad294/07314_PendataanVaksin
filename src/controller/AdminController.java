package controller;

import entity.AdminEntity;

public class AdminController {
    public void insertData(String nip,String nama, String alamat, String password, String noTelp){
        AllObjectModel.Adminmodel.insertData(new AdminEntity(nip,nama,alamat,password,noTelp));
    }
    public void updatePassword(String password, int id){
        AllObjectModel.Adminmodel.updatePassword(password, id);
    }
    public void updateNoTelp(String noTelp, int id){
        AllObjectModel.Adminmodel.updateNoTelp(noTelp, id);
    }
    public int cekLogin(String nip, String password){
       int login = AllObjectModel.Adminmodel.cekLogin(nip, password);
       return login;
    }
    public void deleteData(int id){
        AllObjectModel.Adminmodel.deleteData(id);
    }
}