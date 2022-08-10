package de.bhtberlin.tiersitter.region.business;

import de.bhtberlin.tiersitter.region.data.Region;
import de.bhtberlin.tiersitter.region.data.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public Region createRegion(Region region) {
        return regionRepository.save(region);
    }

    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    public Region findById(int id) {
        return regionRepository.findById((long) id);
    }

    public Region findByCityName(String cityName) {
        return regionRepository.findByCityName(cityName);
    }

}
