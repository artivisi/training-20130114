/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao;

import com.artivisi.absensi.dao.jdbc.JenisDAO;
import com.artivisi.absensi.dao.jdbc.KehadiranDao;
import com.artivisi.absensi.domain.Jenis;
import com.artivisi.absensi.domain.Kehadiran;
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
public class JenisDaoTest {
    
    @Autowired private JenisDAO kd;
    @Test
    public void testCariSemua() throws Exception {
        List<Jenis> hasilQuery = kd.cariSemuaJenis();
        System.out.println("Jumlah Record : "+hasilQuery.size());
        for (Jenis jenis : hasilQuery) {
            System.out.println("kode : "+jenis.getKode());
            System.out.println("nama : "+jenis.getNama());
            System.out.println("denda telat : "+jenis.getDendaTelat());
            System.out.println("tarif lembur : "+jenis.getTarifLembur());
        }
    }
    
}
