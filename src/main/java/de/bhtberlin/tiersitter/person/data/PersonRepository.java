package de.bhtberlin.tiersitter.person.data;

import de.bhtberlin.tiersitter.region.data.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findById(long id);
    Person findByUserName(String userName);
    List<Person> findByRegion(Region region);

}
