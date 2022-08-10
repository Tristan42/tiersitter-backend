package de.bhtberlin.tiersitter.person.business;

import de.bhtberlin.tiersitter.person.data.Person;
import de.bhtberlin.tiersitter.person.data.PersonRepository;
import de.bhtberlin.tiersitter.region.data.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findByUsername(String userName) {
        return personRepository.findByUserName(userName);
    }

    public Person findById(int id) {
        return personRepository.findById((long) id);
    }

    public List<Person> findByRegion(Region region) { return personRepository.findByRegion(region); }

}
