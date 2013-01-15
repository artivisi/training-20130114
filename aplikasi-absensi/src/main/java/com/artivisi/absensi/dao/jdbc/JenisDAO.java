/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.jdbc;

import com.artivisi.absensi.domain.Jenis;
import com.artivisi.absensi.domain.Kehadiran;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bebenpiko
 */
public class JenisDAO {
    private final Connection connection;
    public JenisDAO() throws Exception {
        // inisialisasi driver database
        Class.forName("org.postgresql.Driver").newInstance();
        
        String url = "jdbc:postgresql://localhost/absensi";
        String username = "absensi";
        String password = "absensi";
        
        connection = DriverManager.getConnection(url, username, password);
    }
    
    public List<Jenis> cariSemuaJenis() throws Exception {
        String sql = "select * from jenis";
        List<Jenis> hasil = new ArrayList<Jenis>();
        ResultSet rs = connection.createStatement().executeQuery(sql);
        while(rs.next()){
            Jenis k = new Jenis();
            k.setKode(rs.getInt("kode"));
            k.setNama(rs.getString("nama"));
            k.setDendaTelat(rs.getDouble("denda_telat"));
            k.setTarifLembur(rs.getDouble("tarif_lembur"));
            
            hasil.add(k);
        }
        return hasil;
    }
}
