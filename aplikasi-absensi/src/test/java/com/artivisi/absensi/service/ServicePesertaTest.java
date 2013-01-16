/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.service;

import com.artivisi.absensi.domain.Peserta;
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
public class ServicePesertaTest {
    @Autowired
    private AplikasiAbsenService service;
    
    @Test
    public void cariSemua(){
        List<Peserta> hasilQuery = service.cariSemuaPeserta();
        System.out.println("Jumlah Record : "+hasilQuery.size());
        for (Peserta peserta : hasilQuery) {
            System.out.println("ID : "+peserta.getNomor());
            System.out.println("Nomor : "+peserta.getNomor());
            System.out.println("Nama : "+peserta.getNama());
        }
    }
    
    @Test
    public void simpan(){
        Peserta peserta=new Peserta();
        peserta.setNomor("0009");
        peserta.setNama("Indah");
        service.simpan(peserta);
    }
}
