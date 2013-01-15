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
    private Double dendaTelat;
    private Double tarifLembur;

    public Integer getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public Double getDendaTelat() {
        return dendaTelat;
    }

    public Double getTarifLembur() {
        return tarifLembur;
    }

    
    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDendaTelat(Double dendaTelat) {
        this.dendaTelat = dendaTelat;
    }

    public void setTarifLembur(Double tarifLembur) {
        this.tarifLembur = tarifLembur;
    }
    
         
    
}
