/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.hibernate;

import com.artivisi.absensi.domain.Jenis;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bebenpiko
 */
@Repository("jenisDaoHibernate")
public class JenisDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<Jenis> cariSemuaJenis(){
        String hql = "select z from Jenis z";
        List<Jenis> hasil = sessionFactory.getCurrentSession()
                .createQuery(hql)
                .list();
        return hasil;
    }
    
    public void simpan(Jenis z){
        sessionFactory.getCurrentSession().saveOrUpdate(z);
    }       
        
}
