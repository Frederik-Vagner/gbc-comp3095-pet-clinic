package ca.gbc.comp3095.gbccomp3095petclinic.services.map;

import ca.gbc.comp3095.gbccomp3095petclinic.model.Owner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {


    protected Map<ID, T> map = new HashMap<>();



    T findById(ID id){
        return map.get(id);
    }


    T save(ID id, T object){
        map.put(id, object);
        return object;
    }


    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }


    void deleteById(ID id){
        map.remove(id);
    }


}
