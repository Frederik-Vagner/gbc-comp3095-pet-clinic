package ca.gbc.comp3095.gbccomp3095petclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate birthdate;

}
