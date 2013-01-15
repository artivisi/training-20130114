/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.domain;

/**
 *
 * @author bebenpiko
 */
public class Jenis {
    private Integer kode;
    private String nama;
    private Integer dendaTelat;
    private Integer tarifLembur;

    public Integer getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public Integer getDendaTelat() {
        return dendaTelat;
    }

    public Integer getTarifLembur() {
        return tarifLembur;
    }

    
    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDendaTelat(Integer dendaTelat) {
        this.dendaTelat = dendaTelat;
    }

    public void setTarifLembur(Integer tarifLembur) {
        this.tarifLembur = tarifLembur;
    }
    
         
    
}
