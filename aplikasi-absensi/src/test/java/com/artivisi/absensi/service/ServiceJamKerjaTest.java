/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.service;

import com.artivisi.absensi.domain.JamKerja;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author endy
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:com/artivisi/**/applicationContext.xml")
public class ServiceJamKerjaTest {
    
    @Autowired
    private AplikasiAbsenService service;
    
    @Test
    public void testCariSemua() throws Exception {
        List<JamKerja> hasilQuery = service.cariSemuaJamKerja();
        System.out.println("Jumlah Record : "+hasilQuery.size());
        for (JamKerja jamkerja : hasilQuery) {
            System.out.println("Kode : "+jamkerja.getKode());
            System.out.println("Nama : "+jamkerja.getNama());
            System.out.println("Mulai : "+jamkerja.getMulai());
            System.out.println("Mulai : "+jamkerja.getSelesai());
        }
    }
    
    @Test
    public void testInsert() throws Exception {
        JamKerja k = new JamKerja();
        k.setKode(new String());
        k.setNama(new String());
        k.setMulai(new Date());
        k.setSelesai(new Date());
        
        service.simpan(k);
    }
    
    @Test
    public void testUpdate() throws Exception {
        JamKerja k = new JamKerja();
        k.setKode(new String());
        k.setNama(new String());
        k.setMulai(new Date());
        k.setSelesai(new Date());
        
        service.simpan(k);
    }
}
