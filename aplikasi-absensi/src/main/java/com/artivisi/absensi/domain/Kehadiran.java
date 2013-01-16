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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    
    @Column(name="jam_masuk", nullable=false) // kalau nama kolom != nama variabel, harus dijelaskan
    @Temporal(TemporalType.TIMESTAMP) // khusus tipe data Date, harus dijelaskan apakah di database DATE, TIME, atau DATETIME
    private Date jamMasuk;
    
    @Column(name="jam_pulang", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date jamPulang;
    
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
    
    
}
