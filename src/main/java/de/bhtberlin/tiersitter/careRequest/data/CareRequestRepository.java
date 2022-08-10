package de.bhtberlin.tiersitter.careRequest.data;

import de.bhtberlin.tiersitter.person.data.Person;
import de.bhtberlin.tiersitter.pet.data.Pet;
import de.bhtberlin.tiersitter.region.data.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CareRequestRepository extends JpaRepository<CareRequest, Long> {

    CareRequest findById(long id);
    List<CareRequest> findByPet(Pet pet);
    List<CareRequest> findByPetOwnerRegionId(long id);
    List<CareRequest> findByPetOwner(Person owner);
    List<CareRequest> findByActive(boolean active);
    List<CareRequest> findAll();
}
