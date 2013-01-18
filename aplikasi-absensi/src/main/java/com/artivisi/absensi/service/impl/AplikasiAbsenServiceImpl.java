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
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author endy
 */
@Service @Transactional
public class AplikasiAbsenServiceImpl implements AplikasiAbsenService {

    @Autowired
    private KehadiranDao kehadiranDao;
    @Autowired
    private PesertaDao pesertaDao;
    @Autowired
    private JenisDao jenisDao;

    public void simpan(Kehadiran k) {
        kehadiranDao.simpan(k);
    }

    @Transactional(readOnly = true)
    public List<Kehadiran> cariSemuaKehadiran() {
        return kehadiranDao.cariSemuaKehadiran();
    }

    public void simpan(Jenis z) {
        jenisDao.simpan(z);
    }

    public List<Jenis> cariSemuaJenis() {
        return jenisDao.cariSemuaJenis();
    }

    public void simpan(Peserta p) {
        pesertaDao.simpan(p);
    }

    @Transactional(readOnly = true)
    public List<Peserta> cariSemuaPeserta() {
        return pesertaDao.tampilkanSemuaPeserta();
    }

    public void simpan(JamKerja j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<JamKerja> cariSemuaJamKerja() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Kehadiran> cariSemuaKehadiran(int start, int rows) {
        return kehadiranDao.cariSemuaKehadiran(start, rows);
    }

    public List<Kehadiran> cariKehadiranDalamPeriode(Date mulai, Date sampai, int start, int rows) {
        return kehadiranDao.cariKehadiranDalamPeriode(mulai, sampai, start, rows);
    }

    public List<Kehadiran> cariKehadiranPesertaByNamaDanPeriode(String nama, Date mulai, Date sampai, int start, int rows) {
        return kehadiranDao.cariKehadiranPesertaByNamaDanPeriode(nama, mulai, sampai, start, rows);
    }

    public Peserta cariPesertaById(Integer idPesertaInt) {
        return pesertaDao.cariById(idPesertaInt);
    }

    public Kehadiran cariKehadiranById(Integer id) {
        if (id == null) {
            return null;
        }
        return kehadiranDao.cariById(id);
    }

    public void hapus(Kehadiran k) {
        kehadiranDao.hapus(k);
    }
}
