package de.bhtberlin.tiersitter.careRequest.web;

import de.bhtberlin.tiersitter.careRequest.business.CareRequestService;
import de.bhtberlin.tiersitter.careRequest.data.CareRequest;
import de.bhtberlin.tiersitter.person.data.Person;
import de.bhtberlin.tiersitter.person.web.PersonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/careRequest")
@CrossOrigin(origins = "*")
public class CareRequestController {

    @Autowired
    private CareRequestService careRequestService;

    @GetMapping()
    public List<CareRequest> findAll() {
        return careRequestService.findAll();
    }

    @GetMapping("/{id}")
    public CareRequest findById(@PathVariable int id) {
        return careRequestService.findById(id);
    }

    @Autowired
    private PersonController personController;

    @GetMapping("/byOwner/{id}")
    public List<CareRequest> findByPetOwner(@PathVariable int id) {
        Person owner = personController.findById(id);
        return careRequestService.findByPetOwner(owner);
    }

    @GetMapping("/findByRegion/{id}")
    public List<CareRequest> findByPetOwnerRegionId(@PathVariable int id) {
        return careRequestService.findByPetOwnerRegionId(id);
    }

    @GetMapping("/active")
    public List<CareRequest> findActive() {
        return careRequestService.findActive(true);
    }

    @PostMapping
    public CareRequest createRegion(@RequestBody CareRequest careRequest) {
        return careRequestService.createCareRequest(careRequest);
    }

}
