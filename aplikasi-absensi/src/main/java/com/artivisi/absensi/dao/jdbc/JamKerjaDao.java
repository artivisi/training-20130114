/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.jdbc;

import com.artivisi.absensi.domain.JamKerja;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public class JamKerjaDao {
    @Autowired private DataSource dataSource;
    
    
    public List<JamKerja> cariSemuaJamKerja() throws Exception {
        String sql = "select * from JamKerja";
        List<JamKerja> hasil = new ArrayList<JamKerja>();
        Connection connection = dataSource.getConnection();
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
