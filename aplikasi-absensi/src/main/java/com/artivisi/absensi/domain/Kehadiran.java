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
public class Kehadiran {
    private Date jamMasuk;
    private Date jamPulang;

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
