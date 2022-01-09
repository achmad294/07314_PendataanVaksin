package model;

import entity.PendudukEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PendudukModel extends modelAbstract {
    private String sql;

    public void insertData(PendudukEntity pendudukEntity07314){
        try{
            sql = "INSERT INTO penduduk(nik, nama, alamat, noTelp, dosis, jns_vaksin)" +
                    "VALUE(?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, pendudukEntity07314.getNik());
            stat.setString(2, pendudukEntity07314.getNama());
            stat.setString(3, pendudukEntity07314.getAlamat());
            stat.setString(4, pendudukEntity07314.getNoTelp());
            stat.setString(5, pendudukEntity07314.getDosis());
            stat.setString(6, pendudukEntity07314.getJns_vaksin());
            stat.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
 }
    public void updateDosis(String dosis, int id){
        try{
            sql = "UPDATE penduduk SET dosis = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, dosis);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<PendudukEntity> getPenduduk(String nik){
        ArrayList<PendudukEntity> arrPenduduk = new ArrayList<>();

        try{
            sql = "SELECT * FROM penduduk where nik = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nik);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                PendudukEntity pendudukEntity = new PendudukEntity();
                pendudukEntity.setId(rs.getInt("id"));
                pendudukEntity.setNama(rs.getString("nama"));
                pendudukEntity.setAlamat(rs.getString("alamat"));
                pendudukEntity.setNoTelp(rs.getString("noTelp"));
                pendudukEntity.setNik(rs.getString("nik"));
                pendudukEntity.setDosis(rs.getString("dosis"));
                pendudukEntity.setJns_vaksin(rs.getString("jns_vaksin"));
                arrPenduduk.add(pendudukEntity);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arrPenduduk;
    }

    public ArrayList<PendudukEntity> getPenduduk(){
        ArrayList<PendudukEntity> arrPenduduk = new ArrayList<>();

        try{
            sql = "SELECT * FROM penduduk";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                PendudukEntity pendudukEntity07314 = new PendudukEntity();
                pendudukEntity07314.setId(rs.getInt("id"));
                pendudukEntity07314.setNama(rs.getString("nama"));
                pendudukEntity07314.setAlamat(rs.getString("alamat"));
                pendudukEntity07314.setNoTelp(rs.getString("noTelp"));
                pendudukEntity07314.setNik(rs.getString("nik"));
                pendudukEntity07314.setDosis(rs.getString("dosis"));
                pendudukEntity07314.setJns_vaksin(rs.getString("jns_vaksin"));
                arrPenduduk.add(pendudukEntity07314);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arrPenduduk;
    }

    @Override
    public void updatenoTelp(String noTelp, int id) {
        try{
            sql = "UPDATE penduduk SET noTelp = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateNoTelp(String noTelp, int id){
        try{
            sql = "UPDATE penduduk SET noTelp = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int cekData(String nik){
        int cek = 0;
        try{
            sql = "SELECT * FROM penduduk WHERE nik = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nik);
            ResultSet rs = stat.executeQuery();

            if(rs.next()){
                cek = rs.getInt("id");
            }else {
                cek = 0;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return cek;
    }
}
