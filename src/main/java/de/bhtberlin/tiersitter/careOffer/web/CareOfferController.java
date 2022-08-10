package de.bhtberlin.tiersitter.careOffer.web;

import de.bhtberlin.tiersitter.careOffer.business.CareOfferService;
import de.bhtberlin.tiersitter.careOffer.data.CareOffer;
import de.bhtberlin.tiersitter.person.data.Person;
import de.bhtberlin.tiersitter.person.web.PersonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/careOffer")
@CrossOrigin(origins = "*")
public class CareOfferController {

    @Autowired
    private CareOfferService careOfferService;

    @GetMapping
    public List<CareOffer> findAll() {
        return careOfferService.findAll();
    }

    @GetMapping("/{id}")
    public CareOffer findById(@PathVariable int id) {
        return careOfferService.findById(id);
    }

    @Autowired
    private PersonController personController;

    @GetMapping("/getByUser/{id}")
    public List<CareOffer> getbyUser(@PathVariable int id) {
        Person offerer = personController.findById(id);
        return careOfferService.findByOfferer(offerer);
    }
}
