package com.jacifreitas.accuratevote.domain.service;

import com.jacifreitas.accuratevote.infra.entity.Enquete;
import com.jacifreitas.accuratevote.infra.repository.EnqueteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class EnqueteService {
        @Autowired
        private EnqueteRepository repository;

        public Enquete inserir(Enquete enquete){
            return repository.save(enquete);
        }

         public List<Enquete> Listar(){
         return repository.findAll();
    }

}

