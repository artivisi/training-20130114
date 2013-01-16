/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.service;

import com.artivisi.absensi.domain.Kehadiran;
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
public class ServiceKehadiranTest {
    
    @Autowired
    private AplikasiAbsenService service;
    
    @Test
    public void testCariSemua() throws Exception {
        List<Kehadiran> hasilQuery = service.cariSemuaKehadiran();
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
        
        service.simpan(k);
    }
    
    @Test
    public void testUpdate() throws Exception {
        Kehadiran k = new Kehadiran();
        k.setId(1);
        k.setJamMasuk(new Date());
        k.setJamPulang(new Date());
        
        service.simpan(k);
    }
}
