package de.bhtberlin.tiersitter.region.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    Region findByCityName(String cityName);
    Region findById(long id);
    List<Region> findAll();

}
