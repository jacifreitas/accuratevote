package com.jacifreitas.accuratevote.application.controllers;

import com.jacifreitas.accuratevote.domain.service.EnqueteService;
import com.jacifreitas.accuratevote.infra.entity.Enquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "enquete")
public class EnqueteController {
@Autowired
    private EnqueteService enqueteService;
    @PostMapping
    public ResponseEntity<Enquete> inserir(@RequestBody Enquete enquete){
        enquete = enqueteService.inserir(enquete);
        return ResponseEntity.ok(enquete);
    }
    @GetMapping
    public ResponseEntity<List<Enquete>> listar(){
        List<Enquete> lista = enqueteService.Listar();
        return ResponseEntity.ok(lista);
    }
}

