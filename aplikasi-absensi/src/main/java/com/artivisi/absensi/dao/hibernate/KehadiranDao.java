/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.hibernate;

import com.artivisi.absensi.domain.Kehadiran;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author endy
 */
@Repository("kehadiranDaoHibernate")
public class KehadiranDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<Kehadiran> cariSemuaKehadiran(){
        String hql = "select k from Kehadiran k join fetch k.peserta";
        List<Kehadiran> hasil = sessionFactory.getCurrentSession()
                .createQuery(hql)
                .list();
        return hasil;
    }
    
    public void simpan(Kehadiran k){
        sessionFactory.getCurrentSession().saveOrUpdate(k);
    }
}
