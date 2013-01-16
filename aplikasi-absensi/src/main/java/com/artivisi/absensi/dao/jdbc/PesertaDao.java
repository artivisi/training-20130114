/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.jdbc;

import com.artivisi.absensi.domain.Kehadiran;
import com.artivisi.absensi.domain.Peserta;
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
 * @author cak-ust
 */
@Repository
public class PesertaDao {
    @Autowired
    private DataSource dataSource;
    
    
    public List<Peserta> cariSemuaPeserta() throws Exception {
        String sql = "select * from peserta";
        List<Peserta> hasil = new ArrayList<Peserta>();
        Connection connection=dataSource.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(sql);
        while(rs.next()){
            Peserta k = new Peserta();
            k.setNomor(rs.getString("no_peserta"));
            k.setNama(rs.getString("nama"));
            hasil.add(k);
        }
        return hasil;
    }
    
    public void simpan(Peserta p) throws Exception {
        String sqlInsert = "insert into peserta(no_peserta, nama) values (?,?)";
        String sqlUpdate = "update kehadiran set jam_masuk=?, jam_pulang=? where id=?";
        Connection connection = dataSource.getConnection();
        if(p.getOldKode() == null){ // id null artinya record baru
            PreparedStatement ps = connection.prepareStatement(sqlInsert);
            ps.setString(1, p.getNomor());
            ps.setString(2, p.getNama());
            int hasil = ps.executeUpdate();
            System.out.println("Jumlah row yang berhasil diinsert : "+hasil);
            
            //ResultSet rs = ps.getGeneratedKeys();
            if(p.getOldKode()==null){
                System.out.println("Insert Peserta Baru : ");
                
            } else {
                System.out.println("Tidak menghasilkan ID baru");
            }
        } else { // record lama, update saja
            PreparedStatement ps = connection.prepareStatement(sqlUpdate);
            ps.setString(1, p.getNomor());
            ps.setString(2, p.getNama());
            ps.setString(3, p.getOldKode());
            int hasil = ps.executeUpdate();
            System.out.println("Jumlah row yang berhasil diupdate : "+hasil);
        }
        connection.close();
    }
}
