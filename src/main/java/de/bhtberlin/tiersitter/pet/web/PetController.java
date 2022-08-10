package de.bhtberlin.tiersitter.pet.web;

import de.bhtberlin.tiersitter.person.data.Person;
import de.bhtberlin.tiersitter.person.web.PersonController;
import de.bhtberlin.tiersitter.pet.business.PetService;
import de.bhtberlin.tiersitter.pet.data.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pet")
@CrossOrigin(origins = "*")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> findAll() {
        return petService.findAll();
    }

    @GetMapping("/{id}")
    public Pet findById(@PathVariable int id) {
        return petService.findById(id);
    }

    @Autowired
    PersonController personController;

    @GetMapping("/findByOwner/{id}")
    public List<Pet> findByOwner(@PathVariable int id) {
        return petService.findByOwner(personController.findById(id));
    }

    @PostMapping
    public Pet createPet(@RequestBody Pet pet) {
        return petService.createPet(pet);
    }

    @PutMapping
    public Pet updatePet(@RequestBody Pet pet) { return petService.updatePet(pet); }

}
