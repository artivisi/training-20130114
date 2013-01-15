/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao;

import com.artivisi.absensi.dao.jdbc.KehadiranDao;
import com.artivisi.absensi.domain.Kehadiran;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author endy
 */
public class KehadiranDaoTest {
    
    @Test
    public void testCariSemua() throws Exception {
        KehadiranDao kd = new KehadiranDao();
        List<Kehadiran> hasilQuery = kd.cariSemuaKehadiran();
        System.out.println("Jumlah Record : "+hasilQuery.size());
        for (Kehadiran kehadiran : hasilQuery) {
            System.out.println("ID : "+kehadiran.getId());
            System.out.println("Jam Masuk : "+kehadiran.getJamMasuk());
            System.out.println("Jam Pulang : "+kehadiran.getJamPulang());
        }
    }
    
    @Test
    public void testInsert() throws Exception {
        Kehadiran k = new Kehadiran();
        k.setJamMasuk(new Date());
        k.setJamPulang(new Date());
        
        KehadiranDao kd = new KehadiranDao();
        kd.simpan(k);
    }
    
    @Test
    public void testUpdate() throws Exception {
        Kehadiran k = new Kehadiran();
        k.setId(1);
        k.setJamMasuk(new Date());
        k.setJamPulang(new Date());
        
        KehadiranDao kd = new KehadiranDao();
        kd.simpan(k);
    }
}
