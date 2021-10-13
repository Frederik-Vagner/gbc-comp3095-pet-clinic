package ca.gbc.comp3095.gbccomp3095petclinic.services;

import ca.gbc.comp3095.gbccomp3095petclinic.model.Owner;

import java.util.Set;

public interface CRUDService<T, ID> {

    T findById(ID ID);
    T save(T ID);
    Set<T> findAll();
    void delete(T ID);
    void deleteById(ID ID);
}
