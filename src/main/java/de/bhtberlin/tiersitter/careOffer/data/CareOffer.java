package de.bhtberlin.tiersitter.careOffer.data;

import de.bhtberlin.tiersitter.careRequest.data.CareRequest;
import de.bhtberlin.tiersitter.person.data.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CareOffer {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private CareRequest careRequest;
    @ManyToOne
    private Person offerer;
    private boolean accepted;

}
