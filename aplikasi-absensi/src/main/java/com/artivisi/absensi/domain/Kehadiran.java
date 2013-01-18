/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

/**
 *
 * @author endy
 */
@Entity // class ini ada padanannya di database
@Table(name="t_kehadiran") // kalau nama tabel != nama class, harus dijelaskan
public class Kehadiran {
    
    @Id // field ini adalah primary key
    @GeneratedValue // nilainya otomatis digenerate
    private Integer id;
    
    @NotNull
    @Past
    @Column(name="jam_masuk", nullable=false) // kalau nama kolom != nama variabel, harus dijelaskan
    @Temporal(TemporalType.TIMESTAMP) // khusus tipe data Date, harus dijelaskan apakah di database DATE, TIME, atau DATETIME
    private Date jamMasuk;
    
    @NotNull
    @Past
    @Column(name="jam_pulang", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date jamPulang;
    
    // relasi foreign key ke tabel peserta
    @NotNull
    @ManyToOne
    @JoinColumn(name="id_peserta", nullable=false) // penjelasan konfigurasi foreign key
    private Peserta peserta;
    
    private String keterangan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(Date jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public Date getJamPulang() {
        return jamPulang;
    }

    public void setJamPulang(Date jamPulang) {
        this.jamPulang = jamPulang;
    }

    public Peserta getPeserta() {
        return peserta;
    }

    public void setPeserta(Peserta peserta) {
        this.peserta = peserta;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    
}
