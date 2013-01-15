/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.domain;

import java.util.Date;

/**
 *
 * @author endy
 */
public class Ketidakhadiran {
    private Peserta peserta;
    private Date tanggal;
    private String alasan;
    private JenisAbsen jenisAbsen;

    public Peserta getPeserta() {
        return peserta;
    }

    public void setPeserta(Peserta peserta) {
        this.peserta = peserta;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public JenisAbsen getJenisAbsen() {
        return jenisAbsen;
    }

    public void setJenisAbsen(JenisAbsen jenisAbsen) {
        this.jenisAbsen = jenisAbsen;
    }
    
    
}
