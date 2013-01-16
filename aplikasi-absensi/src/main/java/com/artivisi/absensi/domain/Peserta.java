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
import javax.persistence.Transient;

/**
 *
 * @author cak-ust
 */
@Entity
@Table(name="peserta")
public class Peserta {
    @Id 
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name="no_peserta", nullable=false)
    private String nomor;
    
    @Column(name="nama", nullable=false)
    private String nama;
    
    @Transient //variable yang dianggap bukan field table
    private String oldKode;

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
