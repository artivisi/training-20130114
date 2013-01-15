/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.domain;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class JamKerja {
    private String kode;
    private String nama;
    private Date mulai;
    private Date selesai;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Date getMulai() {
        return mulai;
    }

    public void setMulai(Date mulai) {
        this.mulai = mulai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getSelesai() {
        return selesai;
    }

    public void setSelesai(Date selesai) {
        this.selesai = selesai;
    }
    
               
}
