package ca.gbc.comp3095.gbccomp3095petclinic.services;

import ca.gbc.comp3095.gbccomp3095petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastname(String lastname);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
