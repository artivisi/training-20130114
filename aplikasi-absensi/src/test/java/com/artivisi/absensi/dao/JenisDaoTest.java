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

/**
 *
 * @author bebenpiko
 */
public class JenisDaoTest {
    
     @Test
    public void testCariSemua() throws Exception {
        JenisDAO kd = new JenisDAO();
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
