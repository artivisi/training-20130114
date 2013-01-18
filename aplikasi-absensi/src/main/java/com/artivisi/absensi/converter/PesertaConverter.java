/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.converter;

import com.artivisi.absensi.domain.Peserta;
import com.artivisi.absensi.service.AplikasiAbsenService;
import java.beans.PropertyEditorSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author endy
 */
public class PesertaConverter extends PropertyEditorSupport {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private AplikasiAbsenService service;

    public PesertaConverter(AplikasiAbsenService service) {
        this.service = service;
    }
    
    @Override
    public void setAsText(String idPesertaString) throws IllegalArgumentException {
        try {
            Integer idPesertaInt = Integer.valueOf(idPesertaString);
            Peserta p = service.cariPesertaById(idPesertaInt);
            setValue(p);
        } catch (Exception err){
            logger.warn(err.getMessage(), err);
            setValue(null);
        }
    }
    
}
