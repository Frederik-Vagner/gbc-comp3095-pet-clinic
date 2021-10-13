package ca.gbc.comp3095.gbccomp3095petclinic.services;

import ca.gbc.comp3095.gbccomp3095petclinic.model.Owner;

import java.util.Set;

public interface CRUDService<T, ID> {

    T findById(ID id);
    T save(T owner);
    Set<Owner> findAll();
    void delete(T object);
    void deleteById(ID id);
}
