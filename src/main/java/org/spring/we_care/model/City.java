package org.spring.we_care.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne
    private States state;

    public City() {
    }

    public City(String name, States state) {
        this.name = name;
        this.state = state;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return States return the state
     */
    public States getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(States state) {
        this.state = state;
    }

}