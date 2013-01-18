/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.service;

import com.artivisi.absensi.domain.JamKerja;
import com.artivisi.absensi.domain.Jenis;
import com.artivisi.absensi.domain.Kehadiran;
import com.artivisi.absensi.domain.Peserta;
import java.util.Date;
import java.util.List;

/**
 *
 * @author endy
 */
public interface AplikasiAbsenService {
    void simpan(Kehadiran k);
    List<Kehadiran> cariSemuaKehadiran();
    Kehadiran cariKehadiranById(Integer id);
    public List<Kehadiran> cariSemuaKehadiran(int start, int rows);
    public List<Kehadiran> cariKehadiranDalamPeriode(Date mulai, Date sampai, int start, int rows);
    
    void simpan(Jenis j);
    List<Jenis> cariSemuaJenis();
    
    void simpan(Peserta p);
    List<Peserta> cariSemuaPeserta();
    public Peserta cariPesertaById(Integer idPesertaInt);
    
    void simpan(JamKerja j);
    List<JamKerja> cariSemuaJamKerja();

    public List<Kehadiran> cariKehadiranPesertaByNamaDanPeriode(String nama, Date mulai, Date sampai, int start, int rows);

    public void hapus(Kehadiran k);

    

}
