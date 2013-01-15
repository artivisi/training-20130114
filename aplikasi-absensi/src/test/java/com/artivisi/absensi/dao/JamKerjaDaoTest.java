/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao;

import com.artivisi.absensi.dao.jdbc.JamKerjaDao;
import com.artivisi.absensi.domain.JamKerja;
import com.artivisi.absensi.domain.Kehadiran;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:com/artivisi/**/applicationContext.xml")
public class JamKerjaDaoTest {
    
    @Autowired private JamKerjaDao kd;
    
    @Test
    public void testCariSemua() throws Exception {
        List<JamKerja> hasilQuery = kd.cariSemuaJamKerja();
        System.out.println("Jumlah Record : "+hasilQuery.size());
        for (JamKerja JamKerja : hasilQuery) {
            System.out.println("kode : "+JamKerja.getKode());
            System.out.println("nama : "+JamKerja.getNama());
            System.out.println("mulai : "+JamKerja.getMulai());
            System.out.println("selesai : "+JamKerja.getSelesai());
        }
    }
}

