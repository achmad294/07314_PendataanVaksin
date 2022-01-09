package controller;

import entity.PendudukEntity;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class PendudukController {

    public void insertData(String nik,String nama, String alamat, String noTelp, String dosis, String jns_vaksin){
        AllObjectModel.pendudukmodel.insertData(new PendudukEntity(nik, nama, alamat, noTelp, dosis, jns_vaksin));
    }
    public void updateDosis(String dosis, int id){
        AllObjectModel.pendudukmodel.updateDosis(dosis, id);
    }
    public void updateNoTelp(String noTelp, int id){
        AllObjectModel.pendudukmodel.updateNoTelp(noTelp, id);
    }
    public ArrayList<PendudukEntity> getDataPenduduk(String nik) {
        return AllObjectModel.pendudukmodel.getPenduduk(nik);
    }
    public ArrayList<PendudukEntity> getDataPenduduk() {
        return AllObjectModel.pendudukmodel.getPenduduk();
    }
    public int CekData(String nik){
        int cek = AllObjectModel.pendudukmodel.cekData(nik);
        return cek;
    }
    public DefaultTableModel daftarPenduduk(){
        DefaultTableModel dataDaftarPenduduk = new DefaultTableModel();
        Object[] kolom = {"ID", "NIK", "NAMA", "ALAMAT", "NOTELP", "DOSIS", "JENIS VAKSIN"};
        dataDaftarPenduduk.setColumnIdentifiers(kolom);
        int size = getDataPenduduk().size();
        for(int i = 0; i < size; i++ ){
            Object[] data = new Object[7];
            data[0] = AllObjectModel.pendudukmodel.getPenduduk().get(i).getId();
            data[1] = AllObjectModel.pendudukmodel.getPenduduk().get(i).getNik();
            data[2] = AllObjectModel.pendudukmodel.getPenduduk().get(i).getNama();
            data[3] = AllObjectModel.pendudukmodel.getPenduduk().get(i).getAlamat();
            data[4] = AllObjectModel.pendudukmodel.getPenduduk().get(i).getNoTelp();
            data[5] = AllObjectModel.pendudukmodel.getPenduduk().get(i).getDosis();
            data[6] = AllObjectModel.pendudukmodel.getPenduduk().get(i).getJns_vaksin();
            dataDaftarPenduduk.addRow(data);
        }
        return dataDaftarPenduduk;
    }

}
