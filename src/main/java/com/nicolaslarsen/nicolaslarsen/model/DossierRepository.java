package com.nicolaslarsen.nicolaslarsen.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierRepository extends CrudRepository<Dossier, Long> {

}
