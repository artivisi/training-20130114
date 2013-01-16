/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.hibernate;

import com.artivisi.absensi.domain.JamKerja;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Administrator
 */
@Repository("JamKerjaDao")
public class JamKerjaDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<JamKerja> cariSemuaJamKerja(){
        String hql = "select k from JamKerja k";
        List<JamKerja> hasil = sessionFactory.getCurrentSession()
                .createQuery(hql)
                .list();
        return hasil;
    }
    
    public void simpan(JamKerja k){
        sessionFactory.getCurrentSession().saveOrUpdate(k);
    }
}
