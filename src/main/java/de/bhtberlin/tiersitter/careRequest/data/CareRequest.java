package de.bhtberlin.tiersitter.careRequest.data;

import de.bhtberlin.tiersitter.person.data.Person;
import de.bhtberlin.tiersitter.pet.data.Pet;
import de.bhtberlin.tiersitter.region.data.Region;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class CareRequest {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Pet pet;
    private Date postDate;
    private Date startDate;
    private Date endDate;
    private Boolean active;
    private String description;

}
