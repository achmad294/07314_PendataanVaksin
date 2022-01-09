package model;

import helper.koneksiDB;

import java.sql.Connection;

public abstract class modelAbstract {
    public Connection conn = koneksiDB.getconection();

    public abstract void updatenoTelp(String noTelp,int id);

    public abstract void updateNoTelp(String noTelp, int id);
}
