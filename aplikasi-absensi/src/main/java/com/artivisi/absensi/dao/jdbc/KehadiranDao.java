/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.jdbc;

import com.artivisi.absensi.domain.Kehadiran;
import java.sql.Connection;
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
 * @author endy
 */

// annotation @Repository, akan discan oleh Spring Framework
// dan kemudian diinisialisasi
// inisialisasi : new + mengisi dependensi @Autowired
@Repository
public class KehadiranDao {
    
    // variabel datasource, diisikan oleh Spring Framework
    // karena diberikan @Autowired
    @Autowired private DataSource dataSource;
        
    public List<Kehadiran> cariSemuaKehadiran() throws Exception {
        String sql = "select * from kehadiran";
        List<Kehadiran> hasil = new ArrayList<Kehadiran>();
        Connection connection = dataSource.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(sql);
        while(rs.next()){
            Kehadiran k = new Kehadiran();
            k.setId(rs.getInt("id"));
            k.setJamMasuk(new Date(rs.getTime("jam_masuk").getTime()));
            k.setJamPulang(new Date(rs.getTime("jam_pulang").getTime()));
            hasil.add(k);
        }
        connection.close();
        return hasil;
    }
    
    public void simpan(Kehadiran k) throws Exception {
        String sqlInsert = "insert into kehadiran (jam_masuk, jam_pulang) values (?,?)";
        String sqlUpdate = "update kehadiran set jam_masuk=?, jam_pulang=? where id=?";
        Connection connection = dataSource.getConnection();
        if(k.getId() == null){ // id null artinya record baru
            PreparedStatement ps = connection.prepareStatement(sqlInsert);
            ps.setTimestamp(1, new Timestamp(k.getJamMasuk().getTime()));
            ps.setTimestamp(2, new Timestamp(k.getJamPulang().getTime()));
            int hasil = ps.executeUpdate();
            System.out.println("Jumlah row yang berhasil diinsert : "+hasil);
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                Integer idBaru = rs.getInt(1);
                System.out.println("ID record baru : "+idBaru);
                k.setId(idBaru);
            } else {
                System.out.println("Tidak menghasilkan ID baru");
            }
        } else { // record lama, update saja
            PreparedStatement ps = connection.prepareStatement(sqlUpdate);
            ps.setTimestamp(1, new Timestamp(k.getJamMasuk().getTime()));
            ps.setTimestamp(2, new Timestamp(k.getJamPulang().getTime()));
            ps.setInt(3, k.getId());
            int hasil = ps.executeUpdate();
            System.out.println("Jumlah row yang berhasil diupdate : "+hasil);
        }
        connection.close();
    }
}
