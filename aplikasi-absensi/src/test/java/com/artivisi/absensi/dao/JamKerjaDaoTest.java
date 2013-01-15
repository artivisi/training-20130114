/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao;

import com.artivisi.absensi.domain.JamKerja;
import com.artivisi.absensi.domain.Kehadiran;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class JamKerjaDaoTest {
    
    @Test
    public void testCariSemua() throws Exception {
        JamKerjaDaoTest kd = new JamKerjaDaoTest();
        List<JamKerja> hasilQuery = kd.cariSemuaJamKerja();
        System.out.println("Jumlah Record : "+hasilQuery.size());
        for (JamKerja JamKerja : hasilQuery) {
            System.out.println("kode : "+JamKerja.getKode();
            System.out.println("nama : "+JamKerja.getNama());
            System.out.println("mulai : "+JamKerja.getMulai());
            System.out.println("selesai : "+JamKerja.getSelesai());
        }
    }
}

