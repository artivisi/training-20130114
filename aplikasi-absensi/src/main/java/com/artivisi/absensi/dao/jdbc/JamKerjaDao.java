/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.jdbc;

import com.artivisi.absensi.domain.JamKerja;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class JamKerjaDao {
    
    private Connection connection;
    
    public JamKerjaDao() throws Exception {
        // inisialisasi driver database
        Class.forName("org.postgresql.Driver").newInstance();
        
        String url = "jdbc:postgresql://localhost/absensi";
        String username = "absensi";
        String password = "absensi";
        
        connection = DriverManager.getConnection(url, username, password);
    }
    
    public List<JamKerja> cariSemuaJamKerja() throws Exception {
        String sql = "select * from JamKerja";
        List<JamKerja> hasil = new ArrayList<JamKerja>();
        ResultSet rs = connection.createStatement().executeQuery(sql);
        while(rs.next()){
            JamKerja k = new JamKerja();
            k.setKode(rs.getString("kode"));
            k.setNama(rs.getString("nama"));
            k.setMulai(new Time(rs.getTime("mulai").getTime()));
            k.setSelesai(new Time(rs.getTime("selesai").getTime()));
            hasil.add(k);
        }
        return hasil;
    }

    
}
