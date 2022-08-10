package de.bhtberlin.tiersitter.person.data;

import com.sun.istack.NotNull;
import de.bhtberlin.tiersitter.region.data.Region;
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
public class Person {

    public Person(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String userName;

    @NotNull
    private String password;

    @ManyToOne
    private Region region;

}
