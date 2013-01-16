/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.service.impl;

import com.artivisi.absensi.dao.hibernate.KehadiranDao;
import com.artivisi.absensi.domain.Kehadiran;
import com.artivisi.absensi.service.AplikasiAbsenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author endy
 */
@Service 
public class AplikasiAbsenServiceImpl implements AplikasiAbsenService {

    @Autowired
    private KehadiranDao kehadiranDao;
    
    @Transactional
    public void simpan(Kehadiran k) {
        kehadiranDao.simpan(k);
    }

    @Transactional(readOnly=true)
    public List<Kehadiran> cariSemuaKehadiran() {
        return kehadiranDao.cariSemuaKehadiran();
    }
    
}
