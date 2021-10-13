package ca.gbc.comp3095.gbccomp3095petclinic.services;

import ca.gbc.comp3095.gbccomp3095petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CRUDService<Owner, Long> {

    Owner findByLastname(String lastname);

}
