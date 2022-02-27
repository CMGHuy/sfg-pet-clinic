package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.entities.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(int id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
