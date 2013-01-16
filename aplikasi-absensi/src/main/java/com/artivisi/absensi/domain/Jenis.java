/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author bebenpiko
 */
@Entity
@Table(name="t_jenis")
public class Jenis {
    
    @Id
    @GeneratedValue
    private Integer kode;
    
    @Column(name="nama")
    private String nama;
    
    @Column(name="denda_telat")
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
