package de.bhtberlin.tiersitter.careRequest.business;

import de.bhtberlin.tiersitter.careRequest.data.CareRequest;
import de.bhtberlin.tiersitter.careRequest.data.CareRequestRepository;
import de.bhtberlin.tiersitter.person.data.Person;
import de.bhtberlin.tiersitter.region.data.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareRequestService {

    @Autowired
    private CareRequestRepository careRequestRepository;

    public CareRequest createCareRequest(CareRequest careRequest) {
        return careRequestRepository.save(careRequest);
    }

    public CareRequest findById(int id) { return careRequestRepository.findById((long) id); }
    public List<CareRequest> findAll() { return careRequestRepository.findAll(); }
    public List<CareRequest> findByPetOwner(Person owner) { return careRequestRepository.findByPetOwner(owner); }
    public List<CareRequest> findByPetOwnerRegionId(int id) { return careRequestRepository.findByPetOwnerRegionId((long) id); }
    public List<CareRequest> findActive(boolean active) { return careRequestRepository.findByActive(active); }

}
