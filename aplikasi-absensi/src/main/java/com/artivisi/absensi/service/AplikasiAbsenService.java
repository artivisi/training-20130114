/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.service;

import com.artivisi.absensi.domain.Kehadiran;
import java.util.List;

/**
 *
 * @author endy
 */
public interface AplikasiAbsenService {
    void simpan(Kehadiran k);
    List<Kehadiran> cariSemuaKehadiran();
}
