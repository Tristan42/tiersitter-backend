package de.bhtberlin.tiersitter.pet.data;

import de.bhtberlin.tiersitter.person.data.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String art;
    private Date dateOfBirth;
    // picture als Text
    @Lob
    private String picture;
    private String foodPreferences;
    private String medication;
    @ManyToOne
    Person owner;
}
