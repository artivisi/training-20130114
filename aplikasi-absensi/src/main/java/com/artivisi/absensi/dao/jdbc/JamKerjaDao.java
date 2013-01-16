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
        
        // membuat koneksi ke database
        connection = DriverManager.getConnection(url, username, password);
    }
    
    public List<JamKerja> cariSemuaJamKerja() throws Exception {
        String sql = "select * from JamKerja";
        List<JamKerja> hasil = new ArrayList<JamKerja>();
        
        // koneksi digunakan untuk menjalankan query
        // hasilnya berupa object ResultSet
        ResultSet rs = connection.createStatement().executeQuery(sql);
        while(rs.next()){ // kalau masih ada datanya, rs.next -> true
            // hasil query dibungkus dalam object JamKerja
            JamKerja k = new JamKerja();
            
            // setelah di next, rs akan berisi row data saat ini
            k.setKode(rs.getString("kode")); // ambil data untuk kolom kode (tipe data String/varchar)
            k.setNama(rs.getString("nama"));
            
            // ambil data untuk kolom mulai (tipe data Timestamp)
            k.setMulai(new Time(rs.getTime("mulai").getTime()));
            k.setSelesai(new Time(rs.getTime("selesai").getTime()));
            
            // masukkan object JamKerja yang sudah diisi data
            hasil.add(k);
        }
        
        // kembalikan list berisi JamKerja hasil query dari database
        return hasil;
    }

    
}
