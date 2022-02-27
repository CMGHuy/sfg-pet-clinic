package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.entities.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(int id);

    Owner save(int id);

    Set<Owner> findAll();

}
