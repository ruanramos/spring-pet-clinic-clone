package ruan.ramos.petclinicclone.services.map;

import ruan.ramos.petclinicclone.model.Owner;
import ruan.ramos.petclinicclone.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findaAll();
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
