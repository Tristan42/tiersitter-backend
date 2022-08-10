package de.bhtberlin.tiersitter.region.web;

import de.bhtberlin.tiersitter.region.business.RegionService;
import de.bhtberlin.tiersitter.region.data.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/region")
@CrossOrigin(origins = "*")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/{id}")
    public Region findById(@PathVariable int id) {
        return regionService.findById(id);
    }

    @GetMapping("/named/{cityName}")
    public Region findByCityName(@PathVariable String cityName) {
        return regionService.findByCityName(cityName);
    }

    @GetMapping()
    public List<Region> findAll() {
        return regionService.findAll();
    }

    @PostMapping()
    public Region createRegion(@RequestBody Region region) {
        return regionService.createRegion(region);
    }

}
