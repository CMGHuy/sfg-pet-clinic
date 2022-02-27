package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.entities.Owner;
import guru.springframework.sfgpetclinic.entities.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(int id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
