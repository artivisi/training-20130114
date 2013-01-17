/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.artivisi.absensi.dao.hibernate;

import com.artivisi.absensi.domain.Peserta;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cak-ust
 */
@Repository("pesertaDaoHibernate")
public class PesertaDao {
    @Autowired
    private SessionFactory sessionFactory;
    public List<Peserta> tampilkanSemuaPeserta(){
        String hql="select p from Peserta p";
        List<Peserta> peserta=sessionFactory.getCurrentSession().createQuery(hql).list();
        
        return peserta;
    }
    
    public void simpan(Peserta p){
        sessionFactory.getCurrentSession().saveOrUpdate(p);
    }

    public Peserta cariById(Integer idPesertaInt) {
        return (Peserta) sessionFactory.getCurrentSession()
                .get(Peserta.class, idPesertaInt);
    }
    
}
