package com.luan.clinicasradar.controller;


import com.luan.clinicasradar.service.ConvenioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convenio")
public class ConvenioController {

    private final ConvenioService convenioService;

    ConvenioController(ConvenioService convenioService){
        this.convenioService = convenioService;
    }

    @GetMapping("")
    public String getAll(){
        return  null;
    }



}
