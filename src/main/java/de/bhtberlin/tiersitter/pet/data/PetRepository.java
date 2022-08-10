package de.bhtberlin.tiersitter.pet.data;

import de.bhtberlin.tiersitter.person.data.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findAll();
    Pet findById(long id);
    List<Pet> findByOwner(Person owner);
}
