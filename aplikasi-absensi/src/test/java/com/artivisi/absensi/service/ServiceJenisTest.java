/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.service;

import com.artivisi.absensi.domain.Jenis;
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
 * @author bebenpiko
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:com/artivisi/**/applicationContext.xml")

public class ServiceJenisTest {
    
    @Autowired
    private AplikasiAbsenService service;
    
    /**
     *
     * @throws Exception
     */
    @Test
    public void testCariSemua() throws Exception {
        List<Jenis> hasilQuery = service.cariSemuaJenis();
        System.out.println("Jenis : "+ hasilQuery.size());
        for (Jenis jenis : hasilQuery) {
            System.out.println("kode : "+ jenis.getKode());
            System.out.println("nama : "+jenis.getNama());
            System.out.println("denda telat : "+jenis.getDendaTelat());
            System.out.println("tarif lembur : "+jenis.getTarifLembur());
        }
    }
    @Test
    public void testInsert() throws Exception {
        Jenis z = new Jenis();
        // z.setKode(100); kalau di set berarti query yg dijalankan update
        z.setNama("benny");    
        service.simpan(z);
    }
    
   
   }
