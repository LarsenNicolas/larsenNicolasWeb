package com.nicolaslarsen.nicolaslarsen.controller;

import com.nicolaslarsen.nicolaslarsen.model.Dossier;
import com.nicolaslarsen.nicolaslarsen.model.DossierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dossier")
public class DossierController {

    @Autowired
    private DossierRepository dossierRepository;

    @GetMapping
    public List<Dossier> findAllDosser() {
        return (List<Dossier>) dossierRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dossier> findUserById(@PathVariable(value = "id") long id) {
        Optional<Dossier> dossier = dossierRepository.findById(id);

        if (dossier.isPresent()) {
            return ResponseEntity.ok().body(dossier.get());
        } else {
            return  ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Dossier saveUser(@Validated @RequestBody Dossier dossier) {
        return dossierRepository.save(dossier);
    }
}
