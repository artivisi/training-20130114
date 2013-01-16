/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.domain;

/**
 *
 * @author cak-ust
 */
public class Peserta {
    private String nomor;
    private String nama;
    public String oldKode;

    public String getNomor() {
        return nomor;
    }

    public String getOldKode() {
        return oldKode;
    }

    public void setGetOldKode(String getOldKode) {
        this.oldKode = getOldKode;
    }

    public void setNomor(String no) {
        this.nomor = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
