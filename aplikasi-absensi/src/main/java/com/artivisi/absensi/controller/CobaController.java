/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.absensi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author endy
 */
@Controller
public class CobaController {
    
    @RequestMapping("/halo")
    @ResponseBody
    public String halo(@RequestParam(required=false) String nama){
        return "Halo "+nama;
    }
}
