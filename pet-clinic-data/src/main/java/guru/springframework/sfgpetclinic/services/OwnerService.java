package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.entities.Owner;

public interface OwnerService extends CrudService<Owner, Integer>{

    Owner findByLastName(String lastName);

}
