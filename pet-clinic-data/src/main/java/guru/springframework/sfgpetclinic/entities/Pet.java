package guru.springframework.sfgpetclinic.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet extends BaseEntity {

    private String firstName;

    private String lastName;

    private PetType petType;

    private Owner owner;

}
