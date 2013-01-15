/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.jdbc;

import com.artivisi.absensi.domain.Kehadiran;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author endy
 */
public class KehadiranDao {
    private Connection connection;
    
    public KehadiranDao() throws Exception {
        // inisialisasi driver database
        Class.forName("org.postgresql.Driver").newInstance();
        
        String url = "jdbc:postgresql://localhost/absensi";
        String username = "absensi";
        String password = "absensi";
        
        connection = DriverManager.getConnection(url, username, password);
    }
    
    public List<Kehadiran> cariSemuaKehadiran() throws Exception {
        String sql = "select * from kehadiran";
        List<Kehadiran> hasil = new ArrayList<Kehadiran>();
        ResultSet rs = connection.createStatement().executeQuery(sql);
        while(rs.next()){
            Kehadiran k = new Kehadiran();
            k.setId(rs.getInt("id"));
            k.setJamMasuk(new Date(rs.getTime("jam_masuk").getTime()));
            k.setJamPulang(new Date(rs.getTime("jam_pulang").getTime()));
            hasil.add(k);
        }
        return hasil;
    }
}
