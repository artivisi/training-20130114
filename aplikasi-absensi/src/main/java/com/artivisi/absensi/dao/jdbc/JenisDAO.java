/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.jdbc;

import com.artivisi.absensi.domain.Jenis;
import com.artivisi.absensi.domain.Kehadiran;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bebenpiko
 */
@Repository
public class JenisDAO {
    @Autowired private DataSource dataSource;
    
    public List<Jenis> cariSemuaJenis() throws Exception {
        String sql = "select * from jenis";
        List<Jenis> hasil = new ArrayList<Jenis>();
        Connection connection=dataSource.getConnection();
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
