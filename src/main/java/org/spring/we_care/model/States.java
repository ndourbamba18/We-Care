package org.spring.we_care.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class States {
    
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private List<City> cities;

    private Country country;
}