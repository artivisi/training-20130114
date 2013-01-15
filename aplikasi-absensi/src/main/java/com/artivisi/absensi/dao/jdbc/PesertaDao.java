/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.jdbc;

import com.artivisi.absensi.domain.Kehadiran;
import com.artivisi.absensi.domain.Peserta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cak-ust
 */
public class PesertaDao {
    private Connection connection;
    
    public PesertaDao() throws Exception {
        // inisialisasi driver database
        Class.forName("org.postgresql.Driver").newInstance();
        
        String url = "jdbc:postgresql://localhost/absensi";
        String username = "absensi";
        String password = "absensi";
        
        connection = DriverManager.getConnection(url, username, password);
    }
    
    public List<Peserta> cariSemuaKehadiran() throws Exception {
        String sql = "select * from peserta";
        List<Peserta> hasil = new ArrayList<Peserta>();
        ResultSet rs = connection.createStatement().executeQuery(sql);
        while(rs.next()){
            Peserta k = new Peserta();
            k.setNomor(rs.getString("no_peserta"));
            k.setNama(rs.getString("nama"));
            hasil.add(k);
        }
        return hasil;
    }
}
