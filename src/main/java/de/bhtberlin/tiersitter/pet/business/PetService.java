package de.bhtberlin.tiersitter.pet.business;

import de.bhtberlin.tiersitter.person.data.Person;
import de.bhtberlin.tiersitter.pet.data.Pet;
import de.bhtberlin.tiersitter.pet.data.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public Pet createPet(Pet pet) { return petRepository.save(pet); }

    public Pet findById(int id) {
        return petRepository.findById((long) id);
    }

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public List<Pet> findByOwner(Person owner) {
        return petRepository.findByOwner(owner);
    }

    public Pet updatePet(Pet pet) { return petRepository.save(pet); }
}
