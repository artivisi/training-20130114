/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.service;

import com.artivisi.absensi.domain.JamKerja;
import com.artivisi.absensi.domain.Jenis;
import com.artivisi.absensi.domain.Kehadiran;
import com.artivisi.absensi.domain.Peserta;
import java.util.List;

/**
 *
 * @author endy
 */
public interface AplikasiAbsenService {
    void simpan(Kehadiran k);
    List<Kehadiran> cariSemuaKehadiran();
    
    void simpan(Jenis j);
    List<Jenis> cariSemuaJenis();
    
    void simpan(Peserta p);
    List<Peserta> cariSemuaPeserta();
    
    void simpan(JamKerja j);
    List<JamKerja> cariSemuaJamKerja();
}
