package de.bhtberlin.tiersitter.careOffer.business;

import de.bhtberlin.tiersitter.careOffer.data.CareOffer;
import de.bhtberlin.tiersitter.careOffer.data.CareOfferRepository;
import de.bhtberlin.tiersitter.careRequest.data.CareRequest;
import de.bhtberlin.tiersitter.person.data.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareOfferService {

    @Autowired
    private CareOfferRepository careOfferRepository;

    public CareOffer createCareOffer(CareOffer careOffer) { return careOfferRepository.save(careOffer); }

    public CareOffer findById(int id) { return careOfferRepository.findById((long) id); }
    public List<CareOffer> findAll() { return careOfferRepository.findAll(); }
    public List<CareOffer> findByOfferer(Person offerer) { return careOfferRepository.findByOfferer(offerer); }
    public List<CareOffer> findByCareRequest(CareRequest careRequest) { return careOfferRepository.findByCareRequest(careRequest); }

}
