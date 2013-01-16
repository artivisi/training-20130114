/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao;

import com.artivisi.absensi.dao.jdbc.KehadiranDao;
import com.artivisi.absensi.dao.jdbc.PesertaDao;
import com.artivisi.absensi.domain.Kehadiran;
import com.artivisi.absensi.domain.Peserta;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author cak-ust
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:com/artivisi/**/applicationContext.xml")
public class PesertaDaoTest {
    @Autowired
    PesertaDao kd = new PesertaDao();
    
    @Test
    public void testCariSemua() throws Exception {
        
        List<Peserta> hasilQuery = kd.cariSemuaPeserta();
        System.out.println("Jumlah Record : "+hasilQuery.size());
        for (Peserta peserta : hasilQuery) {
            System.out.println("No Peserta : "+peserta.getNomor());
            System.out.println("Nama : "+peserta.getNama());
            
        }
    }
    
    @Test
    public void testInsert() throws Exception {
        Peserta p = new Peserta();
        p.setNomor("0002");
        p.setNama("Benny");
        
        kd.simpan(p);
    }
    
    @Test
    public void testUpdate() throws Exception {
        Peserta p = new Peserta();
        p.setNomor("0001");
        p.setNomor("C001");
        p.setNama("Cak Ust");
        
        kd.simpan(p);
    }
}
