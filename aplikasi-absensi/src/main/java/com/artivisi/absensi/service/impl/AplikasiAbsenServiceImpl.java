/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.service.impl;

import com.artivisi.absensi.dao.hibernate.JenisDao;
import com.artivisi.absensi.dao.hibernate.KehadiranDao;
import com.artivisi.absensi.dao.hibernate.PesertaDao;
import com.artivisi.absensi.domain.JamKerja;
import com.artivisi.absensi.domain.Jenis;
import com.artivisi.absensi.domain.Kehadiran;
import com.artivisi.absensi.domain.Peserta;
import com.artivisi.absensi.service.AplikasiAbsenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author endy
 */
@Service 
public class AplikasiAbsenServiceImpl implements AplikasiAbsenService {

    @Autowired
    private KehadiranDao kehadiranDao;
    
    @Autowired
    private PesertaDao pesertaDao;
    
    @Autowired
    private JenisDao jenisDao;
    
    @Transactional
    public void simpan(Kehadiran k) {
        kehadiranDao.simpan(k);
    }

    @Transactional(readOnly=true)
    public List<Kehadiran> cariSemuaKehadiran() {
        return kehadiranDao.cariSemuaKehadiran();
    }
    @Transactional    
    public void simpan(Jenis z) {
        jenisDao.simpan(z);
    }
    
    @Transactional
    public List<Jenis> cariSemuaJenis() {
        return jenisDao.cariSemuaJenis();
    }

    @Transactional
    public void simpan(Peserta p) {
        pesertaDao.simpan(p);
    }

    @Transactional(readOnly=true)
    public List<Peserta> cariSemuaPeserta() {
        return pesertaDao.tampilkanSemuaPeserta();
    }

    public void simpan(JamKerja j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<JamKerja> cariSemuaJamKerja() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
