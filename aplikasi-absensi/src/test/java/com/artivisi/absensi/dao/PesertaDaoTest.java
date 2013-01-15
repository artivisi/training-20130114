/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao;

import com.artivisi.absensi.dao.jdbc.KehadiranDao;
import com.artivisi.absensi.dao.jdbc.PesertaDao;
import com.artivisi.absensi.domain.Kehadiran;
import com.artivisi.absensi.domain.Peserta;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author cak-ust
 */
public class PesertaDaoTest {
    @Test
    public void testCariSemua() throws Exception {
        PesertaDao kd = new PesertaDao();
        List<Peserta> hasilQuery = kd.cariSemuaKehadiran();
        System.out.println("Jumlah Record : "+hasilQuery.size());
        for (Peserta kehadiran : hasilQuery) {
            System.out.println("No Peserta : "+kehadiran.getNomor());
            System.out.println("Nama : "+kehadiran.getNama());
            
        }
    }
}
