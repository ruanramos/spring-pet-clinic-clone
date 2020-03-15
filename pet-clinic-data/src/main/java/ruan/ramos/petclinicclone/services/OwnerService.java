package ruan.ramos.petclinicclone.services;

import ruan.ramos.petclinicclone.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
