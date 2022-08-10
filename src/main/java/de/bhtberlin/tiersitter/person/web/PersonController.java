package de.bhtberlin.tiersitter.person.web;

import de.bhtberlin.tiersitter.person.business.PersonService;
import de.bhtberlin.tiersitter.person.data.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
@CrossOrigin(origins = "*")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public Person findById(@PathVariable int id) {
        return personService.findById(id);
    }

    @GetMapping("")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/find/{userName}")
    public Person findByUserName(@PathVariable String userName) {
        return personService.findByUsername(userName);
    }

    @PostMapping("")
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    //localhost..../api/person?id=1
    //localhost..../api/person?username=YOLO

}
