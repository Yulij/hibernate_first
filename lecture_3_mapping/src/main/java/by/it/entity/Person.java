package by.it.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import by.it.component.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private Integer age;
    @Column
    private String name;
    @Column
    private String surname;

    @Embedded
    private Address address;
}

