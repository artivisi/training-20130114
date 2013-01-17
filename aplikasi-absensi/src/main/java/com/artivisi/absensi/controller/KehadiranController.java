/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.controller;

import com.artivisi.absensi.domain.Kehadiran;
import com.artivisi.absensi.service.AplikasiAbsenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author endy
 */
@Controller
public class KehadiranController {
    @Autowired
    private AplikasiAbsenService service;
    
    @RequestMapping("/kehadiran/list")
    public ModelMap daftarKehadiran(){
        ModelMap mm = new ModelMap();
        
        List<Kehadiran> data = service.cariSemuaKehadiran();
        mm.addAttribute("daftarKehadiran", data);
        System.out.println("Jumlah data : "+data.size());
        
        return mm;
    }
}
