package ruan.ramos.petclinicclone.services;

import ruan.ramos.petclinicclone.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
