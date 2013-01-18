/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.dao.hibernate;

import com.artivisi.absensi.domain.Kehadiran;
import java.util.Date;
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

    public List<Kehadiran> cariSemuaKehadiran(int start, int rows) {
        String hql = "select k from Kehadiran k join fetch k.peserta";
        List<Kehadiran> hasil = sessionFactory.getCurrentSession()
                .createQuery(hql)
                .setFirstResult(start)
                .setMaxResults(rows)
                .list();
        return hasil;
    }

    public List<Kehadiran> cariKehadiranDalamPeriode(Date mulai, Date sampai, int start, int rows) {
        String hql = "select k from Kehadiran k join fetch k.peserta "
                + "where k.jamMasuk between :mulai and :sampai ";
        List<Kehadiran> hasil = sessionFactory.getCurrentSession()
                .createQuery(hql)
                .setParameter("mulai", mulai)
                .setParameter("sampai", sampai)
                .setFirstResult(start)
                .setMaxResults(rows)
                .list();
        return hasil;
    }

    public List<Kehadiran> cariKehadiranPesertaByNamaDanPeriode(String nama, Date mulai, Date sampai, int start, int rows) {
        String hql = "select k from Kehadiran k join fetch k.peserta "
                + "where k.jamMasuk between :mulai and :sampai "
                + "and k.peserta.nama like :nama order by k.jamMasuk ";
        List<Kehadiran> hasil = sessionFactory.getCurrentSession()
                .createQuery(hql)
                .setParameter("mulai", mulai)
                .setParameter("sampai", sampai)
                .setParameter("nama", "%"+nama+"%")
                .setFirstResult(start)
                .setMaxResults(rows)
                .list();
        return hasil;
    }

	public Kehadiran cariById(Integer id) {
		return (Kehadiran) sessionFactory.getCurrentSession()
				.get(Kehadiran.class, id);
	}
}
