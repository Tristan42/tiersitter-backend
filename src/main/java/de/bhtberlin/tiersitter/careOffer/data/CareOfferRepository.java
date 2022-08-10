package de.bhtberlin.tiersitter.careOffer.data;

import de.bhtberlin.tiersitter.careRequest.data.CareRequest;
import de.bhtberlin.tiersitter.person.data.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CareOfferRepository extends JpaRepository<CareOffer, Long> {

    CareOffer findById(long id);
    List<CareOffer> findByCareRequest(CareRequest careRequest);
    List<CareOffer> findByOfferer(Person offerer);

}
