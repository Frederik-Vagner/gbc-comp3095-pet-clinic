package ca.gbc.comp3095.gbccomp3095petclinic.services.map;

import ca.gbc.comp3095.gbccomp3095petclinic.model.Owner;
import ca.gbc.comp3095.gbccomp3095petclinic.model.Pet;
import ca.gbc.comp3095.gbccomp3095petclinic.services.CRUDService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CRUDService<Pet, Long> {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }
}
